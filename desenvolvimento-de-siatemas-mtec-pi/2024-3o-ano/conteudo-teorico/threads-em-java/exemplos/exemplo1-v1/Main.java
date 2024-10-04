public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MinhaThread(1));
        Thread thread2 = new Thread(new MinhaThread(2));

        long startTime = System.nanoTime();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double tempoDecorrido = (System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0;
        System.out.println("Tempo de execucao: " + tempoDecorrido + " s");

    }
} // Main

class MinhaThread implements Runnable {

    private int id;

    MinhaThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (id == 2) {
                System.out.print("  ");
            }
            System.out.println(id);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} // MinhaThread
