package controller;

import javax.swing.DefaultListModel;

public class ListaCircular<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListaCircular() {
        head = null;
        tail = null;
        size = 0;
    }

    public void inserirNoInicio(T elemento) {
        Node<T> newNode = new Node<>(elemento);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    public void inserirNoMeio(T elemento, int posicao) {
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        if (posicao == 0) {
            inserirNoInicio(elemento);
            return;
        }

        Node<T> newNode = new Node<>(elemento);
        Node<T> atual = head;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.next;
        }

        newNode.next = atual.next;
        atual.next = newNode;

        if (posicao == size) {
            tail = newNode;
        }

        size++;
    }

    public void inserirNoFinal(T elemento) {
        if (isEmpty()) {
            inserirNoInicio(elemento);
        } else {
            Node<T> newNode = new Node<>(elemento);
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public T removerDoInicio() {
        if (isEmpty()) {
            throw new IllegalStateException("A lista circular está vazia.");
        }

        T elementoRemovido = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }

        size--;

        return elementoRemovido;
    }

    public T removerDoMeio(int posicao) {
        if (isEmpty() || posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Posição inválida ou lista vazia.");
        }

        if (posicao == 0) {
            return removerDoInicio();
        }

        Node<T> atual = head;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.next;
        }

        T elementoRemovido = atual.next.data;

        if (atual.next == tail) {
            tail = atual;
        }

        atual.next = atual.next.next;
        size--;

        return elementoRemovido;
    }

    public T removerDoFinal() {
        if (isEmpty()) {
            throw new IllegalStateException("A lista circular está vazia.");
        }

        if (size == 1) {
            return removerDoInicio();
        }

        Node<T> atual = head;

        while (atual.next != tail) {
            atual = atual.next;
        }

        T elementoRemovido = tail.data;
        tail = atual;
        tail.next = head;
        size--;

        return elementoRemovido;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void verElementos() {
        if (isEmpty()) {
            System.out.println("A lista circular está vazia.");
            return;
        }

        Node<T> atual = head;

        for (int i = 0; i < size; i++) {
            System.out.print(atual.data + " \n");
            atual = atual.next;
        }

        System.out.println();
    }

    public DefaultListModel verElementosNoJList() {
        if (isEmpty()) {
            System.out.println("A lista circular está vazia.");
            return null;
        }

        DefaultListModel mod = new DefaultListModel();
        Node<T> atual = head;

        for (int i = 0; i < size; i++) {
            //System.out.print(atual.data + " \n");
            mod.addElement(atual.data);
            atual = atual.next;
        }

        System.out.println();
        return mod;
    }

}
