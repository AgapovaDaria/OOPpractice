package ru.ssau.tk.forev.OOPpractice.Array;

public class Array {
    static public double [] newArray(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = i+1;
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

}
