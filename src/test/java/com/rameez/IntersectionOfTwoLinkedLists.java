package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode answer = null;

        Set<ListNode> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                answer = headB;
                break;
            }
            headB = headB.next;
        }

        return answer;
    }

    @Test
    public void main() {

    }
}