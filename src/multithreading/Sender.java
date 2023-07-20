package multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable { // Отправитель

    private Data data; // Данные

    public Sender(Data data) { // Конструктор отправителя что отправляем
        this.data = data;
    }

    public void run() { // Действие, инфа
        String packets[] = {
                "First packet",
                "Second packet"
        };

        for (String packet : packets) { // Данные с пакета отправляем
            data.send(packet);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
    }
}
