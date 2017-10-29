package averkova_ebner;

import java.util.LinkedList;

import assignment3_int.Calculator;

public class RPMCalculator implements Calculator {

	private static Stack<Double> myStack;

	public static void main(String[] args) {
		Calculator arrayCalculator = new RPMCalculator(new ArrayStack<Double>(args.length));
		Calculator linkedListCalculator = new RPMCalculator(new LinkedListStack<Double>());

		System.out.println("array result: " + arrayCalculator.calc(args));
		System.out.println("linked list result: " + linkedListCalculator.calc(args));
	}

	public RPMCalculator(Stack<Double> stack) {
		myStack = stack;
	}

	@Override
	public double calc(String[] input) {
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				parseInput(input[i]);
			}

			return myStack.pop();
		} else {
			throw new RuntimeException("Empty input!");
		}
	}

	private void parseInput(String s) {
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			myStack.push(Double.parseDouble(s));
		} else {
			Double secondNumber = myStack.pop();
			Double firstNumber = myStack.pop();
			Double result;

			switch (s) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "/":
				result = firstNumber / secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			default:
				throw new RuntimeException("Unknown operator: " + s);
			}

			myStack.push(result);
		}
	}

}
