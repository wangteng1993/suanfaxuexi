package com.example.suanfaxuexiwangteng.栈和队列._21栈实现队列;

import java.util.Stack;

public class MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;


    public MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x){
        inStack.push(x);
    }

    public Integer peek(){
        if (outStack.isEmpty()){
            inToOut();
        }
        return outStack.peek();
    }
    public int pop(){
        if (outStack.isEmpty()){
            inToOut();
        }
        return outStack.pop();
    }
    private void inToOut(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}
