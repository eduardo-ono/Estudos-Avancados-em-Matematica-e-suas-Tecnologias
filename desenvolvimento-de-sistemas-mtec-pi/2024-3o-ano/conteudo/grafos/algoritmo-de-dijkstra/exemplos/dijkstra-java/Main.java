public class Main {
    public static void main(String[] args) {

        int grafo[][] = new int[][] {
                { 0, 4, 2, 0, 0, 0 },
                { 4, 0, 1, 5, 0, 0 },
                { 2, 1, 0, 8, 10, 0 },
                { 0, 5, 8, 0, 2, 6 },
                { 0, 0, 10, 2, 0, 2 },
                { 0, 0, 0, 6, 2, 0 }
        };

        Dijkstra dijkstra = new Dijkstra(grafo, 0);
        dijkstra.imprimirSolucao();
    }
}
