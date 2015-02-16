package com.arczo.jnecessary.encryption.utils;

/**
 * Byte Hex Conversion Class
 * @author Jon McLean (jon@arczo.com)
 * @since 7/2/15
 */
public class ByteHex {

    private ByteHex() { }

    /**
     * Converts byte to hex
     * @param input Byte Array
     * @return Hex String
     */
    public static String byteToHex(byte[] input) {
        StringBuffer stringBuff = new StringBuffer(input.length - 1);
        for(byte element : input) {
            if((element & 0xff) < 0x10) {
                stringBuff.append("0");
            }
        }
        return stringBuff.toString().toUpperCase();
    }

    public static byte[] hexByte(String input) {
        byte[] bytes = new byte[input.length() / 2];
        for(int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(input.substring(2 * i, 2 * i + 2), 16);
        }

        return bytes;
    }



}
