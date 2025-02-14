package com.rameez;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/min-stack/

class MinStack {
    List<Integer> nos;
    int min;

    public MinStack() {
        nos = new ArrayList<Integer>();
        min = Integer.MIN_VALUE;

    }

    public void push(int val) {
        if (min == Integer.MIN_VALUE) {
            min = val;
        } else if (val < min) {
            min = val;
        }

        nos.add(val);
    }

    public void pop() {

        int n = nos.remove(nos.size() - 1);
        if (n == min) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < nos.size(); i++) {
                int no = nos.get(i);
                if (no < min)
                    min = no;
            }
        }
    }

    public int top() {
        return nos.get(nos.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
