package com.cuelogic.camel.demo.integrity;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceIntegrityMaintainer {
    private static final Logger LOG = LoggerFactory.getLogger(DataSourceIntegrityMaintainer.class);
    
    String sentMsg;
    String receivedMsg;
    
    PrivateKey privKey;
    PublicKey publicKey;
    
    public DataSourceIntegrityMaintainer() throws NoSuchAlgorithmException {
        generateKeyPair();
        this.setSentMsg("I Love Java");
//        this.setReceivedMsg("I love Java");
    }
    
    public String getReceivedMsg() {
        return receivedMsg;
    }

    public void setReceivedMsg(String receivedMsg) {
        LOG.info("Setting received msg as "+receivedMsg);
        this.receivedMsg = receivedMsg;
    }

    public String getSentMsg() {
        return sentMsg;
    }

    public void setSentMsg(String sentMsg) {
        LOG.info("Setting sent msg as "+sentMsg);
        this.sentMsg = sentMsg;
    }

    public PrivateKey getPrivKey() {
        return privKey;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    private void generateKeyPair() throws NoSuchAlgorithmException {
        LOG.info("Generating KeyPair");
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024, new SecureRandom());

        KeyPair pair = generator.generateKeyPair();

        this.privKey = pair.getPrivate();
        this.publicKey = pair.getPublic();

        LOG.info("Private key = "+privKey.toString());
        LOG.info("Public key = "+publicKey.toString());
    }

    public void generateMsgDigest(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(msg.getBytes());
        byte[] digest = md.digest();
        LOG.info("Digest for `"+msg+"` = "+digest);

        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<digest.length;i++) {
           hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        LOG.info("Digest for `"+msg+"` in hex format : " + hexString.toString());
    }

    public void signMsg(String msg) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        // TODO Auto-generated method stub
        Signature sign = Signature.getInstance("SHA256withRSA");
        sign.initSign(this.getPrivKey());
        sign.update(this.getSentMsg().getBytes());
        byte[] signature = sign.sign();
        LOG.info("Digital signature for "+this.getSentMsg()+" : "+new String(signature, "UTF8"));
    }
    
//    public void loadKeyStore() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException {
//        KeyStore ks = KeyStore.getInstance("JKS");
//        char[] pwdArray = "hhsvyp".toCharArray();
//        ks.load(new FileInputStream("vyp.jks"), pwdArray);
//        System.out.println("Keystore file loaded");
//        
//        X509Certificate[] certificateChain = new X509Certificate[2];
//        ks.setKeyEntry("sso-signing-key", this.getPrivKey(), pwdArray, certificateChain);
//    }
}
