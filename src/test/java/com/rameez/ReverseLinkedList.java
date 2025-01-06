package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode answer = null;
        ListNode l = head;
        ListNode r = head.next;

        while (r != null) {
            ListNode tempR = r.next;
            r.next = l;
            l = r;
            r = tempR;

            answer = l;
        }
        head.next = null;

        return answer;
    }

    @Test
    public void main() {

    }
}