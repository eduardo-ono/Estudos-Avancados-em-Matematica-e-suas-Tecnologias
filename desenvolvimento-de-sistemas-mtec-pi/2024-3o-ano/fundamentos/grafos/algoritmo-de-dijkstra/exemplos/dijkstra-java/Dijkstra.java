// import java.io.*;
// import java.lang.*;
// import java.util.*;

public class Dijkstra {

    // Função que encontra o vértice com a menor distância mínima.
    // distance value, from the set of vertices not yet
    // included in shortest path tree
    static final int V = 6;

    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // Function que imprime o array "dist" com as distâncias mínimas.
    void printSolution(int dist[])
    {
        System.out.println("Vertice \t\t Distancia a partir da origem");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    // Function that implements Dijkstra's single source
    // shortest path algorithm for a graph represented using
    // adjacency matrix representation
    void dijkstra(int[][] grafo, int src)
    {
        final int N = grafo.length;
        int dist[] = new int[N]; // The output array.
                                 // dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in
        // shortest path tree or shortest distance from src
        // to i is finalized
        Boolean sptSet[] = new Boolean[N];

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < N - 1; count++) {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < N; v++)

                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!sptSet[v] && grafo[u][v] != 0
                    && dist[u] != Integer.MAX_VALUE
                    && dist[u] + grafo[u][v] < dist[v])
                    dist[v] = dist[u] + grafo[u][v];
        }

        // print the constructed distance array
        printSolution(dist);
    }

    // Driver's code
    public static void main(String[] args)
    {
        int grafo[][] = new int[][] { { 0, 4, 2, 0, 0, 0 },
                                      { 4, 0, 1, 5, 0, 0 },
                                      { 2, 1, 0, 8, 10, 0 },
                                      { 0, 5, 8, 0, 2, 6 },
                                      { 0, 0, 10, 2, 0, 2 },
                                      { 0, 0, 0, 6, 2, 0 } };

        Dijkstra t = new Dijkstra();

        t.dijkstra(grafo, 1);
    }
}
// This code is contributed by Aakash Hasija
