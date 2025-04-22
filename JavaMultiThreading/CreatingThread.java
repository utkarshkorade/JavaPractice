// Method 1: Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class is running.");
    }
}

// Method 2: Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable interface is running.");
    }
}

class CreatingThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // Starting the thread created by extending Thread class

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start(); // Starting the thread created by implementing Runnable interface
    }
}
