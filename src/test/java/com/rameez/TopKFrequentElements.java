package com.rameez;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/top-k-frequent-elements/

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int[] counts = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            counts[index++] = e.getValue();
        }

        Arrays.sort(counts);

        int minFreq = counts[counts.length - k];

        int[] answer = new int[k];
        int answerIndex = 0;

        // add all elements whose freq is higher than minFreq
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > minFreq) {
                answer[answerIndex++] = e.getKey();
            }
        }

        // add all or some elements whose freq is equal to minFreq
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (answerIndex >= answer.length) {
                break;
            }

            if (e.getValue() == minFreq) {
                answer[answerIndex++] = e.getKey();
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}