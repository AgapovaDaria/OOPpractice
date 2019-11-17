package ru.ssau.tk.forev.OOPpractice.Matrix_2_31;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MatricesTest {

    @Test
    public static void testSum() {
        Matrix matrixFirst = new Matrix(2, 2);
        matrixFirst.setAt(1, 1, 12);
        matrixFirst.setAt(1, 2, -1);
        matrixFirst.setAt(2, 1, -5);
        matrixFirst.setAt(2, 2, 0);
        Matrix matrixSecond = new Matrix(2, 2);
        matrixSecond.setAt(1, 1, -4);
        matrixSecond.setAt(1, 2, -3);
        matrixSecond.setAt(2, 1, 15);
        matrixSecond.setAt(2, 2, 7);
        Matrix matrixThird = Matrices.sum(matrixFirst, matrixSecond);
        assertEquals(matrixThird.getAt(1, 1), 8.0);
        assertEquals(matrixThird.getAt(1, 2), -4.0);
        assertEquals(matrixThird.getAt(2, 1), 10.0);
        assertEquals(matrixThird.getAt(2, 2), 7.0);
        Matrix fourthMatrix = new Matrix(2, 3);
        fourthMatrix.setAt(1, 1, -4);
        fourthMatrix.setAt(1, 2, -3);
        fourthMatrix.setAt(1, 3, 5);
        fourthMatrix.setAt(2, 1, 15);
        fourthMatrix.setAt(2, 2, 7);
        fourthMatrix.setAt(2, 3, -1);
        assertNull(Matrices.sum(matrixFirst, fourthMatrix));
    }

    @Test
    public static void testMultiplication() {
        Matrix matrixFirst = new Matrix(2, 2);
        matrixFirst.setAt(1, 1, -2);
        matrixFirst.setAt(1, 2, 1);
        matrixFirst.setAt(2, 1, 5);
        matrixFirst.setAt(2, 2, 4);
        Matrix matrixSecond = new Matrix(2, 1);
        matrixSecond.setAt(1, 1, 3);
        matrixSecond.setAt(2, 1, -1);
        Matrix matrixThird = Matrices.multiplication(matrixFirst, matrixSecond);
        assertEquals(matrixThird.getAt(1, 1), -7.0);
        assertEquals(matrixThird.getAt(2, 1), 11.0);
        Matrix fourthMatrix = new Matrix(3, 1);
        fourthMatrix.setAt(1, 1, -4);
        fourthMatrix.setAt(2, 1, 15);
        fourthMatrix.setAt(3, 1, -1);
        assertNull(Matrices.multiplication(matrixFirst, fourthMatrix));
    }

    @Test
    public static void testMultiplicationNumber() {
        Matrix matrixFirst = new Matrix(2, 2);
        matrixFirst.setAt(1, 1, -2);
        matrixFirst.setAt(1, 2, 1);
        matrixFirst.setAt(2, 1, 5);
        matrixFirst.setAt(2, 2, 4);
        Matrix matrixSecond = Matrices.multiplicationNumber(matrixFirst, 3.0);
        matrixSecond.setAt(1, 1, -6);
        matrixSecond.setAt(1, 2, 3);
        matrixSecond.setAt(2, 1, 15);
        matrixSecond.setAt(2, 2, 12);
    }
}