package com.example.suanfaxuexiwangteng.运算符._3汉明距离;

/**
 * x=1 y=4
 * 输出2
 * 1 0001
 * 4 0100
 * 二进制不同位置的数目
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(  countDiff(1, 4));
    }

    /**
     * 按位异或
     *
     * @param x
     * @param y
     * @return
     */
    static int countDiff(int x, int y) {
        int distance = 0;
        int i = x ^ y;
        while (i != 0) {
            i&=i-1;
            distance++;
        }
        return distance;
    }
}
