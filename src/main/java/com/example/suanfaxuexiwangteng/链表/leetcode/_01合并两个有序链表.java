package com.example.suanfaxuexiwangteng.链表.leetcode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class _01合并两个有序链表 {


    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }

        if (list1.val<list2.val){

            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }else {
            list2.next=mergeTwoLists(list1, list1.next);
         return  list2;
        }

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
