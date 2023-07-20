package color;

public class CountDown {

    public void doCountDown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "MyThread" :
                color = ThreadColor.ANSI_YELLOW;
                break;
            case "MyThread1" :
                color = ThreadColor.ANSI_PURPLE;
                break;
            case  "MyThread2" :
                color = ThreadColor.ANSI_GREEN;
                break;
            case  "SeveralThread" :
                color = ThreadColor.ANSI_RED;
                break;
            default:
                color = ThreadColor.ANSI_BLUE;
        }
        for (int i = 0; i < 1 ; i++) {
            System.out.println(color +
                    Thread.currentThread().getName() + " Experiment :) ");
        }
    }
}
