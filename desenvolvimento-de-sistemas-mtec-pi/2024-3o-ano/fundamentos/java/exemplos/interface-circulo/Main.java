public class Main {

    public static void main(String[] args) {
        Disco disco = new Disco(10);
        System.out.println("Comprimento da circunferência: " + disco.calcularComprimento());
        System.out.println("Area do circulo: " + disco.calcularArea());
    }
}

// A classe Disco poderia (deveria) ser implementada em um arquivo separado.
class Disco implements Circulo {

    double raio;

    // Construtor
    Disco(double raio) {
      this.raio = raio > 0 ? raio : 0;
    }

    @Override
    public double calcularComprimento() {
      return 2 * Disco.PI * raio;
    }

    @Override
    public double calcularArea() {
      return Disco.PI * raio * raio;
    }

}
