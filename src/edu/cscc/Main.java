package edu.cscc;

/**
 * Main class for coding and decoding example
 *@author Bob Platt
 * @version 1.0
 */

public class Main {

    /**
     * Main method for running code/decode example
     * @param args runtime arguements
     */
    public static void main(String[] args) {
        final int KEY = 10;
	    String str = "The quick brown fox jumped over the lazy dog.";
	    System.out.println("Plaintext: "+str);
	    str = Cipher.encode(KEY,str);
        System.out.println("Ciphertext: "+str);
        str = Cipher.decode(KEY,str);
        System.out.println("Plaintext: "+str);
    }
}
