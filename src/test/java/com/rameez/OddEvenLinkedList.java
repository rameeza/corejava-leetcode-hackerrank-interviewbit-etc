package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/odd-even-linked-list/

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode headOfEven = head.next;
        ListNode tailOfOdd = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode even = temp.next;
            if (even != null) {
                tailOfOdd = temp;
                temp.next = even.next;
                if (temp.next != null) {
                    even.next = temp.next.next;
                }
            } else {
                tailOfOdd = temp;
                break;
            }
            temp = temp.next;
        }

        tailOfOdd.next = headOfEven;
        return head;
    }

    @Test
    public void main() {

    }
}