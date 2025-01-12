package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        } else if (head.next == null && n == 1) {
            return null;
        }

        int index = 0;
        ListNode temp = head;
        int noOfNodes = 0;
        while (temp != null) {
            noOfNodes++;
            temp = temp.next;
        }

        index = noOfNodes - n;

        // delete first node when there are multiple nodes
        if (index == 0 && head.next != null) {
            head = head.next;
            return head;
        }

        // delete last node & there are multiple nodes
        else if (n == 1 && head.next != null) {
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        // delete middle node
        else {
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // System.out.println(index);
            // System.out.println(temp.val);
            temp.next = temp.next.next;
            return head;
        }
    }

    @Test
    public void main() {

    }
}