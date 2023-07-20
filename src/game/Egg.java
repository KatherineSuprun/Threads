package game;

public class Egg extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**********GAME**********");
        System.out.println("Chicken or egg?");
        for (int i = 0; i < 5 ; i++) {
            try {
                sleep(Chicken.getTimeSleep());
                System.out.println("Egg");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
