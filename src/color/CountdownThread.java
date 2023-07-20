package color;

public class CountdownThread  extends Thread {
    private final CountDown threadCountdown;

    public CountdownThread(CountDown countDown) {
        threadCountdown = countDown;
    }

    public void run() {
        threadCountdown.doCountDown();
    }
}
