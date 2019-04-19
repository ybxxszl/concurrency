package com.wjy.concurrency.chapter03;

import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

/**
 * @Date 2018/11/29
 * @Author ybxxszl
 * @Desc interrupt打断线程阻塞状态
 **/
public class ThreadInterrupt extends Thread {

    public static void main(String[] args) throws Exception {

        ThreadInterrupt thread = new ThreadInterrupt();

        thread.setDaemon(true);

        thread.start();

        TimeUnit.SECONDS.sleep(10);

        out.println(thread.isInterrupted());

        thread.interrupt();

        out.println(thread.isInterrupted());

        TimeUnit.SECONDS.sleep(10);

        out.println(thread.isInterrupted());

    }

    @Override
    public void run() {

        try {

            TimeUnit.SECONDS.sleep(30);

            while (true) {

                out.println(Thread.interrupted());

            }

        } catch (Exception e) {

            out.println(isInterrupted());

            out.println(e.getMessage());

        }

    }

}
