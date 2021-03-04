package edu.cscc;


import org.junit.Assert;

import java.util.Locale;

public class CipherTest {

    @org.junit.Test
    public void encode() {
        int key = 3;
        Assert.assertTrue("mdcc".equals(Cipher.encode(key, "jazz")));
        Assert.assertTrue("mdcc".equals(Cipher.encode(key, "Jazz")));
        Assert.assertTrue("mdcc".equals(Cipher.encode(key, "   Jazz   ")));
        Assert.assertTrue("mdcc!".equals(Cipher.encode(key, "   Jazz!   ")));
        Assert.assertTrue(Cipher.encode(key, null) == null);
    }

    @org.junit.Test
    public void decode() {
        Assert.assertTrue("jazz".equals(Cipher.decode(3,"mdcc")));
    }

    @org.junit.Test
    public void both() {
        int key=3;
        String str = "Java the Complete Reference by Herbert Schildt, 11th edition";
        Assert.assertTrue(str.toLowerCase().equals(Cipher.decode(key,Cipher.encode(key,str))));
    }
}