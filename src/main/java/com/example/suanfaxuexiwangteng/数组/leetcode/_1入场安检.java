package com.example.suanfaxuexiwangteng.数组.leetcode;

/**
 * 「力扣挑战赛」 的入场仪式马上就要开始了，由于安保工作的需要，
 * 设置了可容纳人数总和为 M 的 N 个安检室，
 * capacities[i] 记录第 i 个安检室可容纳人数。安检室拥有两种类型：
 * <p>
 * 先进先出：在安检室中的所有观众中，最早进入安检室的观众最先离开
 * 后进先出：在安检室中的所有观众中，最晚进入安检室的观众最先离开
 * <p>
 * 先进先出的安检室并不会影响入场顺序
 * 后进先出的安检室, 会将 capacity−1 个人留住， 即在后面的所有观众可以提前 capacity−1 位入场
 * <p>
 * 若可以任意设定每个安检室的类型，
 * 请问有多少种设定安检室类型的方案可以使得编号
 * k 的观众第一个通过最后一个安检室入场。
 */
public class _1入场安检 {
    public static void main(String[] args) {
        int[] ints = {4, 3, 2, 2};
        System.out.println((securityCheck(ints, 6)));

    }
//    public static int securityCheck(int[] capacities, int k) {
//
//
//        int[] dp = new int[k + 1];
//        dp[0]=1;
//        for (int c : capacities) {
//            for (int i = k; i >= c - 1; i--) {
//                dp[i]=(dp[i]+dp[i-c+1]);
//            }
//        }
//        return dp[k];
//    }

    public static int securityCheck(int[] capacities, int k) {

        int[] dp = new int[k + 1];
        dp[0] = 1;

        //逻辑
        //1、这里是计算 数组中相加和等于k-1的可能性
        //2、假设k=6 则计算数组中相加为5的数
        //3、公式 dp[j] = (dp[j] + dp[j - c + 1]) ;

        //逻辑 值为4 则查找 （k-1）-3
        // dp[6]=dp[6]+dp[3] dp[5]=dp[5]+dp[2] dp[4]=dp[4]+dp[1] dp[3]=dp[3]+dp[0]
        for(int c : capacities){
            for(int j = k; j >= c - 1; j--){
                dp[j] = (dp[j] + dp[j - c + 1]) ;
            }
        }

        return dp[k];
    }






}
