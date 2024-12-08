class Notify implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName());
        synchronized (this) {
            try {
                this.wait(); // Thread waits here
                System.out.println("Thread resumed.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("BVHhj.");
    }
}

class ThreadCoMM {
    public static void main(String[] args) {
        Notify object = new Notify();
        Thread t1 = new Thread(object);
        t1.setName("MOTU");

        t1.start();

        try {
            // Sleep to ensure t1 runs and enters wait state
            Thread.sleep(1000);
            
            synchronized (object) {
                object.notify(); // Notify the waiting thread
                System.out.println("Thread notified.");
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        try {
            t1.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for thread to finish.");
        }
    }
}
