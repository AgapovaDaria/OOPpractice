package ru.ssau.tk.forev.OOPpractice.Array;

public class Array {
    static public double [] newArray(int length) {
        double[] arrayDimension = new double[length];
        for (int i = 0; i < length; i++) {
            arrayDimension[i] = i+1;
        }
        return arrayDimension;
    }
}
