package com.rameez;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/path-sum/

class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                return true;
            } else {
                return false;
            }
        }

        return (hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val));
    }

    @Test
    void test() {
    }
}
