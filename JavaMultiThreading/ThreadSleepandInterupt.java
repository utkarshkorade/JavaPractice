public class ThreadSleepandInterupt {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds.");
                Thread.sleep(5000);
                System.out.println("Thread woke up.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        });

        thread.start();
        
        try {
            Thread.sleep(2000);  // Main thread waits 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        thread.interrupt();  // Interrupt the sleeping thread
    }
}
