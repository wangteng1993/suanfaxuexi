package com.example.suanfaxuexiwangteng.排序算法.桶._8桶排序;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1,4,99,76,34,12,11,43};
        List<Integer> ints = sort( Arrays.stream(nums).boxed().toList(),10);
        System.out.println(JSONUtil.parse(ints).toString());

    }

    /**
     *
     * @param array
     * @param bucketCap 桶的容量
     * @return
     */
    static List<Integer>sort(List<Integer> array,int bucketCap){
        if (array==null||array.size()<2){
            return  array;
        }
        int max=array.get(0);
        int min=array.get(0);
        //找到最大值 最小值
        for (Integer i : array) {
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        //获得桶的数量
        int bucketCount = (max - min) / bucketCap + 1;


        //构建桶
        List<List<Integer>> bucketList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for ( int i = 0; i < bucketCount; i++) {
            bucketList.add(new ArrayList<>());
        }
        //将原始数据分配到桶中
        for (int i = 0; i < array.size(); i++) {
            int j = (array.get(i) - min) / bucketCap;
            bucketList.get(j).add(array.get(i));
        }
        System.out.println(JSONUtil.parse(bucketList).toString());
        //每个桶在进行排序
        for (int i = 0; i < bucketCount; i++) {
            if (bucketCap==1){
                for (int j = 0; j < bucketList.get(i).size(); j++) {
                    resultList.add(bucketList.get(i).get(j));
                }
            }else {
                if (bucketCount == 1) {
                    bucketCap--;
                }
                List<Integer> temp = sort(bucketList.get(i), bucketCap);

                System.out.println(JSONUtil.parse(temp).toString());
                for (int j = 0; j < temp.size(); j++) {
                    resultList.add(temp.get(j));
                }
            }
        }
        return resultList;
    }
}
