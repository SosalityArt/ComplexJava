package org.example;

public class Main {
    public static void main(String[] args) {
        Complex sq = new Complex();
        sq.setX(5); sq.setY(2);
        System.out.println(ComplexSer.add(sq));
        System.out.println(ComplexSer.sub(sq));
        System.out.println(ComplexSer.mul(sq));
        System.out.println(ComplexSer.div(sq));
        System.out.println(sq.toString());
        System.out.println();
        Complex z1 = new Complex(2,3);
        Complex z2 = new Complex( 1,3);
        if(z1.equals(z2)) System.out.println("z1("+z1.toString()+") = z2("+z2.toString()+")");
        else System.out.println("z1("+z1.toString()+") != z2("+z2.toString()+")");
        System.out.println("("+ComplexSer.addX(z1,z2)+", "+ComplexSer.addY(z1,z2)+") = (x1+x2, y1+y2)");
        System.out.println("("+ComplexSer.subX (z1,z2)+", "+ComplexSer.subY(z1,z2)+") = (x1-x2, y1-y2)");
        System.out.println("("+ComplexSer.sub_x1x2_y1y2(z1,z2)+", "+ComplexSer.add_x1y2_x2y1(z1,z2)+") = (x1x2−y1y2, x1y2+x2y1)");
        System.out.println(ComplexSer.getMulInDiv(z1,z2,1)+" = z1 / z2");

    }
}