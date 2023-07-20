public class MyThread1 implements Runnable {

    public void startThreadRunnable() {
        Thread thread1 = new Thread(this, "MyThread1");
        thread1.start();
    }

    public void run() {
        System.out.println("MyThread1 started");

        try {
            Thread.sleep(100);

            for (int i = 0; i < 1000 ; i++);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread1 ended");
    }
}

