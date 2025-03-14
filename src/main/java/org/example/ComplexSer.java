package org.example;

public class ComplexSer {
    private ComplexSer() {}
    public static double add(Complex c1) {
        return c1.getX() + c1.getY();
    }
    public static double addX(Complex c1, Complex c2) {
        return c1.getX() + c2.getX();
    }
    public static double addY(Complex c1, Complex c2) {
        return c1.getY() + c2.getY();
    }
    public static double sub(Complex c1) {
        return c1.getX() - c1.getY();
    }
    public static double mul(Complex c1) {
        return c1.getX() * (double)c1.getY();
    }
    public static double div(Complex c1) {
        return c1.getX() / (double)c1.getY();
    }
    public static double sub_x1y2(Complex c1, Complex c2) {
        return c1.getX() - c2.getY();
    }
    public static double subX(Complex c1, Complex c2) {
        return c1.getX() - c2.getX();
    }
    public static double subY(Complex c1, Complex c2) {
        return c1.getY() - c2.getY();
    }
    public static double sub_x1x2_y1y2(Complex c1, Complex c2) {
        return (c1.getX() * c2.getX()) - (c1.getY() * c2.getY());
    }
    public static double add_x1y2_x2y1(Complex c1, Complex c2) {
        return (c1.getX() * c2.getY()) + (c2.getX() * c1.getY());
    }
    public static double getMulInDiv(Complex c1, Complex c2,double i) {
        double x1 = c1.getX();
        double y1 = c1.getY();
        double x2 = c2.getX();
        double y2 = c2.getY();

        double denominator = x2 * x2 + y2 * y2;
        return (x1 * x2 + y1 * y2) / denominator + (i * (x2 * y1 - x1 * y2) / denominator);
    }
}
