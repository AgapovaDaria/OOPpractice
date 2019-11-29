package ru.ssau.tk.forev.OOPpractice.Points;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testToString() {
        Point firstPoint = new Point(5.0, 10.0, 8.0);
        assertEquals(firstPoint.toString(), "[5.0,10.0,8.0]");
        assertEquals(new Point(6, -3, 0).toString(), "[6.0,-3.0,0.0]");
    }
}