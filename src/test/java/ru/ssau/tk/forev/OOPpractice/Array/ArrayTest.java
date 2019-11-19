package ru.ssau.tk.forev.OOPpractice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {

    @Test
    public void testNewArrayOfTheSameDimension() {
        assertEquals(Array.newArrayOfTheSameDimension(5)[4], 5.0);
        assertEquals(Array.newArrayOfTheSameDimension(8)[7], 8.0);
    }

    @Test
    public void testArrayOfAllUnitsExceptFirstAndLast() {
        int length = 10;
        double[] array = Array.arrayOfAllUnitsExceptFirstAndLast(length);
        for (int i = 1; i < length - 1; i++) {
            assertEquals(array[i], 1, 0.000001);
        }
        assertEquals(array[0], 2, 0.000001);
        assertEquals(array[length - 1], 2, 0.000001);
    }

    @Test
    public void testArrayOfIncreasingOddNumbers() {
        int length = 20;
        double[] arrayDimension = Array.arrayOfIncreasingOddNumbers(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension[i], 2 * i + 1, 0.000001);
        }
        assertEquals(arrayDimension[1], 3, 0.000001);
    }

    @Test
    public void testArrayOfDecreasingEvenNumbers() {
        int length = 10;
        double[] arrayDimension = Array.arrayOfDecreasingEvenNumbers(length);
        for (int i = 0; i < length; i++) {
            assertEquals(arrayDimension[i], 2 * length - 2 * i, 0.000001);
        }
        assertEquals(arrayDimension[9], 2, 0.000001);
    }

    @Test
    public void testArrayOfFirstFibonacciNumbers() {
        int length = 6;
        double[] arrayDimension = Array.arrayOfFirstFibonacciNumbers(length);
        for (int i = 2; i < length; i++) {
            assertEquals(arrayDimension[i], arrayDimension[i - 1] + arrayDimension[i - 2], 0.000001);
        }
        assertEquals(arrayDimension[4], 3, 0.000001);
    }

    @Test
    public void testArrayOfSquaresOfProperIndices() {
        int length = 6;
        double[] arrayDimension = Array.arrayOfSquaresOfProperIndices(length);
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
        assertEquals(thirdExample[1], 0. / 2, 0.00001);
        double[] fourExample = Array.quadraticEquationSolver(4, -4, 1);
        assertEquals(fourExample[0], 0.5, 0.00001);
        double[] fiveExample = Array.quadraticEquationSolver(1, 2, 5);
        assertEquals(fiveExample, new double[0]);
    }

    @Test
    public void testNumbersNotDivisibleBy3() {
        int length = 7;
        double[] arrayDemonstrations = Array.numbersNotDivisibleBy3(length);
        assertEquals(arrayDemonstrations[0], 1, 0.00001);
        assertEquals(arrayDemonstrations[1], 2, 0.00001);
        assertEquals(arrayDemonstrations[2], 4, 0.00001);
        assertEquals(arrayDemonstrations[3], 5, 0.00001);
        assertEquals(arrayDemonstrations[4], 7, 0.00001);
        assertEquals(arrayDemonstrations[5], 8, 0.00001);
        assertEquals(arrayDemonstrations[6], 10, 0.00001);
    }

    @Test
    public void testArithmeticProgressionArray() {
        double[] arrayDemonstrations = Array.arithmeticProgressionArray(5, 2, 5);
        assertEquals(arrayDemonstrations[0], 2, 0.00001);
        assertEquals(arrayDemonstrations[1], 7, 0.00001);
        assertEquals(arrayDemonstrations[2], 12, 0.00001);
        assertEquals(arrayDemonstrations[3], 17, 0.00001);
        assertEquals(arrayDemonstrations[4], 22, 0.00001);
    }

    @Test
    public void testArrayGeometricProgression() {
        double[] arrayDemonstrations = Array.arrayGeometricProgression(4, 1, 8);
        assertEquals(arrayDemonstrations[0], 1, 0.00001);
        assertEquals(arrayDemonstrations[1], 8, 0.00001);
        assertEquals(arrayDemonstrations[2], 64, 0.00001);
        assertEquals(arrayDemonstrations[3], 512, 0.00001);
    }

    @Test
    public void testSymmetricalArray() {
        int[] arrayDemonstrations = Array.symmetricalArray(5);
        assertEquals(arrayDemonstrations[0], 1, 0.00001);
        assertEquals(arrayDemonstrations[1], 2, 0.00001);
        assertEquals(arrayDemonstrations[2], 3, 0.00001);
        assertEquals(arrayDemonstrations[3], 2, 0.00001);
        assertEquals(arrayDemonstrations[4], 1, 0.00001);
    }

    @Test
    public void testArrayOppositeSigns() {
        double[] array = new double[]{1., 3., 4., 5};
        Array.arrayOppositeSigns(array);
        assertEquals(array[0], -1, 0.0001);
        assertEquals(array[1], -3, 0.0001);
        assertEquals(array[2], -4, 0.0001);
        assertEquals(array[3], -5, 0.0001);
        assertEquals(array.length, 4, 0.0001);
    }

    @Test
    public void testCheckContainNumber() {
        double[] array = new double[]{1., 3., 4., 5};
        assertFalse(Array.checkContainNumber(array, 9));
        assertTrue(Array.checkContainNumber(array, 3));
        assertFalse(Array.checkContainNumber(array, 50));
    }

    @Test
    public void testContentsNullArray() {
        Integer[] array = new Integer[]{5, 10, null};
        assertTrue(Array.contentsNullArray(array));
        Integer[] arrayTwo = new Integer[]{5, 10, 50};
        assertFalse(Array.contentsNullArray(arrayTwo));
    }

    @Test
    public void testNumberOfEvenNumbers() {
        Integer[] array = new Integer[]{5, 10, 50, 12, 5, 18, 19, 3};
        assertEquals(Array.numberOfEvenNumbers(array), 4, 0.00001);
        Integer[] arrayTwo = new Integer[]{5, 13, 51, 17, 5, 11, 19, 3, 63};
        assertEquals(Array.numberOfEvenNumbers(arrayTwo), 0, 0.00001);
    }

    @Test
    public void testDividersFirstAndLast() {
        Integer[] array = new Integer[]{2, 10, 50, 12, 5, 18, 19, 3};
        assertTrue(Array.dividersFirstAndLast(array));
        Integer[] arrayTwo = new Integer[]{5, 1, 2, 12, 5, 18, 2};
        assertFalse(Array.dividersFirstAndLast(arrayTwo));
    }

    @Test
    public void testMaxValuesArray() {
        Integer[] array = new Integer[]{2, 10, 50, 12, 5, 18, 19, 3};
        assertEquals(Array.maxValuesArray(array), 50, 0.00001);
        Integer[] arrayTwo = new Integer[]{};
        assertNull(Array.maxValuesArray(arrayTwo));
    }

    @Test
    public void testDividers() {
        double[] arrayDemonstrations = Array.dividers(10);
        assertEquals(arrayDemonstrations[0], 1, 0.00001);
        assertEquals(arrayDemonstrations[1], 2, 0.00001);
        assertEquals(arrayDemonstrations.length, 2, 0.00001);
        double[] arrayDemonstrationsTwo = Array.dividers(25);
        assertEquals(arrayDemonstrationsTwo[0], 1, 0.00001);
        assertEquals(arrayDemonstrationsTwo[1], 5, 0.00001);
        assertEquals(arrayDemonstrationsTwo.length, 2, 0.00001);
    }

    @Test
    public void testSimpleNumbers() {
        double[] arrayDemonstrations = Array.simpleNumbers(2);
        assertEquals(arrayDemonstrations[0], 2, 0.00001);
        assertEquals(arrayDemonstrations.length, 1, 0.00001);
        double[] arrayDemonstrationsTwo = Array.simpleNumbers(3);
        assertEquals(arrayDemonstrationsTwo[0], 2, 0.00001);
        assertEquals(arrayDemonstrationsTwo[1], 3, 0.00001);
        assertEquals(arrayDemonstrationsTwo.length, 2, 0.00001);
        double[] arrayDemonstrationsThree = Array.simpleNumbers(997);
        assertEquals(arrayDemonstrationsThree[0], 2, 0.00001);
        assertEquals(arrayDemonstrationsThree[15], 53, 0.00001);
        assertEquals(arrayDemonstrationsThree[16], 59, 0.00001);
        assertEquals(arrayDemonstrationsThree[167], 997, 0.00001);
        assertEquals(arrayDemonstrationsThree.length, 168, 0.00001);
    }

    @Test
    public void testValueMostOftenInArray() {
        double[] array = new double[]{2., 10., 10., 10., 5., 18., 19., 3.};
        assertEquals(Array.valueMostOftenInArray(array), 10, 0.00001);
        double[] arraySecond = new double[]{2.1, 2.3, 2., 2.1, 2.2, 1.};
        assertEquals(Array.valueMostOftenInArray(arraySecond), 2.1, 0.00001);
        double[] arrayThird = new double[]{5, 5, 5};
        assertEquals(Array.valueMostOftenInArray(arrayThird), 5, 0.00001);
    }

    @Test
    public void testIndexInputNumber() {
        double[] arrayDemonstrations = new double[]{2., 10., 10., 10., 5., 18., 19., 3.};
        assertEquals(Array.indexInputNumber(arrayDemonstrations, 10.), 1, 0.00001);
        assertEquals(Array.indexInputNumber(arrayDemonstrations, 25.), -1, 0.00001);
        double[] arrayDemonstrationsSecond = new double[]{5, 6, 10, 18, 0};
        assertEquals(Array.indexInputNumber(arrayDemonstrationsSecond, 8), -1, 0.00001);
        assertEquals(Array.indexInputNumber(arrayDemonstrationsSecond, 5), 0, 0.00001);
        assertEquals(Array.indexInputNumber(arrayDemonstrationsSecond, 0), 4, 0.00001);
    }

    @Test
    public void testSumEvenIndexNumbers() {
        double[] arrayDemonstrations = new double[]{2., 4., 5.};
        assertEquals(Array.sumEvenIndexNumbers(arrayDemonstrations), 7., 0.00001);
        double[] arrayDemonstrationsSecond = new double[]{2., 10., 10., 10., -5., 18., -19., 3.};
        assertEquals(Array.sumEvenIndexNumbers(arrayDemonstrationsSecond), -12, 0.00001);
    }

    @Test
    public void testSwapTheMaximumAndMinimum() {
        double[] arrayDemonstrations = new double[]{2., 4., 5.};
        Array.swapTheMaximumAndMinimum(arrayDemonstrations);
        assertEquals(arrayDemonstrations[0], 5., 0.00001);
        assertEquals(arrayDemonstrations[2], 2., 0.00001);
        double[] arrayDemonstrationsSecond = new double[]{2., 10., 10., 10., -5., 18., -19., 3.};
        Array.swapTheMaximumAndMinimum(arrayDemonstrationsSecond);
        assertEquals(arrayDemonstrationsSecond[6], 18., 0.00001);
        assertEquals(arrayDemonstrationsSecond[5], -19., 0.00001);
    }

    @Test
    public void testBitwiseNegation() {
        int[] arrayDemonstrations = new int[]{2, 4, 5};
        Array.bitwiseNegation(arrayDemonstrations);
        assertEquals(arrayDemonstrations[0], -3, 0.00001);
        assertEquals(arrayDemonstrations[1], -5., 0.00001);
        assertEquals(arrayDemonstrations[2], -6., 0.00001);
        int[] arrayDemonstrationsSecond = new int[]{15, 8, 16, 20, 6, 1};
        Array.bitwiseNegation(arrayDemonstrationsSecond);
        assertEquals(arrayDemonstrationsSecond[0], -16, 0.00001);
        assertEquals(arrayDemonstrationsSecond[1], -9., 0.00001);
        assertEquals(arrayDemonstrationsSecond[2], -17., 0.00001);
        assertEquals(arrayDemonstrationsSecond[3], -21, 0.00001);
        assertEquals(arrayDemonstrationsSecond[4], -7., 0.00001);
        assertEquals(arrayDemonstrationsSecond[5], -2., 0.00001);
    }

    @Test
    public void testNewArrayWithBitwiseNegation() {
        int[] arrayDemonstrations = new int[]{2, 4, 5};
        int[] denyingArray = new int[arrayDemonstrations.length];
        denyingArray = Array.newArrayWithBitwiseNegation(arrayDemonstrations);
        assertEquals(denyingArray[0], -3, 0.00001);
        assertEquals(denyingArray[1], -5., 0.00001);
        assertEquals(denyingArray[2], -6., 0.00001);
        assertEquals(arrayDemonstrations[0], 2, 0.00001);
        assertEquals(arrayDemonstrations[1], 4., 0.00001);
        assertEquals(arrayDemonstrations[2], 5, 0.00001);
        int[] arrayDemonstrationsSecond = new int[]{15, 8, 16, 20, 6, 1};
        int[] denyingArraySecond = new int[arrayDemonstrationsSecond.length];
        denyingArraySecond = Array.newArrayWithBitwiseNegation(arrayDemonstrationsSecond);
        assertEquals(denyingArraySecond[0], -16, 0.00001);
        assertEquals(denyingArraySecond[1], -9., 0.00001);
        assertEquals(denyingArraySecond[2], -17., 0.00001);
        assertEquals(denyingArraySecond[3], -21, 0.00001);
        assertEquals(denyingArraySecond[4], -7., 0.00001);
        assertEquals(denyingArraySecond[5], -2., 0.00001);
        assertEquals(arrayDemonstrationsSecond[0], 15, 0.00001);
        assertEquals(arrayDemonstrationsSecond[1], 8., 0.00001);
        assertEquals(arrayDemonstrationsSecond[2], 16, 0.00001);
        assertEquals(arrayDemonstrationsSecond[3], 20, 0.00001);
        assertEquals(arrayDemonstrationsSecond[4], 6, 0.00001);
        assertEquals(arrayDemonstrationsSecond[5], 1, 0.00001);
    }

    @Test
    public void testPairwiseSummationOfElements() {
        int[] arrayDemonstrations = new int[]{9, 1, 5, 5};
        int[] arrayPairs = Array.pairwiseSummationOfElements(arrayDemonstrations);
        assertEquals(arrayPairs[0], 10, 0.00001);
        assertEquals(arrayPairs[1], 10, 0.00001);
        int[] arrayDemonstrationsSecond = new int[]{1, -8, 10, 8, 6};
        int[] arrayPairsSecond = Array.pairwiseSummationOfElements(arrayDemonstrationsSecond);
        assertEquals(arrayPairsSecond[0], -7, 0.00001);
        assertEquals(arrayPairsSecond[1], 18, 0.00001);
        assertEquals(arrayPairsSecond[2], 6, 0.00001);
    }

    @Test
    public void testBooleansArray() {
        int[] arrayDemonstrations = new int[]{9, 1, 6, 5};
        boolean[] booleansArray = Array.booleansArray(arrayDemonstrations);
        assertFalse(booleansArray[0]);
        assertFalse(booleansArray[1]);
        assertTrue(booleansArray[2]);
        assertFalse(booleansArray[3]);
        int[] arrayDemonstrationsSecond = new int[]{2, 6, 8, 5};
        boolean[] booleansArraySecond = Array.booleansArray(arrayDemonstrationsSecond);
        assertTrue(booleansArraySecond[0]);
        assertTrue(booleansArraySecond[1]);
        assertTrue(booleansArraySecond[2]);
        assertFalse(booleansArraySecond[3]);
    }

    @Test
    public void testLongInInt() {
        int[] arrayDemonstrations = Array.longInInt(9223372036854775807L);
        assertEquals(arrayDemonstrations[0], 2147483647);
        assertEquals(arrayDemonstrations[1], -1);
        assertEquals(Array.intInLong(arrayDemonstrations), 9223372036854775807L);
    }

    @Test
    public void testNaturalArrayNumbersWithIndexDefined() {
        int[] arrayDemonstrations = Array.naturalArrayNumbersWithIndexDefined(5, 3);
        assertEquals(arrayDemonstrations[0], 3);
        assertEquals(arrayDemonstrations[1], 4);
        assertEquals(arrayDemonstrations[2], 5);
        assertEquals(arrayDemonstrations[3], 1);
        assertEquals(arrayDemonstrations[4], 2);
        int[] arrayDemonstrationsSecond = Array.naturalArrayNumbersWithIndexDefined(8, 3);
        assertEquals(arrayDemonstrationsSecond[0], 6);
        assertEquals(arrayDemonstrationsSecond[1], 7);
        assertEquals(arrayDemonstrationsSecond[2], 8);
        assertEquals(arrayDemonstrationsSecond[3], 1);
        assertEquals(arrayDemonstrationsSecond[4], 2);
        assertEquals(arrayDemonstrationsSecond[5], 3);
        assertEquals(arrayDemonstrationsSecond[6], 4);
        assertEquals(arrayDemonstrationsSecond[7], 5);
    }

    @Test
    public void testTwoDimensionalArrayNaturalNumbers() {
        int[][] arrayDemonstrations = Array.twoDimensionalArrayNaturalNumbers(2);
        assertEquals(arrayDemonstrations[0][0], 1);
        assertEquals(arrayDemonstrations[0][1], 2);
        assertEquals(arrayDemonstrations[1][0], 3);
        int[][] arrayDemonstrationsSecond = Array.twoDimensionalArrayNaturalNumbers(3);
        assertEquals(arrayDemonstrationsSecond[0][0], 1);
        assertEquals(arrayDemonstrationsSecond[0][1], 2);
        assertEquals(arrayDemonstrationsSecond[0][2], 3);
        assertEquals(arrayDemonstrationsSecond[1][0], 4);
        assertEquals(arrayDemonstrationsSecond[1][1], 5);
        assertEquals(arrayDemonstrationsSecond[2][0], 6);
    }

    @Test
    public static void testNanInArray() {
        double[] arrayDemonstrations = new double[]{2., 10., 6.};
        Array.nanInArray(arrayDemonstrations);
        assertEquals(arrayDemonstrations[0], 2.);
        assertEquals(arrayDemonstrations[1], 6.);
        assertEquals(arrayDemonstrations[2], 10.);
        double[] arrayDemonstrationsSecond = new double[]{2., 10., Double.NaN};
        Array.nanInArray(arrayDemonstrationsSecond);
        assertEquals(arrayDemonstrationsSecond[0], 2.);
        assertEquals(arrayDemonstrationsSecond[1], 10.);
        assertEquals(arrayDemonstrationsSecond[2], Double.NaN);
    }

    @Test
    public static void testSrtArray() {
        String[] arrayDemonstrations = new String[]{"Жизнь", "Родители", "Любовь", "Работа"};
        Array.srtArray(arrayDemonstrations);
    }
}