package controller;

import java.util.LinkedList;

public class Pilha<T> {
	private LinkedList<T> elementos;

	public Pilha() {
		elementos = new LinkedList<>();
	}

	public void push(T elemento) {
		elementos.addFirst(elemento);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("A pilha está vazia.");
		}
		return elementos.removeFirst();
	}

	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	public int size() {
		return elementos.size();
	}

}
