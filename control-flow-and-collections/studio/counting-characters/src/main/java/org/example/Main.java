package org.example;
import java.util.HashMap;
import java.util.Map;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String sampleString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = sampleString.toCharArray();

        HashMap<Character, Integer> letters = new HashMap<>();
        // loop thru array one character at a time
        for (char character : charactersInString) {
            if (character.isLetter(character)) {
                if (letters.containsKey(character)) {
                    letters.put(character, letters.get(character) + 1);
                } else {
                    letters.put(character, 1);
                }
                for (Map.Entry<Character, Integer> item : letters.entrySet()) {
                    System.out.println(item.getKey() + ": " + item.getValue());
                }
            }
        }
    }
}