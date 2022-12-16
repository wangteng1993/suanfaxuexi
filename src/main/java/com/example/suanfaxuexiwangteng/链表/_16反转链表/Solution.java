package com.example.suanfaxuexiwangteng.链表._16反转链表;

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
        System.out.println(JSONUtil.parse(双指针(listNode1)).toString());
    }
    static ListNode 双指针(ListNode head){
        ListNode nodeA = head;
        ListNode nodeb=null;
        while (nodeA!=null){
            //缓存a链表next
            ListNode next = nodeA.next;
            //将b赋值给a的next 实现反转
            nodeA.next=nodeb;
            //b指针前进一位
            nodeb=nodeA;
            //a指针前进一位
            nodeA=next;
        }
        return nodeb;

    }
}
