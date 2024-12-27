package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses

public class ValidParentheses {

    public boolean bracketsMatch(char popped, char c) {
        if (popped == '(' && c != ')')
            return false;

        if (popped == '{' && c != '}')
            return false;

        if (popped == '[' && c != ']')
            return false;


        return true;
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0)
                    return false;

                char popped = stack.pop();
                if (!bracketsMatch(popped, c)) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }

    @Test
    public void main() {

    }
}