package Grafo_matriz;

public class Main {
    public static void main (String[] args){


        int [][] matriz = {
                //A B  C  D  E  F  G
                {0, 1, 1, 1, 0, 0, 0},//A
                {1, 0, 1, 0, 1, 0, 1},//B
                {1, 1, 0, 1, 0, 1, 0},//C
                {1, 0, 1, 0, 0, 0, 1},//D
                {0, 1, 0, 0, 0, 1, 1},//E
                {0, 0, 1, 0, 1, 0, 1},//F
                {0, 1, 0, 1, 1, 1, 0}//G
        };

        Grafo grafo = new Grafo(matriz);

        System.out.print("BFS: ");
        grafo.BFS('A');
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("DFS: ");
        grafo.DFS('A');
    }
}
