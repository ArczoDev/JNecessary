package com.arczo.jnecessary.basic.math;
/**
 * Basic Math Operations class.
 * E.g. Addition and Subtraction
 * @author Jon McLean (jon@arczo.com)
 * @since 6/2/15
 */
public class BasicMath {

    private BasicMath() {}

    /**
     * Adds two ints together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int addInt(int x, int y) {
        return x + y;
    }

    /**
     * Adds two floats together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static float addFloat(float x, float y) {
        return x + y;
    }

    /**
     * Adds two doubles together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double addDouble(double x, double y) {
        return x + y;
    }

    /**
     * Subtracts two ints.
     * Syntax: Number 1 - Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int subtractInt(int x, int y) {
        return x - y;
    }

    /**
     * Subtracts two floats
     * Syntax: Number 1 - Number
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static float subtractFloat(float x, float y) {
        return x - y;
    }

    /**
     * Subtracts two doubles
     * Syntax: Number 1 - Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double subtractDouble(double x, double y) {
        return x - y;
    }

    /**
     * Multiples two ints together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int multiplyInt(int x, int y) {
        return x * y;
    }

    /**
     * Multiples two floats together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static float multiplyFloat(float x, float y) {
        return x * y;
    }

    /**
     * Multiplies two doubles together
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double multiplyDouble(double x, double y) {
        return x * y;
    }

    /**
     * Divides two numbers
     * Syntax: Number 1 / Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int divideInt(int x, int y) {
        return x / y;
    }

    /**
     * Divides two numbers
     * Syntax: Number 1 / Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static float divideFloat(float x, float y) {
        return x / y;
    }

    /**
     * Divides two numbers
     * Syntax: Number 1 / Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double divideDouble(double x, double y) {
        return x / y;
    }


    /**
     * Gets the square root of the entered num.
     * @param x Number 1
     * @return Result (Float)
     */
    public static float sqrt(float x) {
        float sqrRoot = 0;
        float temp = 0;

        temp = x/2;
        while(x >= 0.0) {
            sqrRoot = temp - (temp * temp - x) / (2 * temp);

            float value;
            value = Math.abs(temp - sqrRoot);
            if(value < .0001) {
                return sqrRoot;
            }else {
                temp = sqrRoot;
            }
        }
        return x;
    }

    /**
     * Gets the square root of the entered num.
     * @param x Number 1
     * @return Result (Double)
     */
    public static double sqrt(double x) {
        double sqrRoot = 0;
        double temp = 0;

        temp = x / 2;
        while(x >= 0.0) {
            sqrRoot = temp - (temp * temp - x) / (2 * temp);

            double value;
            value = abs(temp - sqrRoot);
            if(value < .0001) {
                return sqrRoot;
            }else {
                temp = sqrRoot;
            }
        }
        return x;
    }

    /**
     * Gets the power of the entered num using the entered power
     * @param num Number
     * @param power Power
     * @return Result (Double)
     */
    public static double power(double num, int power) {
        return java.lang.Math.pow(num, power);
    }

    /**
     * Gets the absolute value. E.g. The abs value of -6 is 6.
     * @param num
     * @return Result (int)
     */
    public static int abs(int num) {
        return (num < 0) ? -num : num;
    }

    /**
     * Gets the absolute value. E.g. the abs value of -6 is 6.
     * @param num
     * @return Result (double)
     */
    public static double abs(double num) {
        return (num < 0) ? -num : num;
    }

    /**
     * Multiples the two numbers and returns an absolute value.
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double absMultiplyDouble(double x, double y) {
        double calc = x * y;
        return abs(calc);
    }

    /**
     * Divides the two numbers and returns an absolute value
     * Syntax: x / y
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double absDivideDouble(double x, double y) {
        double calc = x / y;
        return abs(calc);
    }

    /**
     * Adds the two numbers and returns an absolute value
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double absAddDouble(double x, double y) {
        double calc = x + y;
        return abs(calc);
    }

    /**
     * Subtracts the two numbers and returns a absolute value.
     * Syntax: Number 1 - Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static double absSubtractDouble(double x, double y) {
        double calc = x - y;
        return abs(calc);
    }

    /**
     * Multiples the two numbers and returns an absolute value.
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int absMultiplyInt(int x, int y) {
        int calc = x * y;
        return abs(calc);
    }

    /**
     * Divides the two numbers and returns an absolute value
     * Syntax: x / y
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int absDivideInt(int x, int y) {
        int calc = x / y;
        return abs(calc);
    }

    /**
     * Adds the two numbers and returns an absolute value
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int absAddInt(int x, int y) {
        int calc = x + y;
        return abs(calc);
    }

    /**
     * Subtracts the two numbers and returns an absolute value
     * Syntax: Number 1 - Number 2
     * @param x Number 1
     * @param y Number 2
     * @return Result
     */
    public static int absSubtractInt(int x, int y) {
        int calc = x - y;
        return abs(calc);
    }


    public static int roof(int num) {
        // TODO: Get ceiling algorithm
        return 0;
    }

    public static int floor(int num) {
        // TODO: Get flooring algorithm.
        return 0;
    }
}
