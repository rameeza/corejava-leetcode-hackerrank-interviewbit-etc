package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('p', 4); // IV
        map.put('q', 9); // IX
        map.put('r', 40); // XL
        map.put('s', 90); // XC
        map.put('t', 400); // CD
        map.put('u', 900); // CM

        s = s.replaceAll("IV", "p");
        s = s.replaceAll("IX", "q");
        s = s.replaceAll("XL", "r");
        s = s.replaceAll("XC", "s");
        s = s.replaceAll("CD", "t");
        s = s.replaceAll("CM", "u");

        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            answer += map.get(c);
        }

        return answer;
    }

    // APPROACH 2: EXECUTES FASTER
    public int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            Character c = s.charAt(i);
            if (map.get(c) >= map.get(s.charAt(i + 1))) {
                answer += map.get(c);
            } else {
                answer -= map.get(c);

            }
        }
        // add value of last character.
        answer += map.get(s.charAt(s.length() - 1));
        return answer;
    }

    // APPROACH 3: EXECUTES FASTER THAN THE ABOVE 2
    public int romanToInt3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (s.length() == 1) {
            return map.get(s.charAt(0));
        }

        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            char prevC = s.charAt(i - 1);
            char c = s.charAt(i);

            int prevV = map.get(prevC);
            int v = map.get(c);

            if (v > prevV) {
                ans -= prevV;
            } else {
                ans += prevV;
            }
            if (i == s.length() - 1) {
                ans += v;
            }
        }
        return ans;
    }

    @Test
    public void main() {
        assertEquals(1994, romanToInt("MCMXCIV"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(3, romanToInt("III"));
    }
}