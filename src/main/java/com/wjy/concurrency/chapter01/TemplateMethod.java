package com.wjy.concurrency.chapter01;

/**
 * @Date 2018/11/19
 * @Author ybxxszl
 * @Desc 模板设计模式
 **/
public class TemplateMethod {

    public static void main(String[] args) {

        TemplateMethod t1 = new TemplateMethod() {

            @Override
            protected void wrapPrint(String message) {

                System.out.println("***" + message + "***");

            }

        };

        t1.print("Hello Thread");

        TemplateMethod t2 = new TemplateMethod() {

            @Override
            protected void wrapPrint(String message) {

                System.out.println("***" + message + "***");

            }

        };

        t2.print("Hello Thread");

    }

    public final void print(String message) {

        System.out.println("####################");

        wrapPrint(message);

        System.out.println("####################");

    }

    protected void wrapPrint(String message) {
    }

}
