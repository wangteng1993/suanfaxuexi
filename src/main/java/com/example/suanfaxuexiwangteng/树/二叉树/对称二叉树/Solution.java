package com.example.suanfaxuexiwangteng.树.二叉树.对称二叉树;

import com.example.suanfaxuexiwangteng.树.二叉树.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode("1");

        TreeNode treeNode2 = new TreeNode("2");
        TreeNode treeNode3 = new TreeNode("2");
        TreeNode treeNode4 = new TreeNode("4");
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;


        System.out.println(递归(treeNode1.left, treeNode1.right));
        System.out.println(队列(treeNode1));
    }

    /**
     * 递归
     *
     * @return
     */
    static boolean 递归(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val == right.val) {
            return 递归(left.right, right.left) && 递归(left.left, right.right);
        } else {
            return false;
        }
    }


    /**
     * 队列
     *
     * @return
     */
    static boolean 队列(TreeNode head){
        Queue<TreeNode> nodes = new LinkedList<>();
        if (head.left==null&&head.right==null){
            return true;
        }
        nodes.offer(head.left);
        nodes.offer(head.right);
        while (!nodes.isEmpty()){
            TreeNode right = nodes.poll();
            TreeNode left = nodes.poll();
            if (left == null && right == null) {
                continue;
            } else if (left == null || right == null) {
                return false;
            } else if (!right.val.equals(left.val)){
                return false;
            }
            nodes.offer(right.left);
            nodes.offer(left.right);

            nodes.offer(right.right);
            nodes.offer(left.left);
        }

        return true;
    }
}
