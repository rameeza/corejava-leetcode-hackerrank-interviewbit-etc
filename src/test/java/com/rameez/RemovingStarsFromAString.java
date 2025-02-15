package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Stack;

// https://leetcode.com/problems/removing-stars-from-a-string/

class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            char c = stack.get(i);
            answer.append(c);
        }

        return answer.toString();
    }
}
