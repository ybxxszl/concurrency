package com.wjy.concurrency.chapter02;

/**
 * @Date 2018/11/25
 * @Author ybxxszl
 * @Desc Stacksize
 **/
public class ThreadStackSize {

    public static void main(String[] args) {

        if (args.length < 1) {

            System.out.println("Please enter the stack size.");

            System.exit(1);

        }

        ThreadGroup threadGroup = new ThreadGroup("TestGroup");

        Runnable runnable = new Runnable() {

            final int MAX = Integer.MAX_VALUE;

            @Override
            public void run() {

                int i = 0;

                recurse(i);

            }

            private void recurse(int i) {

                System.out.println(i);

                if (i < MAX) {

                    recurse(i + 1);

                }

            }

        };

        Thread thread = new Thread(threadGroup, runnable, "Test", Integer.parseInt(args[0]));

        thread.start();

    }

}
