package com.example.suanfaxuexiwangteng.两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        System.out.println(Arrays.toString(twoSum(ints, 5)));
    }
    static Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    public static int [] twoSum(int[] nums, int target){
        int [] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            //有值
            if (map.get(value)!=null){
                result[0]=nums[i];
                result[1]=nums[map.get(value)];
                return result;
            }
            map.put(nums[i],i);

        }
        return result;
    }
}
