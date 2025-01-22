package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        int noOfNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            noOfNodes++;
            temp = temp.next;
        }

        if (noOfNodes < k) {
            return head;
        }

        ListNode currNode = head;
        ListNode lastNodeAfterPreviousIteration = null;
        for (int i = 1; i <= noOfNodes / k; i++) {
            // reverse k nodes
            ListNode x = currNode;

            ListNode prevNode = currNode;
            currNode = currNode.next;
            for (int j = 2; j <= k; j++) {
                ListNode nextNode = currNode.next;
                currNode.next = prevNode;

                prevNode = currNode;
                currNode = nextNode;
            }
            // link these k nodes with the next k nodes.
            if (lastNodeAfterPreviousIteration != null) {
                lastNodeAfterPreviousIteration.next = prevNode;
            } else {
                head = prevNode;
            }

            // update lastNodeAfterPreviousIteration. this will be used to create link in the next iteration.
            lastNodeAfterPreviousIteration = x;
        }

        if (noOfNodes % k != 0) {
            lastNodeAfterPreviousIteration.next = currNode;
        } else {
            lastNodeAfterPreviousIteration.next = null;
        }

        return head;
    }

    @Test
    public void main() {

    }
}