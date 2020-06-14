package com.cuelogic.camel.demo.integrity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateException;

public class Client {

    public static void main(String[] args) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, FileNotFoundException, IOException, InvalidKeyException, SignatureException {
        DataSourceIntegrityMaintainer d = new DataSourceIntegrityMaintainer();
        d.generateMsgDigest(d.getSentMsg());
        d.signMsg(d.getSentMsg());
    }
}
