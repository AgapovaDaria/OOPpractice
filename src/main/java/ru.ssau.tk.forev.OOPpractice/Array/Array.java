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
        double p = Math.round((double) length / 2);
        for (int i = 0; i < p; i++) {
            array[i] = i + 1;
            array[length - i - 1] = i + 1;
        }
        return array;
    }

    public static void arrayOppositeSigns(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
    }

    public static boolean checkContainNumber(double[] array, double a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return true;
            }
        }
        return false;
    }

    public static boolean contentsNullArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int numberOfEvenNumbers(Integer[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                s++;
            }
        }
        return s;
    }

    public static boolean dividersFirstAndLast(Integer[] array) {
        int d = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % array[0] == 0) {
                d++;
            }
            if (i % array[array.length - 1] == 0) {
                m++;
            }
        }
        if (d > m) {
            return true;
        }
        return false;
    }

    public static Integer maxValuesArray(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer maxValues = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValues) {
                maxValues = array[i];
            }
        }
        return maxValues;
    }

    public static double[] dividers(int a) {
        double[] array = new double[0];
        int count = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                double[] newArray = new double[array.length + 1];
                System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[count] = i;
                array = newArray;
                count++;
            }
        }
        return array;
    }

    public static double[] dividersTwo(int a) { // вспомогательный метод для поиска всех делителей числа  для задания 2.12
        double[] array = new double[0];
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                double[] newArray = new double[array.length + 1];
                System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[count] = i;
                array = newArray;
                count++;
            }
        }
        return array;
    }

    public static double[] simpleNumbers(int a) {
        double[] array = new double[0];
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (Array.dividersTwo(i).length == 2) { // т.к простое число имеет только два делителя это 1 и само число
                double[] newArray = new double[array.length + 1];
                System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[count] = i;
                array = newArray;
               count++;
            }
        }
        return array;
    }
}



