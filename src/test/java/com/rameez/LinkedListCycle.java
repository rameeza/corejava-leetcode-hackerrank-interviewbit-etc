package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/linked-list-cycle/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        boolean answer = false;
        Set<ListNode> set = new HashSet<>();

        for (; head != null; head = head.next) {
            if (!set.contains(head)) {
                set.add(head);
            } else {
                answer = true;
                break;
            }
        }
        return answer;
    }

    // APPROACH 2: EXECUTES FASTER ("tortoise and hare" algorithm)
    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        boolean answer = false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        for (; fastPointer != null; ) {
            if (slowPointer == fastPointer) {
                answer = true;
                break;
            }
            slowPointer = slowPointer.next;

            if (fastPointer.next == null) {
                break;
            }
            fastPointer = fastPointer.next.next;
        }

        return answer;
    }


    @Test
    public void main() {
    }
}