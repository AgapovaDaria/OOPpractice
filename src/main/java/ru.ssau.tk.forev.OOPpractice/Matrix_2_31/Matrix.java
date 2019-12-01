package ru.ssau.tk.forev.OOPpractice.Matrix_2_31;


public class Matrix {
    private double[][] matrix;
    private final int rows;
    private final int columns;

    public Matrix() {
        this.rows = 0;
        this.columns = 0;
        this.matrix = new double[rows][columns];
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    Matrix(double[][] matrix) {
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    int getRows() {
        return rows;
    }

    int getColumns() {
        return columns;
    }

    public void setAt(int n, int m, double value) {
        matrix[n - 1][m - 1] = value;
    }

    double getAt(int n, int m) {
        return matrix[n - 1][m - 1];
    }

    @Override
    public String toString() {
        StringBuilder auxiliaryString = new StringBuilder();
        StringBuilder stringOutput = new StringBuilder();
        for (double[] rows : matrix) {
            for (double a : rows) {
                auxiliaryString.append(a + ",");
            }
            auxiliaryString.replace(auxiliaryString.length() - 1, auxiliaryString.length(), "");
            stringOutput.append(auxiliaryString.toString() + ";\n");
            auxiliaryString = new StringBuilder("");
        }
        return stringOutput.toString();
    }
}
