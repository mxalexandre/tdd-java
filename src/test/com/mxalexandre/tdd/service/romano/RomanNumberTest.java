package com.mxalexandre.tdd.service.romano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    RomanNumber romanNumber;

    @Before
    public void setup() {
        romanNumber = new RomanNumber();
    }

    @Test
    public void romanToDecimal_16() {
        int decimalNumber = romanNumber.romanToDecimal("XVI");
        assertEquals(decimalNumber, 16);
    }

    @Test
    public void romanToDecimal_1234() {
        int decimalNumber = romanNumber.romanToDecimal("MCCXXXIV");
        assertEquals(decimalNumber, 1234);
    }

}