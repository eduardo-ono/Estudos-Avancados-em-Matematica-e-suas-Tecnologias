<h1 align="center">Java :: Fundamentos</h1>
<h2 align="center">Interfaces e Classes Abstratas</h2>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 06/10/2024</h5>

&nbsp;

## Interfaces

Uma interface determina assinaturas de atributos e métodos, os quais devem ser implementados em classes.

### Características

* Não podem ser instanciadas.
* Todos os membros são públicos (não há necessidade de inlcuir o modificador `public`).
* Atributos são tratados como constantes imutáveis (`final static`).
* Métodos contém apenas as assinaturas e não contém as suas implementações.

&nbsp;

## Exemplos

### Interface Círculo

```Java
public interface Circulo {

  double PI = 3.1416;

  double calcularPerimetro();
  double calcularArea();

}
```

```java
public class Disco {

  double raio;

  // Construtor
  Disco(double raio) {
    this.raio = raio > 0 ? raio : 0;
  }

  public double calcularComprimento() {
    return 2 * Disco.PI * raio;
  }

public double calcularArea() {
    return Disco.PI * raio * raio;
  }

}
```

&nbsp;
