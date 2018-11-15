package com.mxalexandre.tdd.service.bissexto;

public class Bissexto {

    public boolean isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        return isLeapYear;
    }

}
