package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/word-pattern/

class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        boolean ans = true;
        String[] sa = s.split(" ");
        if (pattern.length() != sa.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = sa[i];

            if (map.containsKey(c)) {
                String mstr = map.get(c);
                if (!mstr.equals(str)) {
                    ans = false;
                    break;
                }
            } else if (map.containsValue(str)) {
                ans = false;
                break;
            } else {
                map.put(c, str);
            }
        }
        return ans;
    }

    @Test
    void test() {

    }
}
