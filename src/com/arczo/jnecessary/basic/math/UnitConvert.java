package com.arczo.jnecessary.basic.math;

/**
 * Metric Unit Conversion Class.
 * @author Jon McLean
 * @since 6/2/15
 */
public class UnitConvert {

    private UnitConvert() {}

    /**
     * Converts Metric Meters to Metric Kilometers
     * @param meters
     * @return Result
     */
    public static double metricMetersToKilometers(double meters) {
        return meters / 1000;
    }

    /**
     * Converts Metric Kilometers to Metric Meters
     * @param kilometers
     * @return Result
     */
    public static double metricKilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    /**
     * Converts Metric Meters to Metric Centimeters
     * @param meters
     * @return Result
     */
    public static double metricMetersToCentimeters(double meters) {
        return meters * 100;
    }

    /**
     * Converts Metric Centimeters to Metric Meters
     * @param centimeters
     * @return Result
     */
    public static double metricCentimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    /**
     * Converts Imperial Miles to Metric Kilometers.
     * @param miles
     * @return Result
     */
    public static double impMilesToMetKilometers(double miles) {
        return miles/0.62137;
    }

    /**
     * Converts Imperial Feet to Metric Meters
     * @param feet
     * @return Result
     */
    public static double impFeetToMetMeters(double feet) {
        return feet/3.2808;
    }

    /**
     * Converts Imperial Inch to Metric Centimeters
     * @param inch
     * @return Result
     */
    public static double impInchToMetCentimeters(double inch) {
        return inch/0.39370;
    }

    /**
     * Converts Imperial Yards to Metric Meters
     * @param yards
     * @return
     */
    public static double impYardToMetMeters(double yards) {
        return yards / 1.0936;
    }


}
