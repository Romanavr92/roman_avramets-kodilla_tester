package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 4;
        double powResult = calculator.pow(a,2);
        assertEquals(16, powResult);

    }
}