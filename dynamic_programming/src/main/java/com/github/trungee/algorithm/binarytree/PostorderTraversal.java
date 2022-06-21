package com.github.trungee.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {

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
        List<Integer> output = postorderTraversal(root);
        System.out.println(output);
    }

    private static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()) {
            TreeNode<Integer> top = stack.peek();
            if (top.left == null && top.right == null) {
                list.add(top.val);
                stack.pop();
            } else {
                if (top.right != null) {
                    stack.add(top.right);
                    top.right = null;
                }
                if (top.left != null) {
                    stack.add(top.left);
                    top.left = null;
                }
            }
        }
        return list;
    }
}
