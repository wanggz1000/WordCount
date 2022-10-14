package com.example.wordcount;

import org.apache.logging.log4j.util.Strings;

public class WordCountCalculator {

    public int Wordcount(String s){
        return s.split("\\s+").length;
    }
}
