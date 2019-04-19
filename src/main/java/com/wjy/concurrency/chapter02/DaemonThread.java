package com.wjy.concurrency.chapter02;

/**
 * @Date 2018/11/25
 * @Author ybxxszl
 * @Desc 守护线程：具备自动结束生命周期的特性。随着JVM虚拟机退出，守护线程结束运行。用于执行后台任务。例如JDK的垃圾回收线程
 **/
public class DaemonThread extends Thread {

    public static void main(String[] args) {

        try {

            DaemonThread thread = new DaemonThread();

            System.out.println(thread.isDaemon());

            thread.setDaemon(true);

            System.out.println(thread.isDaemon());

            thread.start();

            Thread.sleep(5000);

            System.out.println("End");

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

    @Override
    public void run() {

        try {

            while (true) {

                System.out.println("running");

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
