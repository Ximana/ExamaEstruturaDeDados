package controller;

public class ArvoreBinaria<T> {

    private No<T> raiz;

    private static class No<T> {

        private T valor;
        private No<T> esquerda;
        private No<T> direita;

        public No(T valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    public void inserir(T valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    private No<T> inserirRecursivamente(No<T> no, T valor) {
        if (no == null) {
            return new No<>(valor);
        }

        if (valor.hashCode() < no.valor.hashCode()) {
            no.esquerda = inserirRecursivamente(no.esquerda, valor);
        } else if (valor.hashCode() > no.valor.hashCode()) {
            no.direita = inserirRecursivamente(no.direita, valor);
        }

        return no;
    }

    public boolean buscar(T valor) {
        return buscarRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(No<T> no, T valor) {
        if (no == null) {
            return false;
        }

        if (valor.hashCode() == no.valor.hashCode()) {
            return true;
        }

        if (valor.hashCode() < no.valor.hashCode()) {
            return buscarRecursivamente(no.esquerda, valor);
        } else {
            return buscarRecursivamente(no.direita, valor);
        }
    }

    public void remover(T valor) {
        raiz = removerRecursivamente(raiz, valor);
    }

    private No<T> removerRecursivamente(No<T> no, T valor) {
        if (no == null) {
            return null;
        }

        if (valor.hashCode() < no.valor.hashCode()) {
            no.esquerda = removerRecursivamente(no.esquerda, valor);
        } else if (valor.hashCode() > no.valor.hashCode()) {
            no.direita = removerRecursivamente(no.direita, valor);
        } else {
            if (no.esquerda == null && no.direita == null) {
                return null;
            } else if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            } else {
                No<T> sucessor = encontrarSucessor(no.direita);
                no.valor = sucessor.valor;
                no.direita = removerRecursivamente(no.direita, sucessor.valor);
            }
        }

        return no;
    }

    private No<T> encontrarSucessor(No<T> no) {
        if (no.esquerda == null) {
            return no;
        }

        return encontrarSucessor(no.esquerda);
    }

    public void verPreOrdem() {
        verPreOrdemRecursivamente(raiz);
        System.out.println();
    }

    private void verPreOrdemRecursivamente(No<T> no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            verPreOrdemRecursivamente(no.esquerda);
            verPreOrdemRecursivamente(no.direita);
        }
    }

    public void verPosOrdem() {
        verPosOrdemRecursivamente(raiz);
        System.out.println();
    }

    private void verPosOrdemRecursivamente(No<T> no) {
        if (no != null) {
            verPosOrdemRecursivamente(no.esquerda);
            verPosOrdemRecursivamente(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public void verEmOrdem() {
        verEmOrdemRecursivamente(raiz);
        System.out.println();
    }

    private void verEmOrdemRecursivamente(No<T> no) {
        if (no != null) {
            verEmOrdemRecursivamente(no.esquerda);
            System.out.print(no.valor + " ");
            verEmOrdemRecursivamente(no.direita);
        }
    }

    public void verPreFixado() {
        verPreFixadoRecursivamente(raiz);
        System.out.println();
    }

    private void verPreFixadoRecursivamente(No<T> no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            verPreFixadoRecursivamente(no.esquerda);
            verPreFixadoRecursivamente(no.direita);
        }
    }
}
