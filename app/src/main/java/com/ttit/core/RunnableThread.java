package com.ttit.core;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        doSomeThing();
    }

    private void doSomeThing() {
        System.out.println("我是一个线程方法");
    }

}
