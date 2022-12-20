package com.example.suanfaxuexiwangteng.链表.common;

public class ListNode
{
    public int val;
    public ListNode next;
    private String str;
    
    public ListNode(Integer x){
        val=x;
        next=null;
    }
    public ListNode(String x){
        str=x;
        next=null;
    }
}