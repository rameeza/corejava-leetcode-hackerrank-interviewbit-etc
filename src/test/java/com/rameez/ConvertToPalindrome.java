package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/convert-to-palindrome/

public class ConvertToPalindrome {

    public int solve(String A) {

        // return special case
        if (isPalindrome(A) && (A.length() % 2 == 1)) {
            return 1;
        }

        StringBuilder sb = new StringBuilder(A);
        StringBuilder sb2 = new StringBuilder(A);

        for (int i = 0; i <= (sb.length() / 2); i++) {
            if (sb.charAt(i) != sb.charAt(A.length() - i - 1)) {
                String s1 = sb.deleteCharAt(i).toString();
                String s2 = sb2.deleteCharAt(A.length() - i - 1).toString();

                if (isPalindrome(s1) || isPalindrome(s2)) {
                    return 1;
                } else {
                    return 0;
                }

            }
        }

        return 0;
    }

    public boolean isPalindrome(String A) {
        boolean answer = true;

        for (int i = 0; i <= (A.length() / 2); i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    @Test
    public void main() {
        assertEquals(1, solve("epyyevdadveyype"));
    }
}