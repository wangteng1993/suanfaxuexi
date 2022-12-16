package com.example.suanfaxuexiwangteng.数组.合并两个有序数组;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                merge(new int[]{ 2, 3, 4,10}, 4, new int[]{2, 3, 4, 5, 6}, 5)));
    }
    /**
     * 双指针合并
     *
     * @return
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int k=m+n;
        int[] temp = new int[k];
        for (int i = 0,num1Index=0,num2Index=0; i < k; i++) {

            if (num1Index>=m){
                temp[i]=nums2[num2Index];
                num2Index++;
            }else if (num2Index>=n){
                temp[i]=nums1[num1Index];
                num1Index++;
            }else if (nums1[num1Index]<nums2[num2Index]){
                temp[i]=nums1[num1Index];
                num1Index++;
            }else {
                temp[i]=nums2[num2Index];
                num2Index++;
            }
        }
        nums1=temp;
        return nums1;
    }
}
