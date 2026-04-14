package Grafo_lista;

public class Main {
    public static void main(String[] args){

        Grafo grafo = new Grafo();

        grafo.agregarArista("A","D",50);
        grafo.agregarArista("A","B",20);
        grafo.agregarArista("B","C",10);
        grafo.agregarArista("C","A",25);
        grafo.agregarArista("C","F",45);
        grafo.agregarArista("D","C",30);
        grafo.agregarArista("D","E",10);
        grafo.agregarArista("F","A",30);
        grafo.agregarArista("F","D",25);
        grafo.agregarArista("E","F",5);

        grafo.BFS("A");
        System.out.println("");
        grafo.DFS("A");
    }
}
