public class Triangulo {

    // Atributos
  private int numLados = 0;
  private double[] lados = new double[] {0, 0, 0};
  private double perimetro = 0;
  private double area = 0;

  // Construtor(es)
  public Triangulo(double a, double b, double c) {
    if (a > 0 && b > 0 && c > 0) {
      this.lados = new double[] {a, b, c};
      numLados = lados.length;
      update();
    }
  }

  Triangulo(double[] lados) {
    Boolean ok = true;
    for (double lado : lados) {
        if (lado <= 0) {
            ok = false;
            break;
        }
    }
    if (ok) {
    this.lados = lados;
    update();
    }
  }

  // Métodos

  public int getNumLados() {
    return numLados;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public double getArea() {
    return area;
  }

  private void update() {
    calcularPerimetro();
    calcularArea();
  }

  private void calcularPerimetro() {
    perimetro = 0;
    for (double lado : lados) {
      perimetro += lado;
    }
  }

  // Cálculo da área do triângulo pela fórmula de Heron (ou Herão, em Português).
  private void calcularArea() {
    double s = perimetro / 2; // semiperímetro
    area = Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
  }

}
