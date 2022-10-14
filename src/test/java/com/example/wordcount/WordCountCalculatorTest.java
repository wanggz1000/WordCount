package com.example.wordcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountCalculatorTest {
    WordCountCalculator exp = new WordCountCalculator();

    @Test

    void wordcountTest(){

        String a = "Hello";
        int expectedResult = 1;
        int result = exp.Wordcount(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void charTest(){
        String a = "Hello";
        int expectedResult = 5;
        int result = exp.charcterscount(a);
        assertEquals(result,expectedResult);
    }
}
