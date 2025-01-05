package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/count-and-say/

public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        StringBuilder answer = new StringBuilder("1");

        for (int iter = 2; iter <= n; iter++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            char prevC = answer.charAt(0);
            for (int i = 1; i < answer.length(); i++) {
                char c = answer.charAt(i);
                if (c == prevC) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(prevC);
                    prevC = c;
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(prevC);
            answer = temp;
        }

        return answer.toString();
    }

    @Test
    public void main() {

    }
}