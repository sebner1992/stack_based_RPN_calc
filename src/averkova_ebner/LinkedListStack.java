package averkova_ebner;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E> 
{
	private LinkedList<E> linkedList = new LinkedList<>();
	
	@Override
	public boolean empty() 
	{
		return linkedList.isEmpty();
	}

	@Override
	public void push(E item) 
	{
		linkedList.add(item);
	}

	@Override
	public E pop() 
	{
		return linkedList.removeFirst();
	}
	
}
