package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/symmetric-tree/

class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    public boolean check(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) {
            return false;
        }

        return (n1.val == n2.val && check(n1.left, n2.right) && check(n1.right, n2.left));
    }

    @Test
    void test() {
    }
}
