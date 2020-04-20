package com.eric.tdd;

public class RomonNumber {

    private RomonNumber() {

    }

    public static String toRomon(int num) {
        String[] ones = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] tens = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] hundreds = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] thoudrends = new String[] { "", "M", "MM", "MMM" };
        return thoudrends[num / 1000 % 10] + hundreds[num / 100 % 10] + tens[num / 10 % 10] + ones[num % 10];
    }
}