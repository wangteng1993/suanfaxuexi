package com.example.suanfaxuexiwangteng.排序算法._5归并排序;

import cn.hutool.json.JSONUtil;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 1, 4, 5, 6, 7, 12, 11, 33, 44};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());
    }

    static int[] sortArray(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        //将数组拆分
        int a = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, a);
        int[] right = Arrays.copyOfRange(nums, a, nums.length );
        return merge(sortArray(left), sortArray(right));


    }

    /**
     * 归并合并
     *
     * @param nums
     * @param start
     * @param end
     * @return
     */
    static int[] merge(int[] left, int[] right) {
        int[] result =new int[left.length+right.length];
        for (int i = 0, a = 0, b = 0; i < (left.length + right.length); i++) {
            //左边数组取完
            if (a >= left.length) {
                result[i] = right[b++];
                //右边取完
            } else if (b >= right.length) {
                result[i] = left[a++];
            } else if (left[a] < right[b]) {
                result[i] = left[a++];
            } else {
                result[i] = right[b++];
            }
        }
        return result;
    }

}
