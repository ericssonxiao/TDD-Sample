package com.eric.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class RomonNumberTest {

    @DisplayName("Test RomonNumber Ones")
    @Test
    public void testRomonOnes() {
        assertEquals("", RomonNumber.toRomon(0));
        assertEquals("I", RomonNumber.toRomon(1));
        assertEquals("II", RomonNumber.toRomon(2));
        assertEquals("III", RomonNumber.toRomon(3));
        assertEquals("IV", RomonNumber.toRomon(4));
        assertEquals("V", RomonNumber.toRomon(5));
        assertEquals("VI", RomonNumber.toRomon(6));
        assertEquals("VII", RomonNumber.toRomon(7));
        assertEquals("VIII", RomonNumber.toRomon(8));
        assertEquals("IX", RomonNumber.toRomon(9));
    }

    @DisplayName("Test RomonNumber Tens")
    @Test
    public void testRomonTens() {
        assertEquals("X", RomonNumber.toRomon(10));
        assertEquals("XV", RomonNumber.toRomon(15));
        assertEquals("XX", RomonNumber.toRomon(20));
        assertEquals("XXIII", RomonNumber.toRomon(23));
        assertEquals("XXX", RomonNumber.toRomon(30));
        assertEquals("XXXVI", RomonNumber.toRomon(36));
        assertEquals("XL", RomonNumber.toRomon(40));
        assertEquals("XLVII", RomonNumber.toRomon(47));
        assertEquals("L", RomonNumber.toRomon(50));
        assertEquals("LII", RomonNumber.toRomon(52));
        assertEquals("LX", RomonNumber.toRomon(60));
        assertEquals("LXIV", RomonNumber.toRomon(64));
        assertEquals("LXX", RomonNumber.toRomon(70));
        assertEquals("LXXVI", RomonNumber.toRomon(76));
        assertEquals("LXXX", RomonNumber.toRomon(80));
        assertEquals("LXXXV", RomonNumber.toRomon(85));
        assertEquals("LXXXVII", RomonNumber.toRomon(87));
        assertEquals("XC", RomonNumber.toRomon(90));
        assertEquals("XCV", RomonNumber.toRomon(95));
        assertEquals("XCVIII", RomonNumber.toRomon(98));
    }

    @DisplayName("Test RomonNumber Hundreds")
    @Test
    public void testRomonHundreds() {
        assertEquals("C", RomonNumber.toRomon(100));
        assertEquals("CLXXX", RomonNumber.toRomon(180));
        assertEquals("CC", RomonNumber.toRomon(200));
        assertEquals("CCC", RomonNumber.toRomon(300));
        assertEquals("CD", RomonNumber.toRomon(400));
        assertEquals("D", RomonNumber.toRomon(500));
        assertEquals("DC", RomonNumber.toRomon(600));
        assertEquals("DCC", RomonNumber.toRomon(700));
        assertEquals("DCCC", RomonNumber.toRomon(800));
        assertEquals("CM", RomonNumber.toRomon(900));
    }

    @DisplayName("Test RomonNumber Thoudrends")
    @Test
    public void testRomonThoudrends() {
        assertEquals("M", RomonNumber.toRomon(1000));
        assertEquals("MM", RomonNumber.toRomon(2000));
        assertEquals("MMM", RomonNumber.toRomon(3000));
    }

    @Disabled
    public void testRomonTensThoudrends() {
        assertEquals("MMMM", RomonNumber.toRomon(1000));
    }

}