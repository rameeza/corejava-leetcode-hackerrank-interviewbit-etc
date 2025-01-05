package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();

        String[] words = s.trim().replaceAll("[ ]+", " ").split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                answer.append(words[i]);
            } else {
                answer.append(words[i] + " ");
            }
        }

        return answer.toString();
    }

    @Test
    public void main() {

    }
}