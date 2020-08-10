package com.vijay.learn;
/*
Project : tdd-by-example
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 10 August 2020
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Doller five = new Doller(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
}
