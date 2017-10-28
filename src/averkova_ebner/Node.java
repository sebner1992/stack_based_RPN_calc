package averkova_ebner;

public class Node<E> {
	Node<E> next = null;
	E data;

	Node(E item) {
		data = item;
	}
}
