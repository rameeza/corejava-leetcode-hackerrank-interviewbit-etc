package com.rameez;

import org.junit.Test;

// https://www.interviewbit.com/problems/reverse-link-list-recursion/

public class ReverseLinkListRecursion {

    public ListNode reverseList(ListNode A) {
        if (A.next == null) {
            return A;
        }

        ListNode prev = A, cur = A.next, ans = A;
        ListNode nextNode = cur;

        while (nextNode != null) {

            nextNode = cur.next;
            cur.next = prev;

            prev = cur;
            ans = cur;
            cur = nextNode;
        }
        A.next = null;

        return ans;
    }

    @Test
    public void main() {

    }
}