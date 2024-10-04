<h1 align="center">Threads em Java - Exemplo 1</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 03.10.2024</h5>

&nbsp;

## Descrição

Exemplo sem o uso de threads.

## Códigos

Arquivo `Main.java`:

```Java
import java.util.concurrent.TimeUnit;

public class Main {

    public static void funcao1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Delay de 0.5 segundo
            } catch (InterruptedException ie) { };
        }
    }

    public static void funcao2() {
        for (int i = 10; i < 20; i++) {
            System.out.println("  " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Delay de 0.5 segundos
            } catch (InterruptedException ie) { };
        }
    }

    public static void main(String[] args) {
        // Inicia o benchmark
        long startTime = System.nanoTime();

        funcao1();
        funcao2();

        // Finaliza o benchmark
        double tempoDecorrido = (System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0;

        System.out.println("Tempo de execucao: " + tempoDecorrido + " s");
    }

}
```

&nbsp;
