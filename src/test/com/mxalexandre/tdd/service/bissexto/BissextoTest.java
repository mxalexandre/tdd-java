package com.mxalexandre.tdd.service.bissexto;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BissextoTest {

    Bissexto bissexto;

    @Before
    public void setup() {
        bissexto = new Bissexto();
    }

    @Test
    public void isLeapYear_True() {
        boolean leapYear = bissexto.isLeapYear(2004);
        assertTrue(leapYear);
    }

    @Test
    public void isLeapYear_False() {
        boolean leapYear = bissexto.isLeapYear(2018);
        assertFalse(leapYear);
    }

}