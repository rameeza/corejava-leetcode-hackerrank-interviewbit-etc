package com.rameez;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/l-expression-validity-analyzer/

public class LExpressionValidityAnalyzer {


//    public int solve(String s) {
//        Stack<Character> stack = new Stack<>();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '<') {
//                stack.push(s.charAt(i));
//            } else if (s.charAt(i) == '>' && !stack.isEmpty() && stack.peek() == '<') {
//                stack.pop();
//            }
//
//            if (stack.isEmpty()) {
//                count = i + 1;
//            }
//        }
//
//        return count;
//    }


    public int solve(String A) {
        int answer = 0;

        if (A.charAt(0) == '>') {
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '<') {
                stack.push('<');
            } else if (c == '>') {
                if (stack.size() == 0) {
                    break;
                }
                stack.pop();
                answer += 2;
            }
        }

        return answer;
    }


    @Test
    public void main() {
//        assertEquals(2417, solve(">>><><<><<>>>>><>><>>><<>>><><><>>><<<><<<<><><<><<<<><<><<<<<>><><<>><>>><<>>>>><<<<><>><<<<><>>><>>><<>><><<><><<>>><<<><<<><>>>><<<<><<>><<>>>>><<<<<><<><><<>>><>><>>>>>><>><><>>>>><<<<<><>>>><>>>>><><<><<><<>><>><<<<<>>>><<>>>><<>>>><<>><<><<<>>>><><><<<>>><<<><<<<<><><>>><>><>><<>><><<>>>><<<<><>>><<>>><><<<<<>><<><><<<<><>><>><>>>>>>>>>><><<><>><><><<<><<><>>><<<<<>>>>>>>>>><><><<<>>><>><<<<<<<<<><<<<>>>>><><<<<><<><><><><<<<>><>><>><>><<>><>><><>>><<><<><<>>><<<>><><><><<><><<>>><><<<>><<><><><<<<<><<>>>>><<<>>>>>><<<>>>><<<>><<<><<>><<><<>>>><<<><<<>>>><<><<><<<<><><>><<>>>><><<><>><>>>>>><<><<>><<<<><<<><><<<<><<<>><<>>><<><>><><>>>>>><>><>>><<>><<>>><>>>>><><<>>><>>><<<<>>><<>>><><<<>>><<><>><<<>>>>>><><<><<>><>><<<<<><<>><>><<><>>><<><<<>>>>>>><><<>>>><<<<><><>>>><<<>><<<><><<>>><<><>>>><>><>>>><<<><<>><><>><><<<>>>><>>><><<><>><><><<><><<<<>>>><><<>><<>><><><>>><<<<<<<>><>><<<>>><>><>>>>>>>><>><><>>>>>>><<<<<<<>>><<>><<>>>>>><><>>><<<<<<><<>>>>>>><<<<<><>>><>><>>>>><<<<><><<<<>>><<>><>><>>>>>><<>><<<<<<>><><<<>>><>><<<<><><><><<>><>><<><<<<<<><><<>><>><<<<<><<<><>>><<><><><><<<<<><>>><><>><>><>>>><<<<><>>>>><<<><>><<>>>>>>>>><<>>>>>>>><><<<<><<<>><><><<>>><<<<<<<><><<<>>><<>>>>><<><><>><<><><>><><<>>>><><<<<><<<><<<>><<>>>><>><><>><>><><<><<>><><>><<>><<><><><><<>><<<><><>><>><>><<<>><>>><<<>><<<<<>>>><>>>><<>>>><><<<<<<><<><><>>>>><<>><<<<>><><<><><<<>>><><>><><>>><<>>>><><<>><><<<<>>><<><>>><<<<<><<<<<<<>>><<<<<>><<><><>>><<<><>><>><>>><>>>>>><<><<>>>><<<><><><<><<<><<><<><<<<>><>>><>><><<<<>><>>>><<>><<<<>>>><><<><><<<<<>>>>><<<<<<>><>>>><><>><><>><<<>><><<<>><<>><>><>>><<>><><>>><>>>>><<>><>><><>>>>>>><>><<<<<<<<>>><><<<<><<><><>><><>><<>><<>><<><>><<<<>><<><<><<><<<><<<<<><>><<>><>>><<<<>>><<>>><><<>><<<>><>>><<><<<<>><<><>>><<><><<<<>><>><>>>><><><>><>>><><>><><><<><><<><<<>>><<<>>><>><><<>><><>><><><>><<>>><>><>>>><<><><>>>><>>><>>><<<><<<>><><><<>><<><><<><>><<<<><<>>><><<>>>><<<><><>>><<<><><><<>>>><><<<<<<><><>><><<>><><<><><<<>>><<<<><<><><>>>>>>>>>>>><><>><><>><<><>>>>><<><><<<>><<<>>>>><>>>><<<<><><<<<><<>>><><<>>><<><<><><><><><<>>>><<<<><>><><<><<<<<<><<<><<><>>>><><><>>>>>>>>><<<<<>>>><<<><>><<>>>>>><>>><>>><>>><><>><<>>><<><<><><>>><>>>><><<>>>><>>>><>><<><<>>>><><<<<<<>><><><><><>>><><><<<><><<><>><><>><<>>><><>><>><<<<>>><>>><<>><<<>><><><><><><<>>><><<>><<>>><<><>><>>><><<<><>>>>>><>>>>>><><<>><>>><<<><<<>><>>>><><>><>><<>><>>><<><>><><<<>>>>><<<<<<<<<>>>><<><<<><<<><<>>>><<<<>><>><><><<<<><<<<>><<><<<<>><<<<<><<>><<<><><<<><<><<>>>>><<><><<><>>>><><<<>>><>>><><>>>><<<>>><<<<>>><>><<><>><<<>>>><>><<><<><<<><>><>><<<><>>>>>>><<>>><<<<><<>><<><<>>>><>><<<>><<<><><<>>><<><<<>><><<><<<>>>><>><<>><>><>><>><<<><<>>><>>>><<>><<<><<><<<><<<>>>><>>><<<<>><><><<><<>>><>>>><<>><<<><><<><><<<>>><>><<>><<><><<<>>><<<>>>><>>>><<>><<<><<><<><<<<<><>>>>><<>><<>><><<><>><>><<><<<>>>>><<><><>><<><<<><<><<<<<><>><<><<><>><<<<>>>>>><>>>>>>>>>><<><><<<<><>><<>><>><>>><><><>><<>>>>><<<><<>><>><><<<<><<<<><<>>><<>><<>><<<<><><>><<><>><>>>><<>><>>><><<<<>><<<<<><<<>><><><<><<>>><<<<><<><>>>><<<><<<<<><>>>>><><<><<<<<<<>>><<><<>>>><><<><<><>>><<><>>>><><><<<<<>>><<<>><<<><><>>><>><<<<>><<<><<>><<><><>><>>><>><<><>>><>><><<<<<><<>>><>>>>><>><>><<<><<<>>>>>>><>><><<>><<><<>>>>><><<>><<<<><<<<<><><<>><><>>><>>>><>>>>>>>>><><<>><><><<<>>><>>><>><<<<>><>><>>>>><<<<<>><><>>>><<<<><<><<<><<><><>>><<<<><><<<<<<><<><<<><>><>><<>><<<<><<>><<<><<>>><><<<<><<<<><><<<<<<<<<><<><><><><>><>><><><<><<<>>>><<<><>><>>>><<<<><><><><>>>><>>>>><<><><>><<<>>>>>><><>><<><><<><>>><<<<>><<>><>><<<<<>><><><<><<<<<<<<<>><<<>><<><<>>><><<><><<<><>>>><<><><<<<>><<><<<>>><>><<<<<><<>>><<<<<<><>><<>>>>>><<>><><>>>><><<<<><<<<>><><><>><<<<<<>><<><<><><>>>>><<<<<<<><>><><><>><><<>><<>>><<<<<<>>>><<<<<<<>><<<>><<>>>><>>><><><<><>>><<<>><>><>><><<<<<><<>><<<><>><<<<>>>>>>>><<<>>><<><><<>><<>>>>><<>><><>><>><<>><<<<<><><><>><<><><><><<>><<<><><<<<><><<<>><<<<>><<<<><>>>>>><<<><>><>>><<<>>>>>>><>><><<><<<<<<>><<<><<<>>><><><<<<<>><>><<><<>>><<<><><<<<>><<<<><><<<><<<>><<<><>><<>>><<<<><<><>><<><<><<><>>><<>>><>><<<<><>><><<<>><><>>><<<>><><><<<<>><>>><<>>><><><><><><>>><<<><<<><<>><>>>>><<>><<<<<<><<><><><><<<><<<<><<<<<><><<>>>><>>>>>>><<>><><>><<<><><<<><>><><<<>><>>>><<<><<><>><><<><>>>>>>>><<<>>>><<<>><<<><><<<<>><>>><>>><><><<>><<>>>><><<><><<<>><<<<<<>>>>><<<>>><>>>><><<>>><><><<<<<<>>>>>><><>>>><><<><<<>>><>><<<<<><<>>><><<>><<><<<<<<<<>>>>>>><<>><><<><<><>><<<<><><<<<>>>>>><<>><><<<>><>><<><>>><><><>><<><><<>><<<>>><><><><><<><><><><>><<<><<<>>><<<<><<>><<<><<<<><<><>>>>><<>>><><<><<<<><><>><<<><<<<<><>><<<><><><<><<<<>>><<>>><>>><<>><>><><>><<<>><><<<<>><<><>>><<<>><>><<<<<<><<<><<<<><<><<><<<<><>>>>><><><<><>>>><<<<><><><<><<<<><<<<>>><<<<<><<<<>>>>><<>>><>>><>>><><>><<<>><<>>><><>><<<><<><><><>>>><>><>><<>>>><><<<<<<<<>>><<>>><<>><<<<<><<<<><><><>>>><>><>><><>>>>><>><<><><><<<>>><<<><>><<><>><<><<><><<><<<>>><><>>><<<>><>>>><<<<><>>>><><>><<>><><<<>><>>>><<<>><<<<><>><><<<<<<>><<<>><>><>><><>>><>><<<><><<<><<<><<<<>><><><><<>>>><<>>>>>><<><><><>>>><>>>><>>>><>><<><><<>><>><>><<<<<><<<<<><<>>>><>>><><><><><><<><<>><<<><<<>>>><>>><>>>><<<<<<>><>><><>>><<>><>><>>><><<<><<>><>>>>><<>>>><<<>>><<<<><<>><><><>><<>><>>>><<><><<><>><><<<><>>><>><<><<<><<<<<>>>><>><<<><<<>>>>><<<><>><<<>>><><>><>>>><<><<<<><<<>><<<>>><<><<>><>>><><>>>><<<><<><><<<><>><>>>>>><>>>>>>>><<>><>><<<<>>><><<<><<><<<>>>>>><><>>>>>>>><><><>><><<>><<><<>><<<<<>><<><><><<>><>><><<><>><<<<>><><<<<<<<><<>>><>>>><>>><><<<<<<>><><>><<><<>>><>><><<<<><>>><>><<>>>>>><>>>><>><>>>><>>><<<>><<>>><<<<<<<>>>>>><>>>><<<><<><<>>>>><<><><>><<<>><>>>><<>><<<<<>><>>><><>><<><<><<<>>>><><<<>>><<<><<<><<><>><><>>><><<<>>>>>>>>><<><<<>>><>>>><<<<<<<<<<<<><>>><<><<>>>>>>><>>>>>><><<<<>>><<<><<>><<<>>><><<>>>>><<><><><<<<><<><<<<>>>>>><>>><><><>><<<><<>>>>><<<><>>><<><><<<><>><><<>>>><><>>><<<<><><>>><<>>>><<>>>>>><<<<<<<<>>>><<<><<<><><<<<<>>>><>><><>>><><><><<<><<><<><>><><<>>>><<>>><<>>><><<><>>><>><>><<><>><<><<<<<>>><<<><>>>>>><<><<><>><<<<>>>><<>><<<><><>>><><<><>>>>>><><<<<><><>>><<>>><>>><<<<<>><>><><><<><<<<<>>>>>>><<<<<><><<>>><>><><<>>><<>>>><<<<>>>>>>>><>>>><><>>>>><<><<><<><><><<><<>>>><><>>>><<<<<><<<><>>><<>>>><><<<<<><>><><<<>>>>>><><<><<>><<><><><<<>>><<><<<<<>>>>>>><<>><<<><>>>><><<<<><<<<<>><><>>><>>>><><<<>>><>>><>>>><<<<<<<<><<><><<>>>><<<<<<<><><>><<<>>><<>>><><<<<><<<<<>>><>>>><>><<<<>>><>><>>><><>>><<>><<><><<<>><<<><<><>>>><><<<><><<<<><<>><<<>>>>>>>>>>><<<><<<<><<><<>><<><<<><<><>><>><<<><><<<<><<<<>><>>><<>>>>><>>>>><<<<><><><<<<>>>><<>><<><<<>><><<<><><><<<><><<>><<<><<<<><><<>>>>>>>>>>><><><><<<><<<<>><><<<>><><><>>>><><<<>><>><><<><>>>><<<>>>>><<>><<<<><><<>>><<>>>>><<<<><><<<><<<>>><<><<<><>>><<><><<<<>>><<<><><>><<><><<>>>><>><><<<<<<<><<<>>><<<>><><>><<<><<><<>>><<><>>><<<<><>><<>>><>>><><<<<><><>>><<<<<<><>><<>><><>>>>><<<<<>>>>>><<>><<<<><><><<>><<>>><<<>><>><<>><><<><>>><<<<<<<<<><>>>>>>><<>>><>>>>><><><>><<>><<>><>><<<<<<<>>>><>><><><<>>><><><>><<<<>><>>>>>><>>>>>><>>><>><<>>><<<<<>><>><>><>>><><<>><<><<<<<<<<<<<><>><<><>><>><<>><><<><>>>><>>><<<><>><<><>>><<>>><<<>><<>><>>>>><<<>><>><<>><<<<<<<<<<>>>><<<><<><><<<<><<<>><<<><<>><><<><<<<>><<><><<><>>><>><>>><<<><><<<<>>>>><><>>><>>><>><<<<>><><>>>>>><<<><<<><>>><><>>><<>><>>><<>>><<>>>><<>>><<<><><<><<><><<><><<<>><><<><><>>><<<<>>><><<<><><>><>><<<<<<>><<<>>>><>>>>>><>>><>><<<><><<<><<<<<<<<<><<<>>><>><<><>>><<<<>>><<<<>>><>><<<>>>>><<<<<<><<>>><>><><>>><>>>><>>>><>>>><>>><<><>>>>><<<<>><<><>><<>><<<<<><<<><<<>>>>><><<><<<<><<>>>>><<<>><><<<><><><><>>>><><><<><<<><>><<>><><<><<>><<><<><<>>>>><<<<<>>><><<>>><><>>>><<<><<<><><>><><><>><>>><>><>><<<>><>>>>><<>><><<>>><<<>>>><<><<><><><><<><<<<><<<<<>><<>><<>>><<<><>><<><>><<><<><>><><><><>>>>><><<>><><<>><<<>><<><<<<<><>><<<<<><<>><<<>>><<<<>><<<<<<<<<<><<><><><<<><>>><<>>>>>>>>>>><<><<<<<<><><<<<<><<><<<<><>><<><<>><><>><<><>>><<<><><><<<>>><><<<><<<>>><>><><><<<<<><><><>><><>><><>><><<<><>>><<<<>><><<<><>><<<<<<<<><<<><><><<>>>>>>><<><<>><<<><><<>>><<><><<<>><<<<<><<><<<><<<><>><>>><><><>><>><><><>>><<><><<<<>><>><<><<<<<<><<<<>>><<<<><<<><<<<>><<<<<><>><<>><><><><<>>><>>><<><>><><><<<><><><><><<<<><><>>><>><<<<>><>><><<<<<>>><<<>>>>>><<>><><>><>>><<>><<>>>><><>>>><>>>>><<<><><>><><<<<<>><<>>><<<<><>>>>><>><<<>>><>>>>><<>><><>>>><><>>>>>><<>><<<<<<<<<<<>>><><>><>><><><<>>>>><><><><>><>>><<><><>>><><>>><><<<<<><<<<<><<>>><>><<<<><><>>><<><<<<<>>>><><<<<<><><<<<<<<>><<<<<<>><><<><>><>><>><><>>>><<<>>>>><<><<<<><>><>>><>><><<<<<<<<<<<><<><<>><<<<<><><<<><<<>>><<><><<><<<><>>><<<><<><>>>><>>>>><<<<<><><><<><><<><>><<>>><<<><<<<><>><<>><<>><<><><><>><<<<><<<><><<><<>><<<<<<<>>>><><><><><>>><<><><><<<>><>><<<><<<>><<<<><<<<<><><><>>><<>>>>><>><<<<<<>>>>>>><<<>><><<>>>><>><>>><>><<<<<>><<>>><<<<<><<><<<<><<>>><><<<><><<<<<>>>><<>><<><<<><<<<><<>>><<><><>>><><<<<<<<<><<<>>>><<>><<>>>><><<<>><<<>>>><>>><>><<<<>>>>><>><<>><><>>><<<>>><<<<<>>><<<>><>><>>><><<>><><>><>><><>>><<<>>>>><>>>><>><><><<><>><><<<><><>><<<><<><<><>>><<<<<>><>><><>><<<<>>><>>><<<<<><><>><<<><><<><<<<>><<<<<><<<<<>>><<<<>><<<<<>>>>>><><<><>><>><>><<<<><<>><<<><>>>><<<<><><><<><<<><<><<<><><><<><>>>><<>>>><<>>>><<<>><>><<><<><<<><<<><<<><><<<><<<<><<<<<><>><><<<>>>><><<<<>><<<>>>><<>>>><<>><<><><><<><><>>><>>>>>>><>><><><<<><<>>><<<<<<<<>><<<><<<>>>><>>>><<<><><<>>>>><>>>><<>><><<<><>>><>><><<><<<><>><<<<<<><>>>><<>><<>><>>><<<>>><<<<><<<<>><<<>>><<><><<<<>><<><><><<>><>>>>><><>>>>><><><>>><>><>>>><>><<>>><><<>><><>><><<<>>><<<<>><>><<><>>>>>><>>>>>><>><<<<>>><>><<<><><><<>><<><>><>>>><<<<>>><><><><<>><>>>><>><<<>><><<<><<<>>><<<>>>><><><<<><<>>><><<><>><><>><>>>>><>>>>>>><>>>>><>><<<>><<><<<>><<>>><<><<<<>>>>><>><<>><><<<<>><>>>><><><>>>><<<<><<<><<>><<<>><><>><<<<><><><<<<>><<><<>>><>>>><>><><><>><>>><>><><>><>>>><><>><>>>><<><<<<<><<<>>><<>><><<<>>><>><<<>><><<<<<<><<>><<<><><><><>><<>><>><<>><<<><<<>><>>>>>><>><><<<<>>>><<>><><>>><<><>>>><<<<<><<>><>><><<><><>>>><>>>>><<<<>><><<><><<>><<><><<><>><<><>>>>><<>>><>>><<<<>><><<<<><>><<<<<><>><<<<<><><><>><<<<><<<<<>><>><>>><>><><<><<<>..."));
        assertEquals(4, solve("<<>>"));
        assertEquals(0, solve("><"));
        assertEquals(2, solve("<>>>"));

    }
}