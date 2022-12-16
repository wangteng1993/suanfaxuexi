package com.example.suanfaxuexiwangteng.栈和队列._22字符串解码;

import java.util.LinkedList;
import java.util.Objects;

/**
 * 3[a]2[bc]--->aaabcbc
 */
public class Solution {
    public static void main(String[] args) {
        String str = "aa3[a]aaddd12[bc]";
        System.out.println(_22字符串解码_栈(str));
    }

    static String _22字符串解码_栈(String str) {
        LinkedList<String> a = new LinkedList<>();
        LinkedList<String> 临时数字栈 = new LinkedList<>();
        //数据入栈
        for (char c : str.toCharArray()) {

            //1、数字类型入新的栈
            if (Character.isDigit(c)){
                临时数字栈.add(String.valueOf(c));
//                a.add(String.valueOf(c));
            }else if (c==']'){
                StringBuilder s= new StringBuilder();
                StringBuilder n= new StringBuilder();
                //pop 往外吐 遇到'['时停止
                while (!Objects.equals(a.getLast(), "[")){
                    s.insert(0, a.getLast());
                    a.removeLast();
                }
                a.removeLast();
                //取出临时数字栈
                for (String s1 : 临时数字栈) {
                    n.append(s1);
                }
                StringBuilder d= new StringBuilder();
                for (Integer i = 0; i < Integer.valueOf(n.toString()); i++) {
                    d.append(s);
                }
                //把s压入栈
                a.add(d.toString());
                临时数字栈.clear();
            }else  {
                a.add(String.valueOf(c));
            }

        }

        StringBuilder s= new StringBuilder();
        for (String d : a) {
            s.append(d);
        }
        return s.toString();
    }
}
