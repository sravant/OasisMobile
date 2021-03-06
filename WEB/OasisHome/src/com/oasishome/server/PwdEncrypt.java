package com.oasishome.server;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PwdEncrypt {
    public static String encrypt(String plaintext) {
        MessageDigest msgDigest = null;
        String hashValue = null;
        try {
            msgDigest = MessageDigest.getInstance("SHA-1");
            msgDigest.update(plaintext.getBytes("UTF-8"));
            byte rawByte[] = msgDigest.digest();
            hashValue = new String(rawByte,"UTF-8");
 
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm Exists");
        } catch (UnsupportedEncodingException e) {
            System.out.println("The Encoding Is Not Supported");
        }
        return plaintext;
    }
}
