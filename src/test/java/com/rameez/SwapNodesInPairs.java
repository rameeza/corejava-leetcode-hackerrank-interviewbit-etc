package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;

        ListNode newHead = head.next;
        ListNode afterTemp = null;

        while (temp != null && temp.next != null) {
            ListNode prevAfterTemp = afterTemp;
            ListNode nextTemp = temp.next.next;

            afterTemp = temp.next;
            afterTemp.next = temp;
            if (nextTemp != null) {
                if (nextTemp.next != null) {
                    temp.next = nextTemp.next;
                } else {
                    temp.next = nextTemp;
                }
            } else {
                temp.next = null;
            }
            temp = nextTemp;
        }

        return newHead;
    }

    @Test
    public void main() {

    }
}