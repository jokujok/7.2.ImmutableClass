package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator wordsToExecute = () -> System.out.println("ABC");
        PoemDecorator wordsToExecute2 = () -> System.out.println("abc");
        PoemDecorator wordsToExecute3 = () -> System.out.println("AbC");

        poemBeautifier.beautify(wordsToExecute);
        poemBeautifier.beautify(wordsToExecute2);
        poemBeautifier.beautify(wordsToExecute3);
        
    }
}
