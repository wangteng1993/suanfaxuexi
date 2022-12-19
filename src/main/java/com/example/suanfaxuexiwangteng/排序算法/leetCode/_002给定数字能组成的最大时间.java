package com.example.suanfaxuexiwangteng.排序算法.leetCode;

/**
 * 给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。
 * <p>
 * 24 小时格式为 "HH:MM" ，其中 HH 在 00 到 23 之间，MM 在 00 到 59 之间。最小的 24 小时制时间是 00:00 ，而最大的是 23:59 。从 00:00 （午夜）开始算起，过得越久，时间越大。
 * <p>
 * 以长度为 5 的字符串，按 "HH:MM" 格式返回答案。如果不能确定有效时间，则返回空字符串。
 * <p>
 * <p>
 * 输入：arr = [1,2,3,4]
 * 输出："23:41"
 * 解释：有效的 24 小时制时间是
 * "12:34"，"12:43"，"13:24"，"13:42"
 * ，"14:23"，"14:32"，"21:34"，"21:43"
 * ，"23:14" 和 "23:41" 。这些时间中，"23:41" 是最大时间。
 */
public class _002给定数字能组成的最大时间 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 8};
        System.out.println(largestTimeFromDigits(nums));
    }
    public static String largestTimeFromDigits(int[] arr) {

        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    for (int k = 0; k < arr.length; k++) {
                        if (k != i && k != j) {
                            int l = 6 - i - j - k;
                            int hours = 10 * arr[i] + arr[j];
                            int mins = 10 * arr[k] + arr[l];
                            if (hours < 24 && mins < 60) {
                                a = Math.max(a, hours * 60 + mins);
                            }
                        }
                    }
                }
            }
        }
        return a >= 0 ? String.format("%02d:%02d", a / 60, a % 60) : "";

    }
}
