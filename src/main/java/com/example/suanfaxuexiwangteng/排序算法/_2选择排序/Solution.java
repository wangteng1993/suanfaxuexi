package com.example.suanfaxuexiwangteng.排序算法.选择排序;

import cn.hutool.json.JSONUtil;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,9,2,4,12,66,78,12,13,45,1};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());
    }

    static int[] sortArray(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {

            int minIndex = i;

            for (int j = i; j < nums.length ; j++) {
                if (nums[j ] < nums[minIndex]) {
                    int num = nums[j];
                    nums[j ] = nums[minIndex];
                    nums[minIndex] = num;
                }
                System.out.println(JSONUtil.parse(nums).toString());
            }
            System.out.println("=================================");
        }
        return nums;
    }
}
