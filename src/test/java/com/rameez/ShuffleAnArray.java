package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/shuffle-an-array/

public class ShuffleAnArray {


    int[] numbers;

//    public ShuffleAnArray(int[] nums) {
//        this.numbers = nums;
//    }

    public int[] reset() {
        return numbers;
    }

    public int[] shuffle() {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i];
        }

        // shuffle using Fisher-Yates Shuffle Algorithm
        for (int i = answer.length - 1; i >= 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));

            int temp = answer[randomIndex];
            answer[randomIndex] = answer[i];
            answer[i] = temp;
        }

        return answer;
    }

    @Test
    public void main() {

    }
}