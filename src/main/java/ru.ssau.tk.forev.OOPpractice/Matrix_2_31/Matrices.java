package ru.ssau.tk.forev.OOPpractice.Matrix_2_31;

public class Matrices {


    public static Matrix sum(Matrix matrixFirst, Matrix matrixSecond) {
        int rows = matrixFirst.getRows();
        int columns = matrixFirst.getColumns();
        int rows2 = matrixSecond.getRows();
        int columns2 = matrixSecond.getColumns();
        if (rows != rows2 || columns != columns2) {
            return null;
        } else {
            Matrix matrix = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix.setAt(i + 1, j + 1, matrixFirst.getAt(i + 1, j + 1) + matrixSecond.getAt(i + 1, j + 1));
                }
            }
            return matrix;
        }
    }

    public static Matrix multiplication(Matrix matrixFirst, Matrix matrixSecond) {
        int rows = matrixFirst.getRows();
        int columns = matrixFirst.getColumns();
        int rows2 = matrixSecond.getRows();
        int columns2 = matrixSecond.getColumns();
        if (columns == rows2) {
            Matrix matrix = new Matrix(rows, columns2);
            for (int i = 0; i < rows; i++) {
                for (int c = 0; c < columns2; c++) {
                    for (int j = 0; j < columns; j++) {
                        matrix.setAt(i + 1, c + 1, matrix.getAt(i + 1, c + 1) + matrixFirst.getAt(i + 1, j + 1) * matrixSecond.getAt(j + 1, c + 1));
                    }
                }
            }
            return matrix;
        } else {
            return null;
        }
    }

    public static Matrix multiplicationNumber(Matrix matrixFirst, double number) {
        int rows = matrixFirst.getRows();
        int columns = matrixFirst.getColumns();
        Matrix matrix = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix.setAt(i + 1, j + 1, matrixFirst.getAt(i + 1, j + 1) * number);
            }
        }
        return matrix;
    }
}

