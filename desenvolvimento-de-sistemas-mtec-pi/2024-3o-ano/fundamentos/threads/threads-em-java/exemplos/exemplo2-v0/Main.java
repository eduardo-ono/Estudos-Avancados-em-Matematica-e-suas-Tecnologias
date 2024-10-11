import java.util.concurrent.TimeUnit;

public class Main {

    public static void divisores(long num) {

        System.out.print("Divisores de " + num + ": ");
        for (long i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        // Inicia o benchmark
        long startTime = System.nanoTime();

        divisores(1234567890l);
        divisores(1234567891l);

        // Finaliza o benchmark
        double tempoDecorrido = (System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0;
        System.out.println("Tempo de execucao: " + tempoDecorrido + " s");
    }

}
