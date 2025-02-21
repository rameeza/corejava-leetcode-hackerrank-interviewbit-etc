package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// https://leetcode.com/problems/leaf-similar-trees/

class LeafSimilarTrees {
    ArrayList<Integer> leavesOfroot1 = new ArrayList<>();
    ArrayList<Integer> leavesOfroot2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addLeavesToList(root1, leavesOfroot1);
        addLeavesToList(root2, leavesOfroot2);

        return leavesOfroot1.equals(leavesOfroot2);
    }

    public void addLeavesToList(TreeNode root, ArrayList<Integer> leavesOfroot) {
        if (root == null) {
            return;
        }
        // if it is a root node.
        if (root.left == null && root.right == null) {
            leavesOfroot.add(root.val);
            return;
        }
        addLeavesToList(root.left, leavesOfroot);
        addLeavesToList(root.right, leavesOfroot);

    }

    @Test
    void test() {
    }
}
