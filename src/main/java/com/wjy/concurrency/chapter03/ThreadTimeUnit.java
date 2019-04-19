package com.wjy.concurrency.chapter03;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2018/11/25
 * @Author ybxxszl
 * @Desc TimeUnit枚举 灵活地设置睡眠时间
 **/
public class ThreadTimeUnit extends Thread {

    public static void main(String[] args) {

        ThreadTimeUnit thread = new ThreadTimeUnit();

        thread.start();

    }

    @Override
    public void run() {

        try {

            while (true) {

                System.out.println("running");

                TimeUnit.MINUTES.sleep(1);
                TimeUnit.SECONDS.sleep(30);

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
