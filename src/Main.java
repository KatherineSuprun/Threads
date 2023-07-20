import game.Chicken;
import game.Egg;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        MyThread myThread = new MyThread();
        myThread.setPriority(10);
        myThread.startMyThread();

        MyThread1 myThread1 = new MyThread1();
        new Thread(myThread1).start();

        SeveralThread severalThread = new SeveralThread();
        SeveralThread.createSeveralThreads();
        severalThread.start();


        Egg egg = new Egg();
        egg.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(Chicken.getTimeSleep());
                System.out.println("Chicken");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (egg.isAlive()) { // яйцо ли последнее
            try {
                egg.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("The egg came first!");
        } else {
            System.out.println("The chicken came first!");
        }
        System.out.println("Debate is over.");

        ExecutorService executor = Executors.newFixedThreadPool(1);
        List<Future<String>> list = new ArrayList<>();
        Callable<String> callable = new MyThread2();
        for (int i = 0; i < 3; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(new Date() + ":" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
//        Data data = new Data();
//        Thread sender = new Thread(new Sender(data));
//        Thread receiver = new Thread(new Receiver(data));
//
//        sender.start();
//        receiver.start();
