package ru.ssau.tk.forev.OOPpractice.Points;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void firstConstructor() {
        NamedPoint firstPoint = new NamedPoint(4, -3, 0, "firstPoint");
        assertEquals(firstPoint.length(), 5, 0.00001);
        assertEquals(firstPoint.getName(), "firstPoint");
    }

    @Test
    public void secondConstructor() {
        NamedPoint secondPoint = new NamedPoint(4, 2, 4);
        assertEquals(secondPoint.length(), 6, 0.00001);
    }

    @Test
    public void thirdConstructor() {
        NamedPoint thirdPoint = new NamedPoint();
        assertEquals(thirdPoint.length(), 0.0, 0.0);
        assertEquals(thirdPoint.getName(), "Origin");
    }

    @Test
    public void testToString() {
        assertEquals(new NamedPoint(6, -3, 0).toString(), "[6.0,-3.0,0.0]");
        assertEquals(new NamedPoint(8, 1, 10, "First").toString(), "First [8.0,1.0,10.0]");
    }
}