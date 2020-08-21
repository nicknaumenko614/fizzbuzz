package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void oneShouldSay1() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(1);
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSay2() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(2);
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void fourShouldSay4() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(4);
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void twelveShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(12);
        assertEquals("Fizz", result);
    }

    @Test
    public void fifteenShouldSayFizzBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void twentyShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(20);
        assertEquals("Buzz", result);

    }



}
