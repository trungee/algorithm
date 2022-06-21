package com.github.trungee.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

    public static void main(String[] args) {
        /**
         * LeetCode 94. Binary Tree Inorder Traversal ITERATIVELY - Interview Prep Ep 75
         * input: [1, null, 2, 3]
         * output: [1, 3, 2]
         */
        /**
         *                  1
         *              /      \
         *           null        2
         *                     /
         *                   3
         */

        TreeNode<Integer> root = new TreeNode<>(
                1,
                null,
                new TreeNode<>(2, new TreeNode<>(3, null, null), null));
        List<Integer> output = preorderTraversal(root);
        System.out.println(output);
    }

    private static List<Integer> preorderTraversal(TreeNode<Integer> root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;
    }
}
