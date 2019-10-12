package ru.ssau.tk.forev.OOPpractice.Operation;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double accuracy = 0.00001;
    Operation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, accuracy);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(identical.apply(Double.NaN), Double.NaN, accuracy);
        assertEquals(identical.apply(150), 150, accuracy);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(60), 60, accuracy);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, accuracy);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, accuracy);
    }
}