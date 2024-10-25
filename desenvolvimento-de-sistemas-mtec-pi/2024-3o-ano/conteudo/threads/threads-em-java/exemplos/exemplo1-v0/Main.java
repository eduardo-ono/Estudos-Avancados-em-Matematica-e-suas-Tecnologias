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
        Tempo tempo = new Tempo();
        tempo.start();

        metodo(1);
        metodo(2);

        // Finaliza o benchmark
        tempo.stop();
        System.out.println("Tempo de execucao: " + tempo.getTempoDecorrido() + " s");
    }

}
