package ru.ssau.tk.forev.OOPpractice.Generator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ResettableIntGeneratorTest  {

    @Test
    public void testNextInt() {
        IntGenerator first = new IntGeneratorImpl();
        assertEquals(first.nextInt(), 0, 0.00001);
        assertEquals(first.nextInt(), 1, 0.00001);
        assertEquals(first.nextInt(), 2, 0.00001);
        assertEquals(first.nextInt(), 3, 0.00001);
    }

    @Test
    public void testRest() {
        ResettableIntGenerator second = new ResettableIntGenerator();
        assertEquals(second.nextInt(), 0, 0.00001);
        assertEquals(second.nextInt(), 1, 0.00001);
        assertEquals(second.nextInt(), 2, 0.00001);
        second.reset();
        assertEquals(second.nextInt(), 0, 0.00001);
        assertEquals(second.nextInt(), 1, 0.00001);
        second.reset();
        assertEquals(second.nextInt(), 0, 0.00001);
    }
}
