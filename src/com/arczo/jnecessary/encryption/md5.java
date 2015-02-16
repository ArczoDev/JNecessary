package com.arczo.jnecessary.encryption;

import com.arczo.jnecessary.basic.logging.Log;
import com.arczo.jnecessary.encryption.utils.ByteHex;

import java.security.MessageDigest;

/**
 * Class for md5 methods
 * @author Jon McLean
 * @since 7/2/15
 */
public class md5 {

    private md5() { }

    /**
     * Turns input into md5 hash.
     * @param input Input
     * @return md5 Hash
     */
    public static String md5Hash(String input) {
        try {
            byte[] hash = MessageDigest.getInstance("MD5").digest(input.getBytes());
            return ByteHex.byteToHex(hash);
        }catch(Exception e) {
            Log.fail(e.getMessage());
        }
        return "";
    }

    /**
     * Compares two hashes together. For this method both values must be md5 hashes
     * @param hash1 Hash Number 1
     * @param hash2 Hash Number 2
     * @return Same or not same.
     */
    public static boolean isSameHash(String hash1, String hash2) {
        if(hash1 == hash2) {
            return true;
        }
        return false;
    }

    /**
     * Compares the two values. For this method one must be un-hashed (nonHashedValue) and one must be hashed (hashedValue)
     * @param nonHashedValue The none hashed value
     * @param hashedValue The hashed value
     * @return Same or not same.
     */
    public static boolean isSame(String nonHashedValue, String hashedValue) {
        String v = md5Hash(nonHashedValue);
        if(v == hashedValue) {
            return true;
        }

        return false;
    }

}
