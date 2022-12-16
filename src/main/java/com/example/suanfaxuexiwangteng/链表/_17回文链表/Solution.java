package com.example.suanfaxuexiwangteng._17回文链表;

import com.example.suanfaxuexiwangteng.common.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(回文链表_双指针_快慢指针取中间值(listNode1));
    }

    static boolean 回文链表_双指针_快慢指针取中间值(ListNode head) {
        //1.快慢指针遍历、判断快指针值是否是null 为null则是偶数 不为null为奇数
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //2.偶数取慢指针后边的值进行反转 奇数next后边的值进行反转
        ListNode a =  反转(slow);

        //3.判断是否相等 即可
        ListNode c = head;
        while (a != null) {
            if (a.val == c.val) {
                a = a.next;
                c = c.next;
            } else {
                return false;
            }
        }

        return true;
    }

    static ListNode 反转(ListNode head) {
        ListNode a = head;
        ListNode b = null;
        while (a != null) {
            ListNode next = a.next;
            a.next = b;
            b = a;
            a = next;
        }
        return b;
    }
}
