package com.example.suanfaxuexiwangteng._18链表的中间节点;

import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.common.ListNode;

/**
 * 返回链表中间节点 如果有两个则返回第二个
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(JSONUtil.parse(取中间节点_双指针_快慢指针(listNode1)).toString());
    }

    static ListNode 取中间节点_双指针_快慢指针(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
