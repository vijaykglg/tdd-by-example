package com.vijay.learn;
/*
Project : tdd-by-example
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 10 August 2020
*/

public class Doller {
    int amount;
    public Doller(int amount) {
        this.amount=amount;
    }

    public void times(int multiplier) {
        amount = amount * multiplier;
    }
}
