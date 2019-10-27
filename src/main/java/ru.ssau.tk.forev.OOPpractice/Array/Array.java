package ru.ssau.tk.forev.OOPpractice.Array;

public class Array {
    static public double[] newArray(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = i + 1;
        }
        return arrayDimension;
    }

    static public double[] newArrayTwo(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 1; i < length - 1; i++) {
            arrayDimension[i] = 1;
        }
        arrayDimension[0] = 2;
        arrayDimension[length - 1] = 2;
        return arrayDimension;
    }

    static public double[] newArrayThree(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = 2 * i + 1;
        }
        return arrayDimension;
    }

    static public double[] newArrayFour(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = 2 * length - 2 * i;
        }
        return arrayDimension;
    }

    static public double[] newArrayFive(int length) {
        double[] arrayDimension = new double[length];
        arrayDimension[0] = 0;
        arrayDimension[1] = 1;
        for (int i = 2; i < length; i++) {
            arrayDimension[i] = arrayDimension[i - 1] + arrayDimension[i - 2];
        }
        return arrayDimension;
    }

    static public double[] newArraySix(int length) {
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
            double x1=(-b + Math.sqrt(D)) / (2 * a);
            double x2=(-b - Math.sqrt(D)) / (2 * a);
            return new double[]{x1,x2};
        } else if (D == 0) {
            double x0=(-b + Math.sqrt(D)) / (2 * a);
            return new double[]{x0};
        } else {
            return new double[0];
        }
    }

}

