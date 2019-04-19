package com.wjy.concurrency.chapter02;

/**
 * @Date 2018/11/21
 * @Author ybxxszl
 * @Desc Thread与ThreadGroup
 **/
public class ThreadConstruction {

    public static void main(String[] args) {

        Thread t1 = new Thread("t1");

        ThreadGroup group = new ThreadGroup("TestGroup");

        Thread t2 = new Thread(group, "t2");

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();

        System.out.println(mainThreadGroup.getName());
        System.out.println(mainThreadGroup == t1.getThreadGroup());
        System.out.println(mainThreadGroup == t2.getThreadGroup());
        System.out.println(group == t2.getThreadGroup());

    }

}
