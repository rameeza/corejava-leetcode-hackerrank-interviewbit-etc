package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/isomorphic-strings/

class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else if (s.length() == 1) {
            return true;
        } else {
            boolean answer = true;
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char cS = s.charAt(i);
                char cT = t.charAt(i);

                // compare chars in both strings
                if (map.containsKey(cS)) {
                    char c = map.get(cS);
                    if (cT != c) {
                        answer = false;
                        break;
                    }
                } else if (map.containsValue(cT)) {
                    answer = false;
                    break;
                } else {
                    map.put(cS, cT);
                }
            }
            return answer;
        }
    }

    @Test
    void test() {
        assertEquals(false, isIsomorphic("foo", "bar"));
    }
}
