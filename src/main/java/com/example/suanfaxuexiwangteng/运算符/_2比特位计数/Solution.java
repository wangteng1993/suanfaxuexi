package com.example.suanfaxuexiwangteng.运算符._2比特位计数;

import java.util.Arrays;

/**
 *  整数 n 对于0<=i<=n 中每个i 计算二进制中1的个数 返回一个长度位n+1的数组 ans为答案
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(1111)));
        System.out.println(Arrays.toString(countBits奇偶性(1111)));
    }
    /**
     * 循环
     */
    public static int []countBits(int num){

        int[] bits = new int[num+1];
        for (int i = 1; i <= num; i++) {
            bits[i]=bits[i&(i-1)]+1;
        }
        return bits;
    }


    /**
     * 奇偶性
     */
    /**
     * 循环
     */
    public static int []countBits奇偶性(int num){

        int[] bits = new int[num+1];
        bits[0]=0;

        for (int i = 1; i <= num; i++) {
            //奇数
            if ((i&1)==1){
                bits[i]=bits[i-1]+1;
            }else {
//                bits[i]=bits[i>>1];
                bits[i]=bits[i/2];
            }
        }
        return bits;
    }


}
