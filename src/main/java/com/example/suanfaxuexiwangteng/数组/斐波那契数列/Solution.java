package com.example.suanfaxuexiwangteng.斐波那契数列;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(斐波那契数列_递归(10));
        System.out.println(斐波那契数列_循环(10));
    }
   static  Map<Integer,Integer> map= new HashMap<>();
    /**
     * 递归
     */
    static int 斐波那契数列_递归(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int value = 斐波那契数列_递归(n - 2) + 斐波那契数列_递归(n - 1);
        map.put(n,value);
        return value;
    }
    /**
     * 循环
     */
    static int 斐波那契数列_循环(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result=0;
        int a=0;
        int b=1;
        for (int i = 2; i <= n; i++) {
            result=a+b;
            a=b;
            b=result;
        }
        return result;
    }
}
