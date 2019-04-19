package com.wjy.concurrency.chapter01;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2018/11/19
 * @Author ybxxszl
 * @Desc 并发
 **/
public class TryConcurrency {

    public static void main(String[] args) {

//        new Thread() {
//
//            @Override
//            public void run() {
//
//                browseNews();
//
//            }
//
//        }.start();

        // Lambda
        new Thread(TryConcurrency::browseNews).start();

        enjoyMusic();

    }

    private static void browseNews() {

        while (true) {

            System.out.println("Good News");
            sleep(1);

        }

    }

    private static void enjoyMusic() {

        while (true) {

            System.out.println("Good Music");
            sleep(1);

        }

    }

    private static void sleep(int seconds) {

        try {

            TimeUnit.SECONDS.sleep(seconds);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
