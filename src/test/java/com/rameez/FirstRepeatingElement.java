package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

// https://www.interviewbit.com/problems/first-repeating-element/

public class FirstRepeatingElement {

    public int solve(ArrayList<Integer> A) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        // add nos & their counts to map.
        for (int i = 0; i < A.size(); i++) {
            Integer no = A.get(i);
            if (map.containsKey(no)) {
                map.replace(no, map.get(no) + 1);
            } else {
                map.put(no, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int no = entry.getKey();
            int value = entry.getValue();
            if (value > 1)
                return no;
        }

        return -1;
    }

    @Test
    public void main() {

    }
}