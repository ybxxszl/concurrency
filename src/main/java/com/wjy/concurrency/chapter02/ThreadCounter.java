package com.wjy.concurrency.chapter02;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Date 2018/11/25
 * @Author ybxxszl
 * @Desc 循环创建线程
 **/
public class ThreadCounter extends Thread {

    final static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        try {

            while (true) {

                new ThreadCounter().start();

            }

        } catch (Throwable e) {

            System.out.println("failed At => " + counter.get());

        }

    }

    @Override
    public void run() {

        try {

            System.out.println("The " + counter.getAndIncrement() + " thread be created.");

            TimeUnit.MINUTES.sleep(10);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
