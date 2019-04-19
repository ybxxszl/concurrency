package com.wjy.concurrency.chapter01;

/**
 * @Date 2018/11/21
 * @Author ybxxszl
 * @Desc 模拟营业大厅叫号机程序
 **/
public class TicketWindowRunnable implements Runnable {

    private final static int MAX = 100;
    private int index = 1;

    public static void main(String[] args) {

        final TicketWindowRunnable task = new TicketWindowRunnable();

        Thread task1 = new Thread(task, "一号窗口");
        Thread task2 = new Thread(task, "二号窗口");
        Thread task3 = new Thread(task, "三号窗口");
        Thread task4 = new Thread(task, "四号窗口");

        task1.start();
        task2.start();
        task3.start();
        task4.start();

    }

    @Override
    public void run() {

        while (index <= MAX) {

            System.out.println(Thread.currentThread() + " 的号码是：" + index++);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}
