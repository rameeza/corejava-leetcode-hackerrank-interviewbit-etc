package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    @Test
    void test() {
    }
}
