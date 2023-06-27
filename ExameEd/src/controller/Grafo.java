package controller;

import java.util.*;

public class Grafo<T> {

    private Map<T, List<T>> adjacencias;

    public Grafo() {
        adjacencias = new HashMap<>();
    }

    public void adicionarVertice(T vertice) {
        adjacencias.put(vertice, new ArrayList<>());
    }

    public void adicionarAresta(T vertice1, T vertice2) {
        if (!adjacencias.containsKey(vertice1) || !adjacencias.containsKey(vertice2)) {
            throw new IllegalArgumentException("Vertice(s) nao existe(m) no grafo.");
        }

        List<T> arestasVertice1 = adjacencias.get(vertice1);
        List<T> arestasVertice2 = adjacencias.get(vertice2);

        arestasVertice1.add(vertice2);
        arestasVertice2.add(vertice1);
    }

    public void removerVertice(T vertice) {
        if (!adjacencias.containsKey(vertice)) {
            throw new IllegalArgumentException("Vertice nao existe no grafo.");
        }

        List<T> arestas = adjacencias.get(vertice);

        for (T vizinho : arestas) {
            List<T> arestasVizinho = adjacencias.get(vizinho);
            arestasVizinho.remove(vertice);
        }

        adjacencias.remove(vertice);
    }

    public void removerAresta(T vertice1, T vertice2) {
        if (!adjacencias.containsKey(vertice1) || !adjacencias.containsKey(vertice2)) {
            throw new IllegalArgumentException("Vertice(s) nao existe(m) no grafo.");
        }

        List<T> arestasVertice1 = adjacencias.get(vertice1);
        List<T> arestasVertice2 = adjacencias.get(vertice2);

        arestasVertice1.remove(vertice2);
        arestasVertice2.remove(vertice1);
    }

    public List<T> obterVizinhos(T vertice) {
        if (!adjacencias.containsKey(vertice)) {
            throw new IllegalArgumentException("Vertice nao existe no grafo.");
        }

        return adjacencias.get(vertice);
    }

    public boolean contemVertice(T vertice) {
        return adjacencias.containsKey(vertice);
    }

    public boolean contemAresta(T vertice1, T vertice2) {
        if (!adjacencias.containsKey(vertice1) || !adjacencias.containsKey(vertice2)) {
            return false;
        }

        List<T> arestasVertice1 = adjacencias.get(vertice1);

        return arestasVertice1.contains(vertice2);
    }

    public int obterNumeroVertices() {
        return adjacencias.size();
    }

    public int obterNumeroArestas() {
        int numeroArestas = 0;

        for (List<T> arestas : adjacencias.values()) {
            numeroArestas += arestas.size();
        }

        return numeroArestas / 2; // Cada aresta é contada duas vezes (uma para cada vértice)
    }

    //=========================================================================================================//
    public List<T> obterTodosVertices() {
        return new ArrayList<>(adjacencias.keySet());
    }

    public List<Par<T, T>> obterTodasArestas() {
        List<Par<T, T>> arestas = new ArrayList<>();

        for (T vertice : adjacencias.keySet()) {
            List<T> vizinhos = adjacencias.get(vertice);

            for (T vizinho : vizinhos) {
                Par<T, T> aresta = new Par<>(vertice, vizinho);
                if (!arestas.contains(aresta)) {
                    arestas.add(aresta);
                }
            }
        }

        return arestas;
    }
     

    private class Par<T, U> {

        private T primeiro;
        private U segundo;

        public Par(T primeiro, U segundo) {
            this.primeiro = primeiro;
            this.segundo = segundo;
        }

        public T getPrimeiro() {
            return primeiro;
        }

        public U getSegundo() {
            return segundo;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Par<?, ?> par = (Par<?, ?>) obj;

            if (!primeiro.equals(par.primeiro)) {
                return false;
            }

            return segundo.equals(par.segundo);
        }

        @Override
        public int hashCode() {
            int result = primeiro.hashCode();
            result = 31 * result + segundo.hashCode();
            return result;
        }
    }
}