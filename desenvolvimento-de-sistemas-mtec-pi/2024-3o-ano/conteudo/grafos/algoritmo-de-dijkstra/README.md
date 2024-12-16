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

### Vídeos de Apoio

| Thumb | Descrição |
| :-: | --- |
| ![img](https://img.youtube.com/vi/HUSoIQwJ6cI/default.jpg) | <sup>[Luana Almeida]</sup> [__Resolvendo um exemplo usando o método de DIJKSTRA para encontrar um caminho mínimo__](https://www.youtube.com/watch?v=HUSoIQwJ6cI)<br><sub>(3:34, YouTube, 30/Nov/2022)</sub> |
| ![img](https://img.youtube.com/vi/pzCFs1F3XiI/default.jpg) | <sup>[Luana Almeida]</sup> [__Resolvendo mais um exemplo do algoritmo de Dijkstra__](https://www.youtube.com/watch?v=pzCFs1F3XiI)<br><sub>(3:55, YouTube, 09/Jan/2023)</sub> |

&nbsp;
