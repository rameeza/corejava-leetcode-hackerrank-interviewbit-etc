package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/

class MinimumAbsoluteDifferenceInBST {

    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < ans) {
                ans = diff;
            }
        }
        return ans;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    @Test
    void test() {
    }
}
