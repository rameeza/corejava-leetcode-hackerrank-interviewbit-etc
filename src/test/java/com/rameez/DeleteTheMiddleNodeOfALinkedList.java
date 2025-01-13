package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

public class DeleteTheMiddleNodeOfALinkedList {

    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return head;
        } else if (head.next == null) {
            return null;
        } else if (head.next.next == null) {
            head.next = null;
            return head;
        }

        int noOfNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            noOfNodes++;
            temp = temp.next;
        }

        temp = head;
        ListNode nodeBeforeMiddle = null;
        for (int i = 1; i < noOfNodes / 2; i++) {
            temp = temp.next;
        }
        nodeBeforeMiddle = temp;

        nodeBeforeMiddle.next = nodeBeforeMiddle.next.next;
        return head;
    }


    @Test
    public void main() {

    }
}