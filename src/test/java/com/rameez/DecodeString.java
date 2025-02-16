package com.rameez;

import java.util.Stack;

// https://leetcode.com/problems/decode-string/

class DecodeString {
    public String decodeString(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ']') {
                stack.push(c);
            } else {
                // pop alphabetical chars
                StringBuilder sb = new StringBuilder();
                char ch = stack.pop();
                while (ch != '[') {
                    sb.append(ch);
                    ch = stack.pop();
                }
                sb.reverse();

                // get the count of the above alphabetical chars
                StringBuilder countSb = new StringBuilder();
                while (stack.size() > 0 && stack.get(stack.size() - 1) >= '0' && stack.get(stack.size() - 1) <= '9') {
                    countSb.append(stack.pop());
                }
                countSb.reverse();
                int count = Integer.parseInt(countSb.toString());

                // push the above into stack 'count' no of times
                for (int l = 1; l <= count; l++) {
                    for (int m = 0; m < sb.length(); m++) {
                        stack.add(sb.charAt(m));
                    }
                }
            }

        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            answer.append(stack.get(i));
        }
        return answer.toString();
    }
}
