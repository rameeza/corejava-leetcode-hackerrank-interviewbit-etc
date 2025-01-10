package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/reverse-linked-list-ii/

public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode beforeLeft = null;
        ListNode beforeRight = null;
        ListNode leftNode = null;
        ListNode leftNode2 = null;
        ListNode rightNode = null;
        ListNode afterRight = null;

        ListNode temp = head;

        for (int i = 1; i <= right; i++) {
            if (i == left - 1) {
                beforeLeft = temp;
            }
            if (i == left) {
                leftNode = temp;
                leftNode2 = temp;
            }
            if (i == right - 1) {
                beforeRight = temp;
            }
            if (i == right) {
                rightNode = temp;
            }
            temp = temp.next;
        }
        afterRight = rightNode.next;

        // reverse the nodes b/w left & right
        temp = leftNode.next;
        while (temp != afterRight) {
            ListNode n = temp.next;
            temp.next = leftNode;
            leftNode = temp;
            temp = n;
        }

        // fix the reversed nodes with non-reversed nodes.
        if (beforeLeft != null) {
            beforeLeft.next = rightNode;
        } else {
            head = rightNode;
        }
        leftNode2.next = afterRight;

        return head;
    }

    @Test
    public void main() {

    }
}