package com.wjy.concurrency.chapter03;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2018/11/26
 * @Author ybxxszl
 * @Desc 设置线程的优先级（1 ~ 10）
 **/
public class ThreadPriority extends Thread {

    public static void main(String[] args) {

        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }

    @Override
    public void run() {

        try {

            while (true) {

                System.out.println(Thread.currentThread().getPriority());

                TimeUnit.SECONDS.sleep(1);

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
