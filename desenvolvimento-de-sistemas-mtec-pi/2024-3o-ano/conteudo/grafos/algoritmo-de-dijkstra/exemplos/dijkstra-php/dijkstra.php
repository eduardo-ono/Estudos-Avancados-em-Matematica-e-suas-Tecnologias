<?php

//

$INT_MAX = 0x7FFFFFFF;

function MinimumDistance($distance, $shortestPathTreeSet, $numVertices)
{
	global $INT_MAX;
	$min = $INT_MAX;
	$minIndex = 0;

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

function PrintResult($distance, $numVertices)
{
	echo "Vertex \t Distancia da origem\n";

	for ($i = 0; $i < $numVertices; ++$i)
		echo $i . "\t  " . $distance[$i] . "\n";
}

function Dijkstra($grafo, $origem, $numVertices)
{
	global $INT_MAX;
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

	PrintResult($distance, $numVertices);
}
