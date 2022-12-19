package com.example.suanfaxuexiwangteng.排序算法.leetCode;

import cn.hutool.json.JSONUtil;

import java.util.Arrays;

/**
 * 给你一个字符串数组 names ，和一个由 互不相同 的正整数组成的数组 heights 。两个数组的长度均为 n 。
 * <p>
 * 对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。
 * <p>
 * 请按身高 降序 顺序返回对应的名字数组 names 。
 * <p>
 * <p>
 * 输入：names = ["Mary","John","Emma"], heights = [180,165,170]
 * 输出：["Mary","Emma","John"]
 * 解释：Mary 最高，接着是 Emma 和 John 。
 */
public class _001按身高排序 {
    public static void main(String[] args) {
        String[] names = new String[]{"Mary", "John", "Emma","wangtenh"};
        int[] heights = new int[]{180, 165, 170,195};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        if (names.length < 2) {
            return names;
        }
        System.out.println(Arrays.toString(sort(names, heights, 0, heights.length - 1)));

        return sort(names, heights, 0, heights.length - 1);
    }

    static String[] sort(String[] names, int[] heights, int start, int end) {
        if (heights.length < 1 || start < 0 || end >= heights.length || start > end) {
            return null;
        }
        //1、数组切割 成两部分 获取分区下标 分别排序
        int zoneIndex = patition(names, heights, start, end);
        if (zoneIndex > start) {
            sort(names, heights, start, zoneIndex - 1);
        }
        if (zoneIndex < end) {
            sort(names, heights, zoneIndex + 1, end);
        }


        return names;
    }

    static int patition(String[] names, int[] heights, int start, int end) {
        if (start == end) {
            return start;
        }
        //1、获取随机基准数
        int pivot = (int) (start + Math.random() * (end - start + 1));

        //2、分区指示器赋值
        int zoneIndex = start - 1;
        //将基准数和分区尾元素交换位置
        swap(names, pivot, end);
        swap(heights, pivot, end);
        //注意i要<=end
        for (int i = start; i <= end; i++) {
            //元素小于基准数 等于也归到左边 不然会漏元素
            //倒叙
            if (heights[i] >= heights[end]) {
                zoneIndex++;
                if (i > zoneIndex) {
                    swap(heights, i, zoneIndex);
                    swap(names, i, zoneIndex);
                }
            }
            System.out.println(JSONUtil.parse(names).toString());
            System.out.println(JSONUtil.parse(heights).toString());
        }

        return zoneIndex;
    }

    /**
     * 数组交换
     */
    static void swap(Object[] heights, int i, int j) {
        Object height = heights[i];
        heights[i] = heights[j];
        heights[j] = height;

    }

    /**
     * 数组交换
     */
    static void swap(int[] heights, int i, int j) {
        int height = heights[i];
        heights[i] = heights[j];
        heights[j] = height;

    }
}
