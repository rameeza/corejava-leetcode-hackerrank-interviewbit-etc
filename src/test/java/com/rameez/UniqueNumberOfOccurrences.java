package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/unique-number-of-occurrences/

class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int no = arr[i];
            if (map.containsKey(no)) {
                int count = map.get(no);
                map.replace(no, count + 1);
            } else {
                map.put(no, 1);
            }
        }

        Set<Integer> valuesSet = new HashSet(map.values());
        return (valuesSet.size() == map.size());

        // boolean ans = true;
        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int key = entry.getKey();
        //     int count = entry.getValue();
        //     map.remove(key);

        //     if (map.containsValue(count)){
        //         ans = false;
        //         break;
        //     }
        // }

        // return ans;
    }

    @Test
    void test() {

    }
}
