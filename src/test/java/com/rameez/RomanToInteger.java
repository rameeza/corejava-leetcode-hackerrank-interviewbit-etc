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

    @Test
    public void main() {
        assertEquals(1994, romanToInt("MCMXCIV"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(3, romanToInt("III"));
    }
}