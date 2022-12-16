package com.example.suanfaxuexiwangteng.数组.斐波那契数列.爬楼梯;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static  Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(爬楼梯方法_递归(1));
        System.out.println(爬楼梯方法_递归(10));
        System.out.println(爬楼梯方法_循环(10));
    }

    public static int 爬楼梯方法_递归(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.get(n) != null) {
            return map.get(n);
        } else {

            int value = 爬楼梯方法_递归(n - 1) + 爬楼梯方法_递归(n - 2);
            map.put(n,value);
            return value;
        }
    }
    public static int 爬楼梯方法_循环(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int result=0;
        int a=1;
        int b=2;
        for (int i = 3; i <= n; i++) {
            result=a+b;
            a=b;
            b=result;
        }

        return  result;
    }
}
