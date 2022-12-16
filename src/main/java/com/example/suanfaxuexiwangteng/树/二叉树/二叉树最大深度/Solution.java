package com.example.suanfaxuexiwangteng.树.二叉树.二叉树最大深度;

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
        System.out.println(递归(treeNode1));
        System.out.println(队列(treeNode1));
    }

    static int 递归(TreeNode head) {
        if (head == null) {
            return 0;
        } else {
            return Math.max(递归(head.left), 递归(head.right)) + 1;
        }
    }

    static int 队列(TreeNode head) {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        if (head == null) {
            return 0;
        }
        nodes.offer(head);

        int max = 0;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = nodes.poll();
                if (poll.left != null) {
                    nodes.offer(poll.left);
                }
                if (poll.right != null) {
                    nodes.offer(poll.right);
                }
            }

            max++;
        }

        return max;
    }
}
