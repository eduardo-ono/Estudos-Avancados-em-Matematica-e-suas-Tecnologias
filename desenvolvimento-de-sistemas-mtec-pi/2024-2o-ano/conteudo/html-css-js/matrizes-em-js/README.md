<h1 align="center">Matrizes</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 29/10/2024</h5>

&nbsp;

## Representações de Matrizes

* Exemplo de uma matriz $3 \times 3$ em linguagem algébrica (uso de letras para representar números)

$$
M =
\begin{bmatrix}
a_{11} & a_{12} & a_{13} \\
a_{21} & a_{22} & a_{23} \\
a_{31} & a_{32} & a_{33}
\end{bmatrix}
$$

* Exemplo de representação de uma matriz $3 \times 3$ onde os índices iniciam em 0 (zero) e as linhas são vetores

$$
M =
\begin{bmatrix}
\ [ \ a_{00} & a_{01} & a_{02} \ ] \ \\
\ [ \ a_{10} & a_{11} & a_{12} \ ] \ \\
\ [ \ a_{20} & a_{21} & a_{22} \ ]
\end{bmatrix}
\
\begin{matrix}
\leftarrow \text{linha 0} \\
\leftarrow \text{linha 1} \\
\leftarrow \text{linha 2}
\end{matrix}
$$

* Exemplo numérico de uma matriz $3 \times 3$ em Java e JavaScript

$$
\begin{bmatrix}
[ \ 1 & 2 & 3 \ ] \\
[ \ 4 & 5 & 6 \ ] \\
[ \ 7 & 8 & 9 \ ]
\end{bmatrix}
$$

* Código em Java

```java
int[][] m = { {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9} };
```

```java
for (int i = 0; i < m.lenght; i++) {
  for (int j = 0; j < m[i].lenght; j++) {
    System.out.print(a[i][j] + " ");
  }
  System.out.println();
}
```

Saída

```txt
1 2 3
4 5 6
7 8 9
```

* Código em JavaScript

```JavaScript
var m = [ [1, 2, 3],
          [4, 5, 6],
          [7, 8, 9] ];

for (let i = 0; i < m.length; i++) {
    for (let j = 0; j < m[i].length; j++) {
        process.stdout.write(m[i][j] + " "); // console.log() sem final de linha
    }
    console.log();
}
```

&nbsp;
