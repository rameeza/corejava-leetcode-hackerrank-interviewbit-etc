package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/basic-calculator-ii/

class BasicCalculatorII {
    public int calculate(String s) {
        s = s.replaceAll("[ ]+", "");
        // when s is "100+9*567/2-8*200", sArr will be ["100", "+", "9", "*", "567", "/", "2", "-", "8", "*", "200"]
        String[] sArr = s.splitWithDelimiters("[/*+//-]", 0);

        Stack<String> stack = new Stack<>();
        // evaluate '/' (division) & '*'
        for (int i = 0; i < sArr.length; i++) {
            String str = sArr[i];
            if (str.equals("/")) {
                Integer op1 = Integer.parseInt(stack.pop());
                Integer op2 = Integer.parseInt(sArr[++i]);
                Integer ans = op1 / op2;
                stack.push(ans.toString());
            } else if (str.equals("*")) {
                Integer op1 = Integer.parseInt(stack.pop());
                Integer op2 = Integer.parseInt(sArr[++i]);
                Integer ans = op1 * op2;
                stack.push(ans.toString());
            } else {
                stack.push(str);
            }
        }

        // solve '+' & '-'
        int answer = Integer.parseInt(stack.get(0));
        for (int i = 1; i < stack.size(); i++) {
            String str = stack.get(i);
            if (str.equals("+")) {
                answer += Integer.parseInt(stack.get(++i));
            } else if (str.equals("-")) {
                answer -= Integer.parseInt(stack.get(++i));
            }
        }
        return answer;
    }

    @Test
    void test() {
        assertEquals(7, calculate("3+2*2"));

    }
}
