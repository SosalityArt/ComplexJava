package org.example;

public class SerSqu {
    private SerSqu(){}
    public static int s(Squ sq) {
        return sq.getA() * sq.getB();
    }
    public static int p(Squ sq) {
        return sq.getA() - sq.getB();
    }
}


