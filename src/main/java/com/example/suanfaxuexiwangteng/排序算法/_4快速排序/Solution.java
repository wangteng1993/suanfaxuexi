package com.example.suanfaxuexiwangteng.排序算法._4快速排序;

import cn.hutool.json.JSONUtil;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 1, 4, 5, 6, 7, 12, 11, 33, 44};
        int[] ints = sortArray(nums);
        System.out.println(JSONUtil.parse(ints).toString());
    }

    static int[] sortArray(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    static int[] sort(int[] nums, int start, int end) {

        if (nums.length < 1 || start < 0 || end >= nums.length || start > end) {
            return null;
        }

        //1、数组切割 成两部分 获取分区下标 分别排序
        int zoneIndex = patition(nums, start, end);
        if (zoneIndex > start) {
            sort(nums, start, zoneIndex - 1);
        }
        if (zoneIndex < end) {
            sort(nums, zoneIndex + 1, end);
        }

        return nums;
    }

    static int patition(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        //1、获取随机基准数
        int pivot = (int) (start + Math.random() * (end - start + 1));

        //2、分区指示器赋值
        int zoneIndex = start - 1;
        System.out.println("开始下标" + start + "结束下标" + end + "基准数下标" + pivot + "基准数值" + nums[pivot] + "分区指示器下标" + zoneIndex);
        //将基准数和分区尾元素交换位置
        swap(nums, pivot, end);
        //注意i要<=end
        for (int i = start; i <= end; i++) {
            //元素小于基准数 等于也归到左边 不然会漏元素
            if (nums[i] <= nums[end]) {
                zoneIndex++;
                if (i > zoneIndex) {
                    swap(nums, i, zoneIndex);
                }
            }
            System.out.println(JSONUtil.parse(nums).toString());
        }

        return zoneIndex;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        System.out.println(JSONUtil.parse(nums).toString());
    }
}
