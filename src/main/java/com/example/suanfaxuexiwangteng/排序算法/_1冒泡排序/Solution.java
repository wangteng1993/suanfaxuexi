package com.example.suanfaxuexiwangteng.排序算法._1冒泡排序;

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

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int num = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = num;
                }
                System.out.println(JSONUtil.parse(nums).toString());
            }
            System.out.println("=================================");
        }
        return nums;
    }
}
