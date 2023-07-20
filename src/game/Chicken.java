package game;

import java.util.Random;

public class Chicken {

    public static int getTimeSleep() {
        Random random = new Random();
        int time = random.nextInt(1600);
        if (time < 10)
            time *= 10;
        return time;
    }
}
