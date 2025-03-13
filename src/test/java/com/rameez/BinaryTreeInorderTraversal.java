package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/

class BinaryTreeInorderTraversal {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<Integer>();
        }

        // we used the same method recursively, we just don't use the value returned.
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);

        return ans;
    }

    @Test
    void test() {
    }
}
