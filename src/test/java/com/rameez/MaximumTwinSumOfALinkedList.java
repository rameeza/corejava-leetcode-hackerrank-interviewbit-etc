package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

public class MaximumTwinSumOfALinkedList {

    public int pairSum(ListNode head) {
        ListNode temp = head;
        int noOfNodes = 0;
        while (temp != null) {
            noOfNodes++;
            temp = temp.next;
        }

        int[] twinSums = new int[noOfNodes / 2];

        temp = head;
        for (int i = 1; i <= noOfNodes / 2; i++) {
            int val = temp.val;
            twinSums[i - 1] = val;
            temp = temp.next;
        }

        for (int i = 1; i <= noOfNodes / 2; i++) {
            int val = temp.val;
            int index = (noOfNodes / 2) - i;
            twinSums[index] += val;
            temp = temp.next;
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < twinSums.length; i++) {
            if (twinSums[i] > answer)
                answer = twinSums[i];
        }

        return answer;
    }

    @Test
    public void main() {

    }
}