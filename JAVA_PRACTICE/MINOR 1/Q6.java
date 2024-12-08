//Lifecycle of Thread in java
class ThreadLifeCycleDemo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is in RUNNING state.");
            Thread.sleep(1000); // Simulating BLOCKED state (sleep)
           
                System.out.println("Thread is in BLOCKED state (sleeping).");
            } catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread resumed and back to RUNNING state.");
    }}
class Q6{
    public static void main(String[] args) {
        ThreadLifeCycleDemo thread = new ThreadLifeCycleDemo();

        System.out.println("Thread is in NEW state."); // Newborn state
        thread.start(); // Transition to RUNNABLE 

        System.out.println("Thread is in RUNNABLE state.");
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Join interrupted.");
        }

        System.out.println("Thread is in TERMINATED state.");
    }
}
