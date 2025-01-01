package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/h-index

public class HIndex {

    public int hIndex(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            int citation = citations[i];
            if (citation > answer) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}