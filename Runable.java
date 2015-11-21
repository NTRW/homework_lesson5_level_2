/**
 * Created by TR on 2015/11/21.
 */

//采用实现Runable接口的多线程

public class Runable {
    public static void main(String[] args) {
        private int i;

        @Override

        public void run() {
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }

        public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                if (i == 20) {
                    SecondThread st = new SecondThread();
                    new Thread(st, "子线程1").start();
                    new Thread(st, "子线程2").start();
                }
            }
        }
    }
}
