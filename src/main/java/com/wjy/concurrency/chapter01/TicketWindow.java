package com.wjy.concurrency.chapter01;

/**
 * @Date 2018/11/19
 * @Author ybxxszl
 * @Desc Thread模拟营业大厅叫号机程序
 **/
//public class TicketWindow extends Thread {
//
//    // 最多受理50笔业务
//    private static final int MAX = 1000;
//
//    private static int index = 1;
//
//    private String name;
//
//    public TicketWindow(String name) {
//
//        this.name = name;
//
//    }
//
//    @Override
//    public void run() {
//
//        while (index <= MAX) {
//
//            System.out.println("柜台：" + name + " 当前的号码：" + index++);
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        TicketWindow ticketWindow1 = new TicketWindow("出号机一号");
//        ticketWindow1.start();
//
//        TicketWindow ticketWindow2 = new TicketWindow("出号机二号");
//        ticketWindow2.start();
//
//        TicketWindow ticketWindow3 = new TicketWindow("出号机三号");
//        ticketWindow3.start();
//
//        TicketWindow ticketWindow4 = new TicketWindow("出号机四号");
//        ticketWindow4.start();
//
//    }
//
//}

public class TicketWindow implements Runnable {

    // 最多受理50笔业务
    private static final int MAX = 1000;

    private static int index = 1;

    private String name;

    public TicketWindow(String name) {

        this.name = name;

    }

    public static void main(String[] args) {

        TicketWindow ticketWindow1 = new TicketWindow("出号机一号");
        Thread thread1 = new Thread(ticketWindow1);
        thread1.start();

        TicketWindow ticketWindow2 = new TicketWindow("出号机二号");
        Thread thread2 = new Thread(ticketWindow2);
        thread2.start();

        TicketWindow ticketWindow3 = new TicketWindow("出号机三号");
        Thread thread3 = new Thread(ticketWindow3);
        thread3.start();

        TicketWindow ticketWindow4 = new TicketWindow("出号机四号");
        Thread thread4 = new Thread(ticketWindow4);
        thread4.start();

    }

    @Override
    public void run() {

        while (index <= MAX) {

            System.out.println("柜台：" + name + " 当前的号码：" + index++);

        }

    }

}
