package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/count-complete-tree-nodes/

class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    @Test
    void test() {
    }
}
