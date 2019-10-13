package ru.ssau.tk.forev.OOPpractice.Generator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    @Test
    public void testNextInt() {
        IntGenerator first = new IntGeneratorImpl();
        assertEquals(first.nextInt(), 0, 0.00001);
        assertEquals(first.nextInt(), 1, 0.00001);
        assertEquals(first.nextInt(), 2, 0.00001);
        assertEquals(first.nextInt(), 3, 0.00001);
        assertEquals(first.nextInt(), 4, 0.00001);
        assertEquals(first.nextInt(), 5, 0.00001);
    }
}