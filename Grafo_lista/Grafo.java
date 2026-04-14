package Grafo_lista;

import java.util.*;

public class Grafo {
    Map<String, LinkedList<Par>> lista_adyacencia = new HashMap<>();

    class Par {
        String destino;
        int peso;

        Par(String d, int p){
            destino = d;
            peso = p;
        }
    }

    public void agregarArista(String origen, String destino, int peso){
        lista_adyacencia.putIfAbsent(origen,new LinkedList<>());
        lista_adyacencia.get(origen).add(new Par(destino,peso));
    }

    public void BFS(String inicio){
        Set<String> visitados = new HashSet<>();
        Queue<String> cola = new LinkedList<>();

        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()){
            String nodo = cola.poll();
            System.out.println(nodo + " ");

            for (Par vecino : lista_adyacencia.get(nodo)){
                if (!visitados.contains(vecino.destino)){
                    visitados.add(vecino.destino);
                    cola.add(vecino.destino);
                }
            }
        }
    }

    public void DFS(String inicio){
        Set<String> visitados = new HashSet<>();
        Stack<String> pila = new Stack<>();

        pila.push(inicio);

        while (!pila.isEmpty()){
            String nodo = pila.pop();

            if (!visitados.contains(nodo)){
                visitados.add(nodo);
                System.out.println(nodo + " ");

                for (Par vecino : lista_adyacencia.get(nodo)){
                    pila.push(vecino.destino);
                }
            }
        }
    }
}

