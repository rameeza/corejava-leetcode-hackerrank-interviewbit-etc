package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// https://www.interviewbit.com/problems/reverse-the-string/

public class ReverseTheString {

    /**
     * Reverses the words in the input sentence.
     *
     * @param A the sentence to be reversed.
     * @return the reversed sentence.
     */
    public String solve(String A) {
        // gets words from the sentence.
        String[] words = A.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sb.append(word);
            if (i != 0)
                sb.append(" ");
        }

        return sb.toString();
    }

    @Test
    public void main() {
        assertEquals("blue is sky the", solve("the sky is blue"));
        assertEquals("ib is this", solve("this is ib"));
        assertEquals("blue is sky the", solve(" the    sky is blue "));
    }
}