package com.example.wordcount;

import org.apache.logging.log4j.util.Strings;

public class WordCountCalculator {

    public int Wordcount(String s){
        return s.split("\\s+").length;
    }

    public int charcterscount(String s){
        int count = 0;
        for (int i =0;i<s.length();i++){
            count++;

        }
        return count;
    }



    }

