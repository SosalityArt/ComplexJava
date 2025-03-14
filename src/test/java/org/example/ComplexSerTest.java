package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComplexSerTest {

    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3.0, 5.0",
            "0.0, 0.0, 0.1",//TODO ошибка
            "-5.0, 3.0, -2.0",
            "1.5, 2.5, 4.0"
    })
    void add(double x, double y, double expected) {
        Complex c1 = new Complex(x, y);
        assertEquals(ComplexSer.add(c1), expected,x+" + "+y+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3.0, 5.0",
            "0.0, 0.1, 0.1",
            "-5.0, 3.0, 2.0",//TODO ошибка
            "1.5, 2.5, 4.0"
    })
    void addX(double x1, double x2, double expected) {
        Complex c1 = new Complex(x1, 0);
        Complex c2 = new Complex(x2, 0);
        assertEquals(ComplexSer.addX(c1, c2), expected,x1+" + "+x2+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2.5, 3.1, 5.5",//TODO ошибка
            "0.0, 0.1, 0.1",
            "-5.0, 3.0, -2.0",
            "1.5, 2.6, 4.1"
    })
    void addY(double y1, double y2, double expected) {
        Complex c1 = new Complex(0, y1);
        Complex c2 = new Complex(0, y2);
        assertEquals(ComplexSer.addY(c1, c2), expected,y1+" + "+y2+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 3.0, 2.0",
            "3.0, 2.1, 1.0",//TODO ошибка
            "0.0, 0.0, 0.0",
            "-5.0, -3.0, -2.0",
            "1.5, 0.5, 1.0"
    })
    void sub(double x, double y, double expected) {
        Complex c1 = new Complex(x, y);
        assertEquals(ComplexSer.sub(c1),expected,x+" - "+y+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3.0, 6.0",
            "0.0, 5.0, 0.0",
            "-4.0, 3.0, -12.0",
            "1.5, 2.0, 3.0",
            "2.0, 0.0, 0.0"
    })
    void mul(double x, double y, double expected) {
        Complex c1 = new Complex(x, y);
        assertEquals(ComplexSer.mul(c1),expected,x+" * "+y+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "6.0, 3.0, 2.0",
            "5.0, 2.0, 2.5",
            "-10.0, 2.0, -5.0",
            "1.0, 2.0, 0.4",//TODO ошибка
            "0.0, 5.0, 0.0"
    })
    void div(double x, double y, double expected) {
        Complex c1 = new Complex(x, y);
        assertEquals(ComplexSer.div(c1),expected,x+" / "+y+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 3.0, 2.0",
            "3.0, 2.1, 1.2",//TODO ошибка
            "0.0, 0.0, 0.0",
            "-5.0, -3.0, -2.0",
            "1.5, 0.5, 1.0"
    })
    void sub_x1y2(double x1, double y2, double expected) {
        Complex c1 = new Complex(x1, 0);
        Complex c2 = new Complex(0, y2);
        assertEquals(ComplexSer.sub_x1y2(c1, c2), expected,x1+" - "+y2+" = "+expected);
    }



    @ParameterizedTest
    @CsvSource({
            "5.0, 3.0, 2.0",
            "3.2, 2.0, 1.2",
            "0.0, 0.0, 0.13",//TODO ошибка
            "-5.0, -3.0, -2.0",
            "1.5, 0.5, 1.0"
    })
    void subX(double x1, double x2, double expected) {
        Complex c1 = new Complex(x1, 0);
        Complex c2 = new Complex(x2, 0);
        assertEquals(ComplexSer.subX(c1, c2), expected,x1+" - "+x2+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 3.0, 2.0",
            "3.2, 2.0, 1.2",
            "0.13, 0.0, 0.13",
            "-5.0, -3.0, -2.0",
            "1.5, 0.5, 1.08"//TODO ошибка
    })
    void subY(double y1, double y2, double expected) {
        Complex c1 = new Complex(0, y1);
        Complex c2 = new Complex(0, y2);
        assertEquals(ComplexSer.subY(c1, c2), expected,y1+" - "+y2+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3.0, 4.0, 5.0, -7.0",
            "1.0, 2.0, 3.0, 4.0, -5.0",
            "-2.0, 3.0, 4.0, -5.0, 7.0",
            "0.0, 0.0, 0.0, 0.0, 1.0"//TODO ошибка
    })
    void sub_x1x2_y1y2(double x1, double y1,double x2, double y2, double expected) {
        Complex c1 = new Complex(x1, y1);
        Complex c2 = new Complex(x2, y2);
        assertEquals(ComplexSer.sub_x1x2_y1y2(c1, c2), expected,x1+" + "+y1+" - "+x2+" - "+y2+" = "+expected);
    }

    @Test
    void add_x1y2() {}


@ParameterizedTest
@CsvSource({
        "2.0, 3.0, 4.0, 5.0, 22.0",
        "1.0, 2.0, 3.0, 4.0, 10.18",//TODO ошибка
        "3.0, 4.0, 5.0, 6.0, 38.0",
        "0.0, 0.0, 0.0, 0.0, 0.0"
})
    void add_x1y2_x2y1(double x1, double y1,double x2, double y2, double expected) {
    Complex c1 = new Complex(x1, y1);
        Complex c2 = new Complex(x2, y2);
        assertEquals(ComplexSer.add_x1y2_x2y1(c1, c2), expected,x1+" + "+y1+" + "+x2+" + "+y2+" = "+expected);
    }

    @ParameterizedTest
    @CsvSource({
            "1.0, 0.0, 1.0, 0.0, 1.0, 1.0",
            "0.0, 1.0, 0.0, 1.0, 1.0, 1.1",//TODO ошибка
            "2.0, 3.0, 1.0, 2.0, 1.0, 1.4",////TODO ошибка 1.4000000000000001
            "2.0, 1.0, 1.0, 1.0, 0.0, 1.5"
    })
    void getMulInDiv(double x1, double y1,double x2, double y2, double i, double expected) {
        Complex c1 = new Complex(x1, y1);
        Complex c2 = new Complex(x2, y2);
        assertEquals(ComplexSer.getMulInDiv(c1, c2, i), expected,c1.toString(i)+" * "+c2.toString(i)+" = "+expected);
    }
}