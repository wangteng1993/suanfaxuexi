package com.example.suanfaxuexiwangteng.链表._19链表中倒数第k个节点;

import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.链表.common.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(JSONUtil.parse(_19链表中倒数第k个节点_快慢双指针(listNode1,3)).toString());
    }
     static ListNode _19链表中倒数第k个节点_快慢双指针(ListNode head,int num){
        //1、快指针先移动num-1次
         ListNode fast = head;
         for (int i = 0; i < (num - 1); i++) {
             fast=fast.next;
         }
         //2、快慢指针同时移动1 取慢指针节点
         ListNode slow = head;
         while (fast.next!=null){
             fast=fast.next;
             slow=slow.next;
         }
        return slow;
    }
}
