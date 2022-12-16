package com.example.suanfaxuexiwangteng.树.二叉树.平衡二叉树;

import com.example.suanfaxuexiwangteng.树.二叉树.common.TreeNode;

import static java.lang.Math.abs;

/**
 * 一个二叉树每个节点的左右子树的高度差不超过1
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode("1");

        TreeNode treeNode2 = new TreeNode("2");
        TreeNode treeNode3 = new TreeNode("2");
        TreeNode treeNode4 = new TreeNode("4");
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        System.out.println( 递归(treeNode1));
    }

    static boolean 递归(TreeNode head) {

        if (head==null){
            return true;
        }
        return 求树的高度(head)!=-1;
    }

    static int 求树的高度(TreeNode head) {
        if (head == null) {
            return 0;
        }
        int left = 求树的高度(head.left);
        int right = 求树的高度(head.right);
        if (abs(left - right) > 1 || left == -1 || right == -1) {
            return -1;
        }

        return Math.max(left, right) + 1;

    }
}
