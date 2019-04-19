package com.wjy.concurrency.chapter03;

import static java.lang.System.out;

/**
 * @Date 2018/11/27
 * @Author ybxxszl
 * @Desc
 **/
public class CurrentThread {

    public static void main(String[] args) {

        Thread thread = new Thread() {

            @Override
            public void run() {

                out.println(Thread.currentThread());

            }
        };

        thread.start();

        out.println("ID: " + Thread.currentThread().getId());
        out.println("NAME: " + Thread.currentThread().getName());

    }

}
