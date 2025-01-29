package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int indexIn2 = 0;
        boolean nums2Traversed = false;
        for (int i = 0; i < nums1.length && (!nums2Traversed); i++) {
            int noIn1 = nums1[i];
            for (int j = indexIn2; ; j++) {
                if (indexIn2 == nums2.length) {
                    nums2Traversed = true;
                    break;
                }
                int noIn2 = nums2[indexIn2];
                if (noIn2 > noIn1) {
                    break;
                } else if (noIn2 == noIn1) {
                    answer.add(noIn1);
                    indexIn2++;
                    break;
                } else {
                    indexIn2++;
                }
            }

        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }

    @Test
    public void main() {

    }
}