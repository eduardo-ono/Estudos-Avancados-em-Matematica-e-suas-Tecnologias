import java.util.concurrent.TimeUnit;

public class Main {

    public static void metodo(int id) {

        for (int i = 0; i < 10; i++) {
            if (id == 2) {
                System.out.print("  ");
            }
            System.out.println(id);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Delay de 0.5 segundo
        }
    }

    public static void main(String[] args) {
        // Inicia o benchmark
        long startTime = System.nanoTime();

        metodo(1);
        metodo(2);

        // Finaliza o benchmark
        double tempoDecorrido = (System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0;
        System.out.println("Tempo de execucao: " + tempoDecorrido + " s");
    }

}
