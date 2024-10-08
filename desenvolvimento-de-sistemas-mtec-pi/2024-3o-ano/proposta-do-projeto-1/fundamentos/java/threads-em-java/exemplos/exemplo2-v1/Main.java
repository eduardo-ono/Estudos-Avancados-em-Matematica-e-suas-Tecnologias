public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Divisores(1234567890L));
        Thread thread2 = new Thread(new Divisores(1234567891L));

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

class Divisores implements Runnable {

    private long num;

    Divisores(long num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.print("Divisores de " + num + ": ");
        for (long i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(num);
    }

} // MinhaThread
