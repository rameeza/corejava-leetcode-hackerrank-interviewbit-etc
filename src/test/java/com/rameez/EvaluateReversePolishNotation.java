package com.rameez;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/

class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int o2 = Integer.parseInt(stack.pop());
                int o1 = Integer.parseInt(stack.pop());
                Integer o = 0;

                if (s.equals("+")) {
                    o = o1 + o2;
                } else if (s.equals("-")) {
                    o = o1 - o2;
                } else if (s.equals("*")) {
                    o = o1 * o2;
                } else if (s.equals("/")) {
                    o = o1 / o2;
                }
                stack.push(o.toString());
            } else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
