package com.example.suanfaxuexiwangteng.树.二叉树.翻转二叉树;

import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.树.二叉树.common.TreeNode;

public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode("1");

        TreeNode treeNode2 = new TreeNode("2");
        TreeNode treeNode3 = new TreeNode("3");
        TreeNode treeNode4 = new TreeNode("4");
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        System.out.println(JSONUtil.parse(treeNode1).toString());
        递归(treeNode1);
        System.out.println(JSONUtil.parse(treeNode1).toString());

    }
    static void 递归(TreeNode head) {

        TreeNode 临时 = head.left;
        head.left=head.right;
        head.right=临时;
        if (head.left!=null){
            递归(head.left);
        }
        if (head.right!=null){
            递归(head.right);
        }

    }

    }
