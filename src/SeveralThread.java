public class SeveralThread extends Thread {

        @Override
        public void run () {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " Number: " + i);
            }
        }
        public static void createSeveralThreads () throws InterruptedException {

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread thread = new Thread(() -> System.out.println("Created thread with number: "
                        + Thread.currentThread().getName())); // Threads are created from number 3 (0_0)
                thread.start();
        }
    }
}