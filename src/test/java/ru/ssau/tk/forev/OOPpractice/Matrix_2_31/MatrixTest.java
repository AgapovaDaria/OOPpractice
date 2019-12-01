package ru.ssau.tk.forev.OOPpractice.Matrix_2_31;

import org.testng.annotations.Test;

public class MatrixTest {

    @Test
    public void testToString() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(1, 1, -2);
        firstMatrix.setAt(1, 2, 1);
        firstMatrix.setAt(2, 1, 5);
        firstMatrix.setAt(2, 2, 4);
        System.out.println(firstMatrix + "\n");
        Matrix secondMatrix = new Matrix(3, 1);
        secondMatrix.setAt(1, 1, -4);
        secondMatrix.setAt(2, 1, 15);
        secondMatrix.setAt(3, 1, -1);
        System.out.println(secondMatrix + "\n");
        Matrix thirdMatrix = new Matrix(3, 3);
        thirdMatrix.setAt(1, 1, 1);
        thirdMatrix.setAt(1, 2, 15);
        thirdMatrix.setAt(1, 3, 8);
        thirdMatrix.setAt(2, 1, 15);
        thirdMatrix.setAt(2, 2, 1);
        thirdMatrix.setAt(2, 3, 6);
        thirdMatrix.setAt(3, 1, -1);
        thirdMatrix.setAt(3, 2, 9);
        thirdMatrix.setAt(3, 3, 1);
        System.out.println(thirdMatrix + "\n");
    }
}