package com.arczo.jnecessary.basic.math.fractions;

/**
 * Fraction data type. To get the data out of it you have to run the getters
 * @author Jon McLean (jon@arczo.com)
 * @since 9/2/15
 */
public class Fraction {

    private int nominator;
    private int denominator;

    /**
     * Creates fraction data type using two integers
     * @param nominator
     * @param denominator
     */
    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    /**
     * Gets the fraction nominator
     * @return Nominator
     */
    public int getNominator() {
        return nominator;
    }

    /**
     * Gets the fraction denominator
     * @return Denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Returns the fraction as a String
     * Returns a string to avoid calculation by java e.g. So that 4/2 doesn't change to 2
     * @return Fraction - String
     */
    public String getWholeFraction() {
        String nom = Integer.toString(nominator);
        String denom = Integer.toString(denominator);
        StringBuilder sb = new StringBuilder();
        sb.append(nom);
        sb.append("/");
        sb.append(denom);
        return sb.toString();
    }

}
