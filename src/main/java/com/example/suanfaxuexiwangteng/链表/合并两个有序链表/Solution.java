package com.example.suanfaxuexiwangteng.合并两个有序链表;


import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(5);
        l1.add(10);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(4);
        l2.add(8);
        System.out.println(合并两个有序列表_循环双指针(l1, l2));
    }

    /**
     * 循环双指针
     *
     * @return
     */
    public static LinkedList<Integer> 合并两个有序列表_循环双指针(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        while (l1 .size()>0 && l2 .size()>0) {
           if (l1.getFirst()<l2.getFirst()){
               result.addLast(l1.getFirst());
               l1.removeFirst();
           }else {
               result.addLast(l2.getFirst());
               l2.removeFirst();
           }
        }
        if (l1.size()>0){
            result.addAll(l1);
        }
        if (l2.size()>0){
            result.addAll(l2);
        }
        return result;
    }
}
