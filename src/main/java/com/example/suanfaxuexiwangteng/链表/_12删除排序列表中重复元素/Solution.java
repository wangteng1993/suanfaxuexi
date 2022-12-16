package com.example.suanfaxuexiwangteng.链表._12删除排序列表中重复元素;

import com.example.suanfaxuexiwangteng.链表.common.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode1= new ListNode(1);

        ListNode listNode2 = new ListNode(1);
        ListNode listNode3= new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
//        System.out.println(循环(listNode1));
        System.out.println(递归(listNode1));


    }
    static ListNode 循环(ListNode head){
        ListNode headCurrent = head;
        while (headCurrent.next!=null){
            if (headCurrent.val==headCurrent.next.val){
                headCurrent.next=headCurrent.next.next;
            }else {
                headCurrent=headCurrent.next;
            }
        }

        return head;
    }


    static ListNode 递归(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        head.next=递归(head.next);
        if (head.next.val==head.val){
            return head.next;
        }else {
            return head;
        }


    }
}
