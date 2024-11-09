<?php

/*
 * Arquivo: dijkstra.php
 * Última modificação: 06.11.2024
 * Referências:
 *
 */

$INT_MAX = 0x7FFFFFFF;

function MinimumDistance($distance, $shortestPathTreeSet)
{
	global $INT_MAX;
	$min = $INT_MAX;
	$minIndex = 0;
	$numVertices = count($distance);

	for ($v = 0; $v < $numVertices; ++$v)
	{
		if ($shortestPathTreeSet[$v] == false && $distance[$v] <= $min)
		{
			$min = $distance[$v];
			$minIndex = $v;
		}
	}

	return $minIndex;
}

function Dijkstra($grafo, $origem)
{
	global $INT_MAX;
	$numVertices = count($grafo);
	$distance = array();
	$shortestPathTreeSet = array();

	for ($i = 0; $i < $numVertices; ++$i)
	{
		$distance[$i] = $INT_MAX;
		$shortestPathTreeSet[$i] = false;
	}

	$distance[$origem] = 0;

	for ($count = 0; $count < $numVertices - 1; ++$count)
	{
		$u = MinimumDistance($distance, $shortestPathTreeSet, $numVertices);
		$shortestPathTreeSet[$u] = true;

		for ($v = 0; $v < $numVertices; ++$v)
			if (!$shortestPathTreeSet[$v] && $grafo[$u][$v] && $distance[$u] != $INT_MAX && $distance[$u] + $grafo[$u][$v] < $distance[$v])
				$distance[$v] = $distance[$u] + $grafo[$u][$v];
	}
	return $distance;
}
