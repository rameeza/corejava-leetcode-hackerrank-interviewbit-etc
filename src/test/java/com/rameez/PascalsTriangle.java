package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/

class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();

            // add 1st value as 1
            list.add(1);

            // add middle values
            if (i > 2) {
                List<Integer> upperList = answer.get(i - 2);

                for (int j = 1; j < upperList.size(); j++) {
                    int sum = upperList.get(j - 1) + upperList.get(j);
                    list.add(sum);
                }
            }

            // add last value as 1
            if (i > 1) {
                list.add(1);
            }

            answer.add(list);
        }

        return answer;
    }

    @Test
    void test() {
    }
}
