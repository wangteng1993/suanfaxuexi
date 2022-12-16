package com.example.suanfaxuexiwangteng.排序算法._3插入排序;

import cn.hutool.json.JSONUtil;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 9, 2, 4, 12, 66, 78, 12, 13, 45, 1};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());
    }

    static int[] sortArray(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }
        //待排序数据
        int currentValue;
        for (int i = 0; i < nums.length-1; i++) {
            //已经排序的索引
            int preIndex = i;
            currentValue = nums[preIndex + 1];
            while (preIndex>0&&currentValue<nums[preIndex]){
                nums[preIndex+1]=nums[preIndex];
                preIndex--;
                System.out.println(JSONUtil.parse(nums).toString());
            }
            //插入当前位置
            nums[preIndex+1]=currentValue;

            System.out.println("插入后数组: "+JSONUtil.parse(nums).toString());


            System.out.println("=================================");
        }
        return nums;
    }
}
