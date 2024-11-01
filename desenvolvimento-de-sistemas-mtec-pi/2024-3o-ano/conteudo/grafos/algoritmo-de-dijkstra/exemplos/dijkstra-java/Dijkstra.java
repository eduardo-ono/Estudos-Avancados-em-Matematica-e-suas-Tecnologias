/*
 *
 *
 *
 * Fonte: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
 */

public class Dijkstra {

    // Método que encontra o vértice com a menor distância mínima.
    // distance value, from the set of vertices not yet
    // included in shortest path tree

    int[][] grafo;
    int origem;
    int[] distancias;
    Boolean[] verticesVisitados;

    // Construtor
    Dijkstra(int[][] grafo, int origem) {
        this.grafo = grafo;
        this.origem = origem;
        distancias = new int[grafo.length];
        verticesVisitados = new Boolean[grafo.length];
        dijkstra();
    }

    private int minDistance()
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < distancias.length; v++)
            if (verticesVisitados[v] == false && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }

        return min_index;
    }

    // Function que imprime o array "dist" com as distâncias mínimas.
    public void imprimirSolucao()
    {
        System.out.println("Vertice \t\t Distancia a partir da origem");
        for (int i = 0; i < distancias.length; i++) {
            System.out.println(i + " \t\t " + distancias[i]);
        }
    }

    // Function that implements Dijkstra's single source
    // shortest path algorithm for a graph represented using
    // adjacency matrix representation
    void dijkstra() {
        final int N = grafo.length;

        // sptSet[i] will true if vertex i is included in
        // shortest path tree or shortest distance from src
        // to i is finalized

        // Inicializa todas as distâncias[] com "INFINITE" e verticesVisitados[] com false
        for (int i = 0; i < N; i++) {
            distancias[i] = Integer.MAX_VALUE;
            verticesVisitados[i] = false;
        }

        // Distance of source vertex from itself is always 0
        distancias[origem] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < N - 1; count++) {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance();

            // Mark the picked vertex as processed
            verticesVisitados[u] = true;

            // Update dist value of the adjacent vertices of the picked vertex.
            for (int v = 0; v < N; v++)
                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!verticesVisitados[v]
                    && grafo[u][v] != 0
                    && distancias[u] != Integer.MAX_VALUE
                    && distancias[u] + grafo[u][v] < distancias[v]) {
                        distancias[v] = distancias[u] + grafo[u][v];
                    }
        }
    }
}
