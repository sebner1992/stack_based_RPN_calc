package averkova_ebner;

public class LinkedListStack<E> implements Stack<E> {
	private Node<E> first;

	@Override
	public boolean empty() {
		return first == null;
	}

	@Override
	public void push(E item) {
		if(empty())
		{
			first = new Node<>(item);
		}
		else
		{
			Node<E> next = first;
			first = new Node<> (item);
			first.next = next;
		}
	}

	@Override
	public E pop() {
		if (!empty()) {
			Node<E> item = first;
			first = first.next;
			return (E) item.data;
		} else {
			throw new RuntimeException("Don't use the 'pop' operator on an empty stack!");
		}
	}

}
