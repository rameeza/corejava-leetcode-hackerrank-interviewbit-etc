package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/

class FindTheDifferenceOf2Arrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<Integer> list1 = new ArrayList<>();
        // for (int i=0; i<nums1.length; i++){
        //     if (!set2.contains(nums1[i])){
        //         list1.add(nums1[i]);
        //     }
        // }

        for (int i : set1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        // for (int i=0; i<nums2.length; i++){
        //     if (!set1.contains(nums2[i])){
        //         list2.add(nums2[i]);
        //     }
        // }

        for (int i : set2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }

    @Test
    void test() {

    }
}
