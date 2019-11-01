package ru.ssau.tk.forev.OOPpractice.Array;

public class Array {
    static public double[] newArrayOfTheSameDimension(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = i + 1;
        }
        return arrayDimension;
    }

    static public double[] arrayOfAllUnitsExceptFirstAndLast(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 1; i < length - 1; i++) {
            arrayDimension[i] = 1;
        }
        arrayDimension[0] = 2;
        arrayDimension[length - 1] = 2;
        return arrayDimension;
    }

    static public double[] arrayOfIncreasingOddNumbers(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = 2 * i + 1;
        }
        return arrayDimension;
    }

    static public double[] arrayOfDecreasingEvenNumbers(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = 2 * length - 2 * i;
        }
        return arrayDimension;
    }

    static public double[] arrayOfFirstFibonacciNumbers(int length) {
        double[] arrayDimension = new double[length];
        arrayDimension[0] = 0;
        arrayDimension[1] = 1;
        for (int i = 2; i < length; i++) {
            arrayDimension[i] = arrayDimension[i - 1] + arrayDimension[i - 2];
        }
        return arrayDimension;
    }

    static public double[] arrayOfSquaresOfProperIndices(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = i * i;
        }
        return arrayDimension;
    }

    static double[] quadraticEquationSolver(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return new double[0];
            } else {
                return new double[]{-c / b};
            }
        }
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return new double[]{x1, x2};
        } else if (D == 0) {
            double x0 = (-b + Math.sqrt(D)) / (2 * a);
            return new double[]{x0};
        } else {
            return new double[0];
        }
    }

    static public double[] numbersNotDivisibleBy3(int length) {
        double[] array = new double[length];
        int j = 1;
        for (int i = 0; i < length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }

    static public double[] arithmeticProgressionArray(int length, double a_n, double d) {
        double[] array = new double[length];
        array[0] = a_n;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }

    static public double[] arrayGeometricProgression(int length, double b_n, double g) {
        double[] array = new double[length];
        array[0] = b_n;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] * g;
        }
        return array;
    }

    static public int[] symmetricalArray(int length) {
        int[] array = new int[length];
        double p = Math.round((double)length / 2);
        for (int i = 0; i < p; i++) {
            array[i] = i + 1;
            array[length - i - 1] = i + 1;
        }
        return array;
    }
}

