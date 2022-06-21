package com.github.trungee.algorithm.binarytree;

public class TreeNode<T> {
    public T val;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T vala, TreeNode left, TreeNode right) {
        this.val = vala;
        this.left = left;
        this.right = right;
    }
}
