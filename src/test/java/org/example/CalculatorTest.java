package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAddTrue() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 15;
        assertTrue(actualValue == expectedValue);


    }

    public void testAddFalse() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 24;
        assertFalse(actualValue == expectedValue);


    }

    public void testAddException() throws Exception {
        Calculator calc = new Calculator();
        try {
            int actualValue = calc.add(11, 12);
            assertTrue(false);
        } catch (Exception ex) {
            assertTrue(true);
        }





    }
}