<h1 align="center">Algoritmo de Dijkstra</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 03/Out/2024</h5>

&nbsp;

## Definição

O Algoritmo de Dijkstra foi criado em 1956 pelo cientista da computação holandês Edsger Dijkstra e compreende um algoritmo de caminho mínimo que encontra o caminho mais curto entre dois vértices em um grafo ponderado.

&nbsp;

## Exemplo

![img](./grafo.jpg)

Considerando o vértice _A_ como o vértice origem (ou vértice inicial), determinar o caminho mínimo para os outros vértices.

Pivô = A

Identificar todos os vértices ligados diretamente ao vértice origem:

| Vértice | Distância mínima | Caminho |
|:-------:|:----------------:|:--------|
|    A    |        0         | A       |
|    B    |        4         | A -> B  |
|    C    |        2         | A -> C  |

Pivô = C (vértice com a menor distância do vértice origem (_A_) até o momento)

| Vértice | Distância mínima | Caminho     |
|:-------:|:----------------:|:------------|
|    A    |        0         | A           |
|    B    |        3         | A -> C -> B |
|    C    |        2         | A -> C      |
|    D    |        10        | A -> C -> D |
|    E    |        12        | A -> C -> E |

Pivô = B

| Vértice | Distância mínima | Caminho          |
|:-------:|:----------------:|:-----------------|
|    A    |        0         | A                |
|    B    |        3         | A -> C -> B      |
|    C    |        2         | A -> C           |
|    D    |        8         | A -> C -> B -> D |
|    E    |        12        | A -> C -> E      |

Pivô = D

| Vértice | Distância mínima | Caminho               |
|:-------:|:----------------:|:----------------------|
|    A    |        0         | A                     |
|    B    |        3         | A -> C -> B           |
|    C    |        2         | A -> C                |
|    D    |        8         | A -> C -> B -> D      |
|    E    |        10        | A -> C -> B -> E      |
|    F    |        14        | A -> C -> B -> D -> F |

Pivô = E

| Vértice | Distância mínima | Caminho               |
|:-------:|:----------------:|:----------------------|
|    A    |        0         | A                     |
|    B    |        3         | A -> C -> B           |
|    C    |        2         | A -> C                |
|    D    |        8         | A -> C -> B -> D      |
|    E    |        10        | A -> C -> B -> E      |
|    F    |        12        | A -> C -> B -> E -> F |

&nbsp;

## Representação de um grafo oonderado através de Matriz de Adjacência

Na matriz de Adjacência (ou Matriz de Adjacências) cada elemento corresponde ao peso da aresta que conecta dois vértices. Quando não há uma conecção direta entre dois vértices, o elemento recebe o valor zero. O valor entre um mesmo vértice, por exemplo, entre o vértice _A_ e _A_, _B_ e _B_, etc., também é zero.

|   | A | B | C  | D | E  | F |
|:-:|:-:|:-:|:--:|:-:|:--:|:-:|
| A | 0 | 4 | 2  | 0 | 0  | 0 |
| B | 4 | 0 | 1  | 5 | 0  | 0 |
| C | 2 | 1 | 0  | 8 | 10 | 0 |
| D | 0 | 5 | 8  | 0 | 2  | 6 |
| E | 0 | 0 | 10 | 2 | 0  | 2 |
| F | 0 | 0 | 0  | 6 | 2  | 0 |

&nbsp;
