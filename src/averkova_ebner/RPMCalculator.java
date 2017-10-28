package averkova_ebner;

import java.util.LinkedList;

import assignment3_int.Calculator;

public class RPMCalculator implements Calculator {

	private Stack<Double> myStack;

	public static void main(String[] args) {
		Calculator arrayCalculator = new RPMCalculator(new ArrayStack<Double>(7));
		Calculator linkedListCalculator = new RPMCalculator(new LinkedListStack<Double>());
		
		String[] input = {"1.5", "2", "+", "3", "4", "-", "*"};
		
		System.out.println("array result: " + arrayCalculator.calc(input));
		System.out.println("linked list result: " + linkedListCalculator.calc(input));
	
	}

	public RPMCalculator(Stack<Double> stack) {
		myStack = stack;
	}

	@Override
	public double calc(String[] input) {
		for (String statement : input) {
			parseInput(statement);
		}

		return myStack.pop();
	}

	private void parseInput(String s) {
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			myStack.push(Double.parseDouble(s));
		} else {
			Double firstNumber = myStack.pop();
			Double secondNumber = myStack.pop();
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
