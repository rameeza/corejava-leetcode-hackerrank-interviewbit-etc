package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (target < nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int answer = 0;
        while (true) {
            if (target == nums[l]) {
                return l;
            } else if (target == nums[r]) {
                return r;
            }
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            // break
            if (mid == l || mid == r) {
                return l + 1;
            }

            if (target > nums[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }
    }

    @Test
    public void main() {

    }
}