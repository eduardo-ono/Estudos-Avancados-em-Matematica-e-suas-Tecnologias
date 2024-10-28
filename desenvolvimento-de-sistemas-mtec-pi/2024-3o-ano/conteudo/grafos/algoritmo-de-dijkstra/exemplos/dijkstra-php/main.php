<?php

require './dijkstra.php';

$grafo = array(
    array(0, 4, 2, 0, 0, 0),
    array(4, 0, 1, 5, 0, 0),
    array(2, 1, 0, 8, 10, 0),
    array(0, 5, 8, 0, 2, 6),
    array(0, 0, 10, 2, 0, 2),
    array(0, 0, 0, 6, 2, 0 )
);

// Parâmetros: grafo, vértice origem, ordem da matriz
Dijkstra($grafo, 0, 6);
