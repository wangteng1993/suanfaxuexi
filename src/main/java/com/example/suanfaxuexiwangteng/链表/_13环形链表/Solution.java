package com.example.suanfaxuexiwangteng._13环形链表;

import com.example.suanfaxuexiwangteng.common.ListNode;

/**
 * 判断链表是否有环
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode1= new ListNode(1);

        ListNode listNode2 = new ListNode(1);
        ListNode listNode3= new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode2;
//        System.out.println(循环(listNode1));
        System.out.println(快慢双指针(listNode1));
    }
    //弗洛伊德 快慢双指针
    static boolean 快慢双指针(ListNode head){
        //公司电脑太卡了 先注释掉
//        if (head==null){
//            return false;
//        }
       ListNode fast = head;
       ListNode slow = head;

       while (fast.next!=null&&slow.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if (slow==fast){
               return true;
           }
       }
       return false;
   }
}
