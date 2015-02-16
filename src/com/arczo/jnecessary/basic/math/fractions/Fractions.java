package com.arczo.jnecessary.basic.math.fractions;

import com.arczo.jnecessary.basic.logging.Log;

/**
 * Handles all fraction based math.
 * @author Jon McLean (jon@arczo.com)
 * @since 9/2/15
 */
public class Fractions {

    private Fractions() { }

    public static double fractionToDecimal(Fraction fraction) {
        if(fraction.getDenominator() == 0) {
            Log.fail("0 is not a valid denominator", "JNecessary");
            throw new IllegalArgumentException("[JNECESSARY]: Illegal Argument Exception. 0 is not a valid denominator");
        }
        return fraction.getNominator() / fraction.getDenominator();
    }

    public static void decimalToFraction(double decimal) {

        // TODO: Need to find algorithm to turn decimal to fraction. In other words work out nom and denom.
        // TODO: This could just return the decimal over 1 and then we could have a method for simplifying. Except I think having it all in
        // TODO: one method would be more "attracting"

        // TODO: Check email (jon@arczo.com) for lcm thing

    }

    public static void addFractions(Fraction fraction1, Fraction fraction2) {

        int nom1 = fraction1.getNominator();
        int nom2 = fraction2.getNominator();
        int denom1 = fraction1.getDenominator();
        int denom2 = fraction2.getDenominator();

        if((denom1 == 0) || (denom2 == 0)) {
            Log.fail("0 is not a valid denominator", "JNecessary");
            throw new IllegalArgumentException("[JNECESSARY]: Illegal Argument Exception. 0 is not a valid denominator");
        }

        if(denom1 == denom2) {
            int nom = nom1 + nom2;
            int denom = denom1 + denom2;
        }else {
        }

    }

}
