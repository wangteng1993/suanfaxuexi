package com.example.suanfaxuexiwangteng.排序算法.桶._9基数排序;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1,4,99,76,34,12,11,43};
        int[] ints = sortArray( nums);
        System.out.println(JSONUtil.parse(ints).toString());

    }

   static int[] sortArray(int[] nums){
        if (nums==null||nums.length<2){
            return nums;
        }
        //找出最大数
       int max=nums[0];
       for (int num : nums) {
           if (max<num){
               max=num;
           }
       }
       //1、算出最大数的位数
       int maxDigit=0;
       while (max!=0){
           max/=10;
           maxDigit++;
       }
       int mod=10;
       int div=1;
       /**
        * 构建桶
        */
       List<List<Integer>> buketList = new ArrayList<>();

       for (int i = 0; i < 10; i++) {
           buketList.add(new ArrayList<>());
       }
       //1、按照从右向左的顺序，依次将每一位都当做关键字 
       //2、按照关键字对数组排序
       //3、每一轮都基于上一轮排序后的结果
       for (int i = 0; i < maxDigit; i++,mod*=10,div*=10) {
           System.out.println("第"+i+"轮");
           //遍历原始数组 投入桶中
           for (int j = 0; j < nums.length; j++) {
               int num = nums[j] % mod / div;
               buketList.get(num).add(nums[j]);
           }
           System.out.println(JSONUtil.parse(buketList).toString());


           //桶中的数据写回原始数组、清除桶、准备下一轮
           int index=0;
           for (int j = 0; j < buketList.size(); j++) {
               for (int k = 0; k < buketList.get(j).size(); k++) {
                  nums[index++]= buketList.get(j).get(k);
               }
               buketList.get(j).clear();
           }
       }
       return nums;

   }
}
