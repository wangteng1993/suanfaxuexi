package com.example.suanfaxuexiwangteng.查找.二分查找;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4,11,12,15,19,45,67,87};
//        int search = search(ints, 6);
        search递归(ints,6);
    }
    /**
     * 递归
     */

    static int search递归(int[] nums, int target){
      return   searchNum(nums,0,nums.length-1,target);
    }
   public static  int c=0;
    static int searchNum(int[] nums, int start, int end, int target){
        int mid=(start+end)/2;

        if (start<end){
            if (target<nums[mid]){
                return searchNum(nums,start,mid-1,target);
            }else if (target>nums[mid]){
                return  searchNum(nums,mid+1,end,target);
            }else {
                return mid;
            }
        }else {
            return -1;
        }
    }

    /**
     * 循环
     */
    public static int search(int[] nums, int target){
        
        int start=0;
        int end=nums.length-1;
        int i=1;
        while (start<=end){
            int mid=(start+end)/2;
            if (target>nums[mid]){
                start=mid+1;
            }else if (target<nums[mid]){
                end=mid-1;
            }else {
                return mid;
            }
            System.out.println("第"+i++);


        }
        return -1;
    }
}
