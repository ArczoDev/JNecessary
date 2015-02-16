package com.arczo.jnecessary.basic.math;

/**
 * Geometry math class
 * @author Jon McLean (jon@arczo.com)
 * @since 6/2/15
 */
public class Geometry {

    private Geometry() { }

    public static final double PI = 3.14159265359;

    /**
     * Gets the area of a circle using the radius
     * @param radius
     * @return Result (Double)
     */
    public static double circleArea(double radius) {
        return PI * BasicMath.power(radius, 2);
    }

    /**
     * Gets the circumference of a circle using the radius
     * @param radius
     * @return Result (Double)
     */
    public static double circleCircumference(double radius) {
        return 2 * (PI * radius);
    }

    /**
     * Gets the diameter of a circle using the radius
     * @param radius
     * @return Result (Double)
     */
    public static double circleDiameter(double radius) {
        return 2 * radius;
    }

    /**
     * Gets the area of a triangle
     * @param base
     * @param height
     * @return Result (Double)
     */
    public static double triangeArea(double base, double height) {
        return (height * base) / 2;
    }

    public static double squareArea(double x, double y) {
        return x * y;
    }

    public static double shapePerimeter(double... value) {
        double result = 0;
        for(int i = 0; i < value.length; i++){
            result += value[i];
        }
        return result;
    }


}
