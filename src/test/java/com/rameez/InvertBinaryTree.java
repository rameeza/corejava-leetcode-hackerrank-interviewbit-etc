package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/invert-binary-tree/

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    @Test
    void test() {
    }
}
