package com.eric.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is the first TDD Sample
 */
public class FirstTddTest {

    @DisplayName("Test FirstTdd.show()")
    @Test
    public void testShow() {
        assertEquals("First TDD Sample", FirstTdd.show());
    }
}
