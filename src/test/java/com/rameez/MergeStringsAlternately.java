package com.rameez;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

// https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately {

    /**
     * Merges two strings alternately.
     * <p>
     * For example, if the input strings are "abc" and "pqr", the output string
     * will be "apbqcr".
     * <p>
     * If the strings are not of equal length, the extra characters of the longer
     * string are appended to the end of the merged string.
     *
     * @param word1 the first string to be merged.
     * @param word2 the second string to be merged.
     * @return the merged string.
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        String appendThis = null;
        int length1 = word1.length();
        int length2 = word2.length();
        int lastIndex;
        if (length1 > length2) {
            appendThis = word1.substring(length2);
            lastIndex = length2 - 1;
        } else if (length2 > length1) {
            appendThis = word2.substring(length1);
            lastIndex = length1 - 1;
        } else {
            appendThis = "";
            lastIndex = length1 - 1;
        }

        for (int i = 0; i <= lastIndex; i++) {
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(i));
        }
        return answer.append(appendThis).toString();
    }

    @Test
    public void main() {
        assertTrue(mergeAlternately("abc", "pqr").equals("apbqcr"));
        assertTrue(mergeAlternately("ab", "pqrs").equals("apbqrs"));
        assertTrue(mergeAlternately("abcd", "pq").equals("apbqcd"));
    }
}