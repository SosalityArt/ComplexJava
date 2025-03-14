package org.example;

public class Complex {
    private double x;
    private double y;
    @Override
    public String toString() {
        return x + " + " + y + "i";
    }
    public String toString(double i) {
        return x + " + " + y + "(" + i + ")";
    }
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Complex(){this.x = 0; this.y = 0;}
    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public boolean equals(Complex c) {
        if(x == c.getX()&&y == c.getY())
            return true;
        else return false;}
}
