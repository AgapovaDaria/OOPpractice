package ru.ssau.tk.forev.OOPpractice.Operation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TangentOperationTest {
    private static final double accuracy = 0.00001;
    Operation tan = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tan.apply(10.0), Math.tan(10.0), accuracy);
        assertEquals(tan.apply(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(tan.apply(Double.POSITIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(tan.apply(Double.NaN), Double.NaN, accuracy);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tan.applyTriple(6), Math.tan(Math.tan(Math.tan(6))), accuracy);
        assertEquals(tan.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(tan.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, accuracy);
        assertEquals(tan.applyTriple(Double.NaN), Double.NaN, accuracy);
    }
}