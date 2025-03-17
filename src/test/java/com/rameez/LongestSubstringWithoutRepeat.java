package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// https://www.interviewbit.com/problems/longest-substring-without-repeat/

public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String A) {
        if (A.length() < 2) {
            return A.length();
        }

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int count = 0;
        int startIndex = 0;

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (map.containsKey(c) && map.get(c) >= startIndex) {
                if (count > ans) {
                    ans = count;
                }

                int lastIndex = map.get(c);
                startIndex = lastIndex + 1;

                count = i - lastIndex;
                // todo: delete all values in map that have i < lastIndex;
                map.replace(c, i);
            } else if (map.containsKey(c)) {
                map.replace(c, i);
                count++;
            } else {
                map.put(c, i);
                count++;
            }

            if (i == A.length() - 1) {
                if (count > ans) {
                    ans = count;
                }
            }
        }

        return ans;
    }

    @Test
    public void main() {

    }
}