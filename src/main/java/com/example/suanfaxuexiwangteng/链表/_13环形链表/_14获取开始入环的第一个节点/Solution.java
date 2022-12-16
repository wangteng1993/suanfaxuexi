package com.example.suanfaxuexiwangteng._13环形链表._14获取开始入环的第一个节点;

import com.example.suanfaxuexiwangteng.common.ListNode;

/**
 * 返回环指针的第一个节点
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
    static Object 快慢双指针(ListNode head){
        //公司电脑太卡了 先注释掉
//        if (head==null){
//            return false;
//        }
        ListNode fast = head;
        ListNode slow = head;
        boolean exit=false;
        while (fast.next!=null&&slow.next.next!=null){
            slow=slow.next;

            fast=fast.next.next;
            if (slow==fast){
                exit=true;
                break;
            }
        }
        //存在
        if (exit){
            //将慢指针指向第一个
            slow=head;
            while (slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;

        }


        return null;
    }
}
