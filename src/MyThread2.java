import java.util.concurrent.Callable;

public class MyThread2 implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(2400);
        return Thread.currentThread().getName();
    }
}