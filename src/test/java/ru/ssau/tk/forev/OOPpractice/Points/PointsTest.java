package ru.ssau.tk.forev.OOPpractice.Points;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PointsTest {
    private static double accuracy = 0.00005;

    @Test
    public void testSum() {
        assertTrue(Points.equalsApproximately(Points.sum(new Point(8, 1, 0), new Point(15, 3, 2)), new Point(23, 4, 2)));
        assertTrue(Points.equalsApproximately(Points.sum(new Point(10.3, 25, 16), new Point(3, 5, 4)), new Point(13.3, 30, 20)));
    }

    @Test
    public void testSubtract() {
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(5, 6, 8), new Point(8, 3, 2)), new Point(-3, 3, 6)));
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(18.6, 50.2, 106.4), new Point(10.6, 50.1, 106.4)), new Point(8, 0.1, 0)));
    }

    @Test
    public void testMultiply() {
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(6, 8, 1), new Point(2, 9, 3)), new Point(12, 72, 3)));
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(2.1, -3.6, 10.3), new Point(2, 9.1, 3)), new Point(4.2, -32.76, 30.9)));
    }

    @Test
    public void testDivide() {
        assertTrue(Points.equalsApproximately(Points.divide(new Point(-1.5, 6, 10), new Point(3, 3, 5)), new Point(-0.5, 2, 2)));
        assertTrue(Points.equalsApproximately(Points.divide(new Point(-18, 45, 5), new Point(9, 2.5, 8)), new Point(-2, 18, 0.625)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(Points.equalsApproximately(Points.enlarge(new Point(16, 0, 1.5), 1.8), new Point(28.8, 0, 2.7)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(1, 2, 3)), Math.sqrt(14), accuracy);
    }

    @Test
    public void testOpposite() {
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(8, -10, -5)), new Point(-8, 10, 5)));
    }

    @Test
    public void testInverse() {
        assertTrue(Points.equalsApproximately(Points.inverse(new Point(5, 1, -2)), new Point(0.2, 1, -0.5)));
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(5, 8, 1), new Point(4.56, -1.86, 8.16)), 16.08);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(Points.vectorProduct(new Point(8, 4.5, 3.2), new Point(1, 3.85, 3.67)), new Point(4.195, -26.16, 26.3)));
    }
}