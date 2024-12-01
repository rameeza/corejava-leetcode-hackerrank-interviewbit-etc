package com.rameez;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/minimum-parantheses/

public class MinimumParantheses {

    public int solve(String A) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '(') {
                stack.push('(');
            }
            if (c == ')') {
                if (stack.size() == 0) {
                    answer++;
                } else {
                    stack.pop();
                }
            }
        }
        answer += stack.size();

        return answer;
    }

    @Test
    public void main() {
        assertEquals(1, solve("())"));
        assertEquals(3, solve("((("));
    }
}