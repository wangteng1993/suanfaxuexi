package com.example.suanfaxuexiwangteng.树.二叉树;


import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.树.二叉树.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 左子树--》根节点---》右子树
 */
public class 中序遍历 {
    public static void main(String[] args) {

        TreeNode TreeNode1 = new TreeNode("1");

        TreeNode TreeNode2 = new TreeNode("2");
        TreeNode TreeNode3 = new TreeNode("3");
        TreeNode TreeNode4 = new TreeNode("4");
        TreeNode1.left = TreeNode2;
        TreeNode1.right = TreeNode3;
        TreeNode2.left = TreeNode4;
        List<String> list = new ArrayList<>();
        循环遍历_栈(TreeNode1, list);
        System.out.println(JSONUtil.parse(list).toString());

        递归(TreeNode1, list);
        System.out.println(JSONUtil.parse(list).toString());
    }

    static void 递归(TreeNode root, List<String> list) {
        if (root == null) {
            return;
        }
        递归(root.left, list);
        list.add(root.val);
        递归(root.right, list);
    }

    static void 循环遍历_栈(TreeNode root, List<String> list) {
        TreeNode head = root;
        LinkedList<TreeNode> a = new LinkedList<>();

        while (head!=null||!a.isEmpty()) {
            while (head != null) {
                a.push(head);
                head = head.left;
            }
            head = a.pop();
            list.add(head.val);
            head=head.right;

        }



    }
}
