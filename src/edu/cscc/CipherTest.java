package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @org.junit.Test
    public void encode() {
        Cipher cipher = new Cipher(3);
        Assert.assertTrue("mdcc".equals(cipher.encode("jazz")));
        Assert.assertTrue("mdcc".equals(cipher.encode("Jazz")));
        Assert.assertTrue("mdcc".equals(cipher.encode("   Jazz  ")));
        Assert.assertTrue("mdcc!".equals(cipher.encode("   Jazz!  ")));
        Assert.assertTrue(cipher.encode(null) == null);
    }

    @org.junit.Test
    public void decode() {
            Cipher cipher = new Cipher(3);
            Assert.assertTrue("jazz".equals(cipher.decode("mdcc")));
    }

    @org.junit.Test
    public void both() {
        String str = "Java the Complete Reference by Herbert Schildt, 11th edition";
        Cipher cipher = new Cipher(3);
        Assert.assertTrue(str.toLowerCase().equals(cipher.decode(cipher.encode(str))));
    }
}