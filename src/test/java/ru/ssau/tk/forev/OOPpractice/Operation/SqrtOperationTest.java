package ru.ssau.tk.forev.OOPpractice.Operation;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SqrtOperationTest {
    private static final double accuracy = 0.00001;
   Operation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(sqrt.apply(25), Math.sqrt(25), accuracy);
        assertEquals(sqrt.apply(-8), Double.NaN, accuracy);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(10), Math.pow(10, 1./8), accuracy);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, accuracy);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN, accuracy);
    }
}