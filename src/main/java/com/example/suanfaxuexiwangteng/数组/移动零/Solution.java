package com.example.suanfaxuexiwangteng.数组.移动零;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(move0(new int[]{0,1, 0, 2, 3, 4, 0, 12,0,34})));
    }

    /**
     * 双指针 挪动
     * @param nums
     * @return
     */
    public static int[] move0(int[] nums){
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                continue;
            }else {
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
        return nums;
    }
}
