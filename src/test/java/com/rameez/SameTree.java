package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/same-tree/

class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        } else if (p == null && q == null) {
            return true;
        } else if (p == null && q != null) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
    }

    @Test
    void test() {
    }
}
