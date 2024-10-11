<h1 align="center">Java :: Classes e Objetos</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 11/10/2024</h5>

&nbsp;

## Conceitos e Definições

Uma classe é uma abstração de um objeto.

### Exemplo

#### Classe Triangulo

```java
public class Triangulo {

    // Atributos
  private int numLados = 0;
  private double[] lados = new double[] {0, 0, 0};
  private double perimetro = 0;
  private double area = 0;

  // Construtor(es)
  Triangulo(double a, double b, double c) {
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

  public double getPerimetro() {
    return perimetro;
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

  private void calcularArea() {
    double s = perimetro / 2; // semiperímetro
    area = Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
  }

}
```

#### Classe Principal (Main)

```java
public class Main {

  public static void Main(String args[]) {
    Triangulo triangulo1 = new Triangulo(3, 4, 5);
    Triangulo triangulo2 = new Triangulo(new double[] {1, 1, 1});


  }
}
```

&nbsp;
