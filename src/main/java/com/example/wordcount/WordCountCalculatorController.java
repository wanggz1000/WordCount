package com.example.wordcount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCountCalculatorController {

    WordCountCalculator a = new WordCountCalculator();

    @RequestMapping("/word")
    public int Wordcount(@RequestParam String s){
        return a.Wordcount(s);
    }

}
