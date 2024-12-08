public class Deadlock {

    final String resource1 = "ratan jaiswal";
    final String resource2 = "vimal jaiswal";

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();

        Thread1 t1 = new Thread1();
     Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }

    class Thread1 extends Thread {
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        }
    }

    class Thread2 extends Thread {
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        }
    }
}
