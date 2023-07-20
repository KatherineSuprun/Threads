
public class MyThread extends Thread {

    public void startMyThread() {
        Thread thread = new Thread(this, "MyThread");
        thread.start();
    }

    public void run() {

        System.out.println("MyThread started");
        try {
            Thread.sleep(500);

            for (int i = 0; i < 1000; i++);
        } catch (InterruptedException e ) {
            e.getMessage();
        }
        System.out.println("MyThread ended");
    }
}
