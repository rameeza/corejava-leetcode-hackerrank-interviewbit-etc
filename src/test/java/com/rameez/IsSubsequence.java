package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (t.length() == 0) {
            if (s.length() == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean answer = true;
        int indexInT = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            char c = s.charAt(i);
            for (int j = indexInT; j < t.length(); j++) {
                char cInT = t.charAt(j);
                if (cInT == c) {
                    found = true;
                    indexInT++;
                    break;
                } else {
                    indexInT++;
                }
            }

            if (found == false) {
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