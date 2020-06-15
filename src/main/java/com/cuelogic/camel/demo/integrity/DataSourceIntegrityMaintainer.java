package com.cuelogic.camel.demo.integrity;

import java.io.InputStream;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

import javax.crypto.Cipher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceIntegrityMaintainer {
    private static final Logger LOG = LoggerFactory.getLogger(DataSourceIntegrityMaintainer.class);

    public static void main(String... argv) throws Exception {
//        First either generate a public/private key pair or use an existing key pair 
//        KeyPair pair = generateKeyPair();
        KeyPair pair = getKeyPairFromKeyStore();

        //Our secret message
        String message = "My gmail password is P@ssw0rd!";

        //Generate message hash so that it's shorter to encrypt
        String messageHash = generateMD5Digest(message);

        //Encrypt the message
//        String cipherText = encrypt(messageHash, pair.getPrivate());

        //Now decrypt it
//        String decipheredMessage = decrypt(cipherText, pair.getPublic());

//        System.out.println(decipheredMessage);

        //Let's sign our message
        String signature = sign(message, pair.getPrivate());

        //Let's check the signature
        boolean isCorrect = verify(message, signature, pair.getPublic());
        LOG.info("Is signature correct for "+message+" : " + isCorrect);

        String tamperedString = "any random characters or even a space";
        message = message+tamperedString;
        isCorrect = verify(message, signature, pair.getPublic());
        LOG.info("Is signature correct for "+message+" : " + isCorrect);
    }

//    private KeyPair generateKeyPair() {
//        LOG.info("Generating KeyPair");
//        KeyPairGenerator generator;
//        KeyPair pair = null;
//        Integer keysize = 1024; //higher the value, more the compute required
//        try {
//            generator = KeyPairGenerator.getInstance("RSA");
//            generator.initialize(keysize, new SecureRandom());
//            pair = generator.generateKeyPair();
//            LOG.info("Private key = "+pair.getPrivate().toString());
//            LOG.info("Public key = "+pair.getPublic().toString());
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }        
//        return pair;
//    }
    
    public static KeyPair getKeyPairFromKeyStore() {
        //Generated with:
        //  keytool -genkeypair -alias hhsvyp -storepass hhsvyp -keypass hhsvyp -keyalg RSA -keystore vyp.jks
        // How to view .jks file or use Keystore Explorer utility:
//        keytool -list -v -keystore vyp.jks -storepass <password>
        PublicKey publicKey = null;
        PrivateKey privateKey = null;
        String keyStoreFileLocation = "/vyp.jks";
        try {
            InputStream ins = DataSourceIntegrityMaintainer.class.getResourceAsStream(keyStoreFileLocation);

            KeyStore keyStore = KeyStore.getInstance("jks");
            keyStore.load(ins, "hhsvyp".toCharArray());   //Keystore password
            KeyStore.PasswordProtection keyPassword = new KeyStore.PasswordProtection("hhsvyp".toCharArray());

            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("hhsvyp", keyPassword);

            java.security.cert.Certificate cert = keyStore.getCertificate("hhsvyp");
            publicKey = cert.getPublicKey();
            privateKey = privateKeyEntry.getPrivateKey();
        } catch(Exception e) {
            e.printStackTrace();
        }
        LOG.debug("Public key from jks file "+publicKey);
        LOG.debug("Private key from jks file "+privateKey);
        return new KeyPair(publicKey, privateKey);
    }

    public static String generateMD5Digest(String msg) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        md.update(msg.getBytes());
        byte[] digest = md.digest();
        LOG.debug("Digest for `"+msg+"` = "+digest);

        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<digest.length;i++) {
           hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        LOG.debug("Digest for `"+msg+"` in hex format : " + hexString.toString());
        return hexString.toString();
    }

//    public static String encrypt(String plainText, PrivateKey privateKey) throws Exception {
//        Cipher encryptCipher = Cipher.getInstance("RSA");
//        encryptCipher.init(Cipher.ENCRYPT_MODE, privateKey);
//        byte[] cipherText = encryptCipher.doFinal(plainText.getBytes("UTF-8"));
//        return Base64.getEncoder().encodeToString(cipherText);
//    }
//
//    public static String decrypt(String cipherText, PublicKey publicKey) throws Exception {
//        byte[] bytes = Base64.getDecoder().decode(cipherText);
//        Cipher decriptCipher = Cipher.getInstance("RSA");
//        decriptCipher.init(Cipher.DECRYPT_MODE, publicKey);
//        return new String(decriptCipher.doFinal(bytes), "UTF-8");
//    }

    public static String sign(String plainText, PrivateKey privateKey) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(privateKey);
        privateSignature.update(plainText.getBytes("UTF-8"));
        byte[] signature = privateSignature.sign();

        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<signature.length;i++) {
           hexString.append(Integer.toHexString(0xFF & signature[i]));
        }
        LOG.debug("Signature HEX = "+hexString);
        LOG.debug("Signature String = "+Base64.getEncoder().encodeToString(signature));

        return Base64.getEncoder().encodeToString(signature);
    }

    public static boolean verify(String plainText, String signature, PublicKey publicKey) throws Exception {
        boolean verifyStatus = false;
        try {
            Signature publicSignature = Signature.getInstance("SHA256withRSA");
            publicSignature.initVerify(publicKey);
            publicSignature.update(plainText.getBytes("UTF-8"));
            byte[] signatureBytes = Base64.getDecoder().decode(signature);
            verifyStatus = publicSignature.verify(signatureBytes);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return verifyStatus;
    }

}
