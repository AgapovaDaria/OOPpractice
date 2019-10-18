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
        assertEquals(array[length - 1], 2,0.000001);
    }

    @Test
    public void testArrayThree() {
        int length = 20;
        double[] arrayDimension = Array.newArrayThree(length);
        for (int i = 0; i < length ; i++) {
            assertEquals(arrayDimension [i],2 * i + 1 , 0.000001);
        }
        assertEquals(arrayDimension [1],3 , 0.000001);
    }

    @Test
    public void testArrayFour() {
        int length = 10;
        double[] arrayDimension = Array.newArrayFour(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension [i], 2*length - 2*i, 0.000001);
        }
        assertEquals(arrayDimension [9],2 , 0.000001);
    }
}