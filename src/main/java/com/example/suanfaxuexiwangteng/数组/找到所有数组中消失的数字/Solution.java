package com.example.suanfaxuexiwangteng.数组.找到所有数组中消失的数字;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(找到所有数组中消失的数字(new int[]{1,2,2,3,3,1,6}));
    }

    /**
     * 1.将所有值减一取下标
     * 2.将下标中的值变成0
     * 3.找到不为0的数组下标 分别+1 就是不存在的数字
     *
     * @param nums
     * @return
     */
    public static ArrayList<Integer> 找到所有数组中消失的数字(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                continue;
            }else {
                int num = nums[i];
                nums[num - 1] = 0;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                list.add(i+1);
            }
        }
        return list;

    }
}
