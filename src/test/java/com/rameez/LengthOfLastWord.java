package com.rameez;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/length-of-last-word

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.matches("\\s+")) {
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return (words[words.length - 1]).length();
    }

    @Test
    public void main() {
    }
}