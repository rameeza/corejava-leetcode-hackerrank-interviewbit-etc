package com.rameez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// https://www.interviewbit.com/problems/kth-node-from-middle/


public class KthNodeFromMiddle {

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int solve(ListNode A, int B) {
        List<Integer> nos = new ArrayList<>();
        while (A != null) {
            nos.add(A.val);
            A = A.next;
        }

        int answerIndex = (nos.size() / 2 + 1) - B - 1;
        if (answerIndex < 0) {
            return -1;
        }
        return nos.get(answerIndex);
    }

    @Test
    public void main() {

    }
}