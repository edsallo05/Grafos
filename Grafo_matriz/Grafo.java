package Grafo_matriz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Grafo {

    private int[][] matriz;
    private int n;

    public Grafo(int[][] matriz) {
        this.matriz = matriz;
        this.n = matriz.length;
    }


    public void BFS(char inicio) {

        boolean[] visitado = new boolean[n];
        Queue<Integer> cola = new LinkedList<>();

        int start = inicio - 'A';

        cola.add(start);
        visitado[start] = true;

        while (!cola.isEmpty()) {

            int nodo = cola.poll();
            System.out.print((char)(nodo + 'A') + " ");

            // recorrer columnas en orden ascendente
            for (int i = 0; i < n; i++) {
                if (matriz[nodo][i] == 1 && !visitado[i]) {
                    visitado[i] = true;
                    cola.add(i);
                }
            }
        }
    }

    public void DFS(char inicio) {

        boolean[] visitado = new boolean[n];
        Stack<Integer> pila = new Stack<>();

        int start = inicio - 'A';

        pila.push(start);

        while (!pila.isEmpty()) {

            int nodo = pila.pop();

            if (!visitado[nodo]) {
                visitado[nodo] = true;
                System.out.print((char)(nodo + 'A') + " ");

                for (int i = n - 1; i >= 0; i--) {
                    if (matriz[nodo][i] == 1 && !visitado[i]) {
                        pila.push(i);
                    }
                }
            }
        }
    }
}