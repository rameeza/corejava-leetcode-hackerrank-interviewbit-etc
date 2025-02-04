package com.rameez;

import org.junit.Test;

import java.util.Arrays;

// https://leetcode.com/problems/next-permutation/

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int indexOf1stDecreasingFromRight = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                indexOf1stDecreasingFromRight = i;
                break;
            }
        }

        if (indexOf1stDecreasingFromRight == -1) {
            Arrays.sort(nums);
        } else {
            // find the element (on right of indexOf1stDecreasingFromRight) which is just greater than no at indexOf1stDecreasingFromRight & swap it.
            int indexOfJustGreaterNoToRight = indexOf1stDecreasingFromRight + 1;

            for (int i = indexOf1stDecreasingFromRight + 1; i < nums.length; i++) {
                if ((nums[i] > nums[indexOf1stDecreasingFromRight]) && (nums[i] <= nums[indexOfJustGreaterNoToRight])) {
                    indexOfJustGreaterNoToRight = i;
                }
            }

            // swap both values
            int temp = nums[indexOf1stDecreasingFromRight];
            nums[indexOf1stDecreasingFromRight] = nums[indexOfJustGreaterNoToRight];
            nums[indexOfJustGreaterNoToRight] = temp;

            // reverse all nos on the right of indexOf1stDecreasingFromRight
            for (int i = 1; i <= (nums.length - indexOf1stDecreasingFromRight) / 2; i++) {
                int fIndex = indexOf1stDecreasingFromRight + i;
                int bIndex = nums.length - i;
                temp = nums[fIndex];
                nums[fIndex] = nums[bIndex];
                nums[bIndex] = temp;
            }
        }

        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }

    @Test
    public void main() {
        nextPermutation(new int[]{2,3,1,3,3});
    }
}