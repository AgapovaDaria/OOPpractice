package ru.ssau.tk.forev.OOPpractice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testCreateArray() {
        assertEquals(Array.newArray(5)[4], 5.0);
        assertEquals(Array.newArray(8)[7], 8.0);
    }

    @Test
    public void testArrayTwo() {
        int length = 10;
        double[] array = Array.newArrayTwo(length);
        for (int i = 1; i < length - 1; i++) {
            assertEquals(array[i], 1, 0.000001);
        }
        assertEquals(array[0], 2, 0.000001);
        assertEquals(array[length - 1], 2, 0.000001);
    }

    @Test
    public void testArrayThree() {
        int length = 20;
        double[] arrayDimension = Array.newArrayThree(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension[i], 2 * i + 1, 0.000001);
        }
        assertEquals(arrayDimension[1], 3, 0.000001);
    }

    @Test
    public void testArrayFour() {
        int length = 10;
        double[] arrayDimension = Array.newArrayFour(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension[i], 2 * length - 2 * i, 0.000001);
        }
        assertEquals(arrayDimension[9], 2, 0.000001);
    }

    @Test
    public void testArrayFive() {
        int length = 6;
        double[] arrayDimension = Array.newArrayFive(length);
        for (int i = 2; i < length; i++) {
            assertEquals(arrayDimension[i], arrayDimension[i - 1] + arrayDimension[i - 2], 0.000001);
        }
        assertEquals(arrayDimension[4], 3, 0.000001);
    }

    @Test
    public void testArraySix() {
        int length = 6;
        double[] arrayDimension = Array.newArraySix(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension[i], i * i, 0.000001);
        }
        assertEquals(arrayDimension[1], 1, 0.000001);
    }

    @Test
    public void testQuadraticEquationSolver() {
        double[] rstExample = Array.quadraticEquationSolver(0, 0, 50);
        assertEquals(rstExample, new double[0]);
        double[] secondExample = Array.quadraticEquationSolver(0, 10, -5);
        assertEquals(secondExample[0], 0.5, 0.00001);
        double[] thirdExample = Array.quadraticEquationSolver(2, -4, 0);
        assertEquals(thirdExample[1], 0./2, 0.00001);
        double[] fourExample = Array.quadraticEquationSolver(4, -4, 1);
        assertEquals(fourExample[0], 0.5, 0.00001);
        double[] fiveExample = Array.quadraticEquationSolver(1, 2, 5);
        assertEquals(fiveExample, new double[0]);
    }
}