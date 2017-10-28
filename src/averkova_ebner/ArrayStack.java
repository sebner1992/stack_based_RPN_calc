package averkova_ebner;

public class ArrayStack<E> implements Stack<E> 
{
	private E[] array;
	private int counter;
	
	public ArrayStack (int size)
	{
		array = (E[]) new Object [size];
	}
	
	@Override
	public boolean empty() 
	{
		return array == null;
	}
	
	@Override
	public void push(E item) 
	{
		array[counter] = item;
		counter ++;
	}
	
	@Override
	public E pop() 
	{
		counter--;
		E output = array[0];
		
		for(int i = 0; i < array.length - 1; i++)
		{
			array[i] = array[i + 1];
		}
		
		return output;
	}
}
