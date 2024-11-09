<?php

require './dijkstra.php';

// Matriz de Adjacências
$grafo = array(
    array(0, 4, 2, 0, 0, 0),
    array(4, 0, 1, 5, 0, 0),
    array(2, 1, 0, 8, 10, 0),
    array(0, 5, 8, 0, 2, 6),
    array(0, 0, 10, 2, 0, 2),
    array(0, 0, 0, 6, 2, 0 )
);

$origem = 0;

// Parâmetros da função Dijkstra: (grafo, vértice_origem, ordem_da_Matriz_de_Adjacências)
// Dijkstra($grafo, 0, 6);
$distancias_minimas = Dijkstra($grafo, $origem);

$cidades = array('Pirassununga', 'Leme', 'Araras', 'Porto Ferreira', 'Mococa', 'Rio Claro');

// Imprime as distâncias mínimas
echo "Origem: " . $cidades[$origem] . "\n";
echo "Vertice \t Distancia da origem\n";
for ($i = 0; $i < count($grafo); ++$i) {
    echo $cidades[$i] . ":  " . $distancias_minimas[$i] . "\n";
}
