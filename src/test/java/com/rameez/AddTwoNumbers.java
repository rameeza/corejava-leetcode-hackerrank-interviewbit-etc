package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode answer = null, prevNode = null;

        while ((l1 != null) && (l2 != null)){
            int val = l1.val + l2.val + carry;
            carry = val/10;
            val = val%10;

            ListNode newNode = new ListNode(val);

            if (answer == null){
                answer = newNode;
            } else{
                prevNode.next = newNode;
            }
            prevNode = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        if ((l1 != null) || (l2 != null)){
            ListNode notNull = l1==null? l2:l1;

            while (notNull != null){
                int sum = notNull.val + carry;
                carry = sum / 10;
                sum = sum % 10;

                ListNode newNode = new ListNode(sum);
                prevNode.next = newNode;
                prevNode = newNode;

                notNull = notNull.next;
            }
        }

        if (carry != 0){
            ListNode newNode = new ListNode(carry);
            prevNode.next = newNode;
        }

        return answer;
    }

    @Test
    public void main() {

    }
}