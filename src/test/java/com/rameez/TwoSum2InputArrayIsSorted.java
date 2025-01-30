package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int i1 = 0, i2 = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            int no1 = numbers[i1];
            int no2 = numbers[i2];
            if (no1 + no2 > target) {
                i2--;
            } else if (no1 + no2 < target) {
                i1++;
            } else if (no1 + no2 == target) {
                answer[0] = i1 + 1;
                answer[1] = i2 + 1;
                break;
            }
        }
        return answer;
    }


    @Test
    public void main() {

    }
}