package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/delete-node-in-a-linked-list/

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    @Test
    public void main() {

    }
}