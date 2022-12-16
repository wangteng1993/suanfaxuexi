package com.example.suanfaxuexiwangteng.排序算法._6堆排序;

import cn.hutool.json.JSONUtil;

public class Solution {
    private static int len;

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 1,4};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());
    }

    static int[] sortArray(int[] nums) {
        len = nums.length;
        if (len < 1) return nums;
        //构建最大堆
        buildMaxHeap(nums);
        while (len > 0) {
            swap(nums, 0, len - 1);
            len--;
            adjustHeap(nums, 0);
            System.out.println(JSONUtil.parse(nums).toString());
            System.out.println("===============");
        }
        return nums;


    }

    static void buildMaxHeap(int[] nums) {
        for (int i = (len / 2 - 1); i >=0; i--) {
            adjustHeap(nums, i);
            System.out.println(JSONUtil.parse(nums).toString());
            System.out.println("===============");
        }

    }

    /**
     * 调整使数组为最大堆
     *
     * @param nums
     * @param i
     */
    static void adjustHeap(int[] nums, int i) {

        int maxIndex = i;
        int left = 2 * i + 1;
        int right = 2 * (i + 1);
        //存在左子树 且左子树比父节点大
        if (left < len && nums[left] > nums[maxIndex]) {
            maxIndex = left;
        }
        //有右子树且右子树比 父节点 左子树大
        if (right < len && nums[right] > nums[maxIndex] && nums[right] > nums[left]) {
            maxIndex = right;
        }
        //父节点变了 交换最大值 在递归调整节点子树
        if (maxIndex != i) {
            swap(nums, maxIndex, i);
            System.out.println(JSONUtil.parse(nums).toString());
            adjustHeap(nums, maxIndex);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
