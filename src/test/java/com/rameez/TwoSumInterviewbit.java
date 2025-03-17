package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.interviewbit.com/problems/2-sum/

public class TwoSumInterviewbit {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            Integer no = A.get(i);
            Integer target = B - no;
            if (map.containsKey(target)) {
                ans.add(map.get(target) + 1);
                ans.add(i + 1);
                break;
            } else if (!map.containsKey(no)) {
                map.put(no, i);
            }
        }

        return ans;
    }

    @Test
    public void main() {

    }
}