import java.util.concurrent.TimeUnit;

public class Tempo {

    // Atributos
    private long tempoInicial;
    private long tempoFinal;
    private double tempoDecorrido;

    // Contrutor padrão

    // Métodos
    public void start() {
        tempoInicial = System.nanoTime();
    }

    public void stop() {
        tempoFinal = System.nanoTime();
        tempoDecorrido = (tempoFinal - tempoInicial)/1000.0/1000.0/1000.0;
    }

    public double getTempoDecorrido() {
        return tempoDecorrido;
    }

}
