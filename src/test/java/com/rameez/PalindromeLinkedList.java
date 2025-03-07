package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/palindrome-linked-list/

class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        boolean answer = true;
        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            if (head.val != list.get(i)) {
                answer = false;
                break;
            }
            head = head.next;
        }
        return answer;
    }

    @Test
    void test() {

    }
}
