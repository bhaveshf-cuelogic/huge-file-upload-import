package com.hhstechgroup.vyp.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public interface MD5Hashable {
    default String generateMD5Digest(String msg) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        md.update(msg.getBytes());
        byte[] digest = md.digest();

        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        return hexString.toString();
    }
}
