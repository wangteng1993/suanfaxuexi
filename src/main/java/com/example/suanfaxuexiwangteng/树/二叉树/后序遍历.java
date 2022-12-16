package com.example.suanfaxuexiwangteng.树.二叉树;

import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.树.二叉树.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 左右根
 */
public class 后序遍历 {
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

    static void 循环遍历_栈(TreeNode root, List<String> list) {
        TreeNode head = root;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        TreeNode 临时 =null;
        while (head!=null||!nodes.isEmpty()){
            while (head!=null){
                nodes.push(head);
                head=head.left;

            }
            head = nodes.pop();

            if (head.right==null||head.right==临时){
               list.add(head.val);
                临时=head;
                head=null;
            }else {
                nodes.push(head);
                head=head.right;
            }
        }
    }

    static void 递归(TreeNode root, List<String> list) {
        TreeNode head = root;
        if (head != null) {

            递归(head.left, list);
            递归(head.right, list);
            list.add(head.val);
        }

    }
}
