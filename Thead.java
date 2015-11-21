/**
 * Created by TR on 2015/11/21.
 */
public class Thead {
    package org.frzh.thread;
    public class FirstThread extends Thread{

        private int i;
        //重写run方法，run方法的方法体就是线程执行体

        public void run() {
            for (; i < 100; i++) {
                //当线程类继承Thread类时，可以直接调用getName方法获得当前线程名
                //如果想获得当前线程，直接使用this
                //Thread对象的getName方法返回当前线程的名字
                System.out.println(getName() + " " + i);
            }
        }

        public static void main(String[] args) {

            for (int i = 0; i < 100; i++) {
                //调用Thead的currentThread方法获取当前线程
                System.out.println(Thread.currentThread().getName() + " " +i);

                if (i == 20) {
                    new FirstThread().start();
                    new FirstThread().start();
                }
            }
        }
    }
}
