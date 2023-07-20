package multithreading;

public class Data { // Данные
    private String packet;
    private boolean transfer = true;

    public synchronized String receive() {

        while (transfer) { // Пока осуществляется отправка ждём
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        transfer = true;
        String returnPacket = packet;
        notifyAll(); // Уведомить всех
        return returnPacket;
    }
        public synchronized void send (String packet) {
            while (!transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
            transfer = false;

            this.packet = packet;
            notifyAll();
    }
}
