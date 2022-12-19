package com.example.suanfaxuexiwangteng.运算符._1只出现一次的数字;

/**
 * 一个出现一次 其余都出现两次 找出出现一次的数据
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints = {1, 1,4,4,6,7,6,7,8,10,10};
        System.out.println(one(ints));
    }
    static int one(int[] nums){

        int result=0;
        for (int num : nums) {
            result=result^num;
        }
        return result;
    }
}
