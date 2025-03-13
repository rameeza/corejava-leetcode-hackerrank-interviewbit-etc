package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/search-in-a-binary-search-tree/

class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else if (root.val > val) {
            return searchBST(root.left, val);
        }

        return null;
    }

    @Test
    void test() {
    }
}
