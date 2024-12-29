package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii


public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int answer = nums.length;

        // have different variables to 'count the no. of times loop should run' & to 'refer to the index of the current no we ara analysing'
        int lc = 2; // loop counter
        for (int i = 2; lc < nums.length; i++, lc++) {
            if ((nums[i] == nums[i - 1]) && (nums[i - 1] == nums[i - 2])) {
                answer--;
                //shift all elements once
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                // whenever nos are shifted, we must analyse the no at the same index again.
                i--;
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}