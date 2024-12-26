package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/ransom-note/


public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomLetters = new HashMap<>();
        Map<Character, Integer> magazineLetters = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            if (ransomLetters.containsKey(c)) {
                ransomLetters.replace(c, ransomLetters.get(c) + 1);
            } else {
                ransomLetters.put(c, 1);
            }
        }

        for (char c : magazine.toCharArray()) {
            if (magazineLetters.containsKey(c)) {
                magazineLetters.replace(c, magazineLetters.get(c) + 1);
            } else {
                magazineLetters.put(c, 1);
            }
        }

        boolean answer = true;

        for (Map.Entry<Character, Integer> entry : ransomLetters.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (magazineLetters.containsKey(c)) {
                int magazineCount = magazineLetters.get(c);
                if (magazineCount < count) {
                    answer = false;
                    break;
                }
            } else {
                answer = false;
                break;
            }

        }


        return answer;

    }

    @Test
    public void main() {

    }
}