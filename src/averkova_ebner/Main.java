package averkova_ebner;

public class Main {

	public static void main(String[] args) {
		ArrayStack<String> intArrayStack = new ArrayStack<>(10);
		
		intArrayStack.push("first");
		intArrayStack.push("second");
		intArrayStack.push("third");
		
		System.out.println("-------------ARRAY-----------");
		System.out.println(intArrayStack.pop());
		System.out.println(intArrayStack.pop());
		System.out.println(intArrayStack.pop());
		
		LinkedListStack<String> stringLinkedListStack = new LinkedListStack<>();
		
		stringLinkedListStack.push("first");
		stringLinkedListStack.push("second");
		stringLinkedListStack.push("third");
		
		System.out.println("------------LINKED LIST------------");
		System.out.println(stringLinkedListStack.pop());
		System.out.println(stringLinkedListStack.pop());
		System.out.println(stringLinkedListStack.pop());
	}

}
