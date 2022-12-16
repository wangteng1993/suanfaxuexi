package com.example.suanfaxuexiwangteng._15相交链表取相交起始点;

import cn.hutool.json.JSONUtil;
import com.example.suanfaxuexiwangteng.common.ListNode;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode pa = new ListNode(7);
        ListNode pb = new ListNode(7);

        pa.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        pb.next = listNode1;
        listNode1.next = listNode2;


//        System.out.println(相交链表_双指针(pa, pb));
        System.out.println(JSONUtil.parse(相交链表_根据长度(pa, pb)).toString());
    }

    static ListNode 相交链表_双指针(ListNode head1, ListNode head2) {

        ListNode pa = head1;
        ListNode pb = head2;
        while (pa != pb) {

            if (pa == null) {
                pa = head1;
            } else {
                pa = pa.next;
            }


            if (pb == null) {
                pb = head2;
            } else {
                pb = pb.next;
            }

        }
        return pa;
    }

    /**
     * 1.先计算两者长度
     * 2.长的去掉差值
     * 3.两者同速循环判断是否相等
     *
     * @param head1
     * @param head2
     * @return
     */
    static ListNode 相交链表_根据长度(ListNode head1, ListNode head2) {

        ListNode ha = head1;
        int a = 0;
        while (ha != null) {
            a++;
            ha = ha.next;
        }
        ListNode hb = head2;
        int b = 0;
        while (hb != null) {
            b++;
            hb = hb.next;
        }
        ha = head1;
        hb = head2;
        int diff = abs(a - b);
        if (a > b) {
            for (int i = 0; i < diff; i++) {
                ha = ha.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                hb = hb.next;
            }
        }

        while (ha != null && hb != null) {
            if (ha==hb){
                return ha;
            }else {
                ha=ha.next;
                hb=hb.next;
            }
        }
return null;
    }
}
