package com.example.suanfaxuexiwangteng.栈和队列.leetcode;

import java.util.Stack;

public class _1有效的括号 {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            }else if (c=='{'){
                stack.push('}');
            }else if (c=='['){
                stack.push(']');
            }else if (stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        return stack.empty();

    }
}
