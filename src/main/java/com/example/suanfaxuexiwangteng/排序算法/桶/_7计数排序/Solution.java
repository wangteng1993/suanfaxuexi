package com.example.suanfaxuexiwangteng.排序算法.桶._7计数排序;

import cn.hutool.json.JSONUtil;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 1,4};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());

    }
    public static int[] sortArray(int[] nums){
        if (nums.length==0)return nums;
        /**
         * 寻找最大值 最小值 bias 偏移量
         */

        int bias;
        int min=nums[0];
        int max=nums[0];
        for (int num : nums) {
            if (min>num){
                min=num;
            }
            if (max<num){
                max=num;
            }
        }
        bias= -min;
        //新建计数数组
        int[] counterNums = new int[max - min + 1];

        //1、遍历原始数组 将原始数组值转为计数数组下边
        //2、将计数数组值累加
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i] + bias;
            counterNums[j]++;
        }
        System.out.println("计数数组为"+ JSONUtil.parse(counterNums).toString());
        System.out.println("=======================");
        //原始数组下标计数器
        int index=0;
        //计数数组下标计数器
        int i=0;
        //遍历计数数组 将值写回原始数组
        while (index<nums.length){

            //判断计数数组值是否为0
            if (counterNums[i]!=0){
                nums[index]=i-bias;
                counterNums[i]--;
                index++;
            }else {
                i++;
            }
            System.out.println("计数数组为"+ JSONUtil.parse(counterNums).toString());
            System.out.println("原始数组为"+ JSONUtil.parse(nums).toString());
            System.out.println("------------------");
        }
        return nums;
    }
}
