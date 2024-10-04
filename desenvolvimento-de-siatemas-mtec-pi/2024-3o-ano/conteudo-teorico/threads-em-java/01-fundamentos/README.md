<h1 align="center">Fundamentos de Threads em Java</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 02.10.2024</h5>

&nbsp;

## Tipos de dados em Java

| Tipo    | Tamanho | Intervalo                                               |
|:--------|:-------:|:--------------------------------------------------------|
| byte    | 1 byte  | -128 a 127                                              |
| short   | 2 bytes | -32.768 a 32.767                                        |
| int     | 4 bytes | -2.147.483.648 a 2.147.483.647                          |
| long    | 8 bytes | -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807 |
| float   | 4 bytes | 6 a 7 casas decimais.                                   |
| double  | 8 bytes | 15 casas decimais.                                      |
| boolean |  1 bit  | `true` ou `false`                                       |
| char    | 2 bytes | 1 caractere                                             |

&nbsp;

## Algoritmo para determinação dos divisores de um número inteiro

```java
long num = 123456;

for (long i = 1; i <= num / 2; i++) {
  if (num % i == 0) {
    System.out.print(i + " ");
  }
  System.out.println();
}
```

## Material de Apoio

| Thumb | Descrição |
| --- | --- |
| [![img](https://img.youtube.com/vi/nODe5lFcGpg/default.jpg)](https://www.youtube.com/watch?v=nODe5lFcGpg) | <sup>[Fernanda Kipper \| Dev]</sup><br>[__Aprenda JAVA do ZERO \| Curso GRATUITO de Java para iniciantes__](https://www.youtube.com/watch?v=nODe5lFcGpg)<br><sub>(1:49:21, YouTube, 03/Out/2024)</sub> |

&nbsp;
