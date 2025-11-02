package calculator;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {
	private static BigDecimal state = new BigDecimal("0");
	
	Calculator() {}

	public static void parse(StringBuilder command) {
		// TODO parse the command
		if (command.length() == 0) {
			Calculator.setState(new BigDecimal("0"));
			return;
		}
		
		if (!validParentheses(command)) {
			return;
		}
		System.out.println("Valid Parentheses");
		
		while (!command.toString().isBlank()) {
			if (command.charAt(0) <= 57 && command.charAt(0) >= 48) {
				int length = 0;
				while(command.toString().length() > length && command.charAt(length) <= 57 && command.charAt(length) >= 48) {
					length++;
					}
				
				Calculator.setState(new BigDecimal(command.substring(0, length)));
				command.delete(0, length + 1);
			}
		}
	}
	
	private static void setState(BigDecimal state) {
		Calculator.state = state;
	}

	private static boolean validParentheses(StringBuilder command) {
		// TODO Auto-generated method stub
		if (command.length() == 0) {
			return true;
		}
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : command.toString().toCharArray()) {
			if (!(c == '(') && !(c == ')')) {
				continue;
			}
			else if (c == '(') {
				stack.add(c);
			}
			else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		return true;
	}

	private static void updateState() {
		// TODO update state
		
	}

	public static String getState() {

		return Calculator.state.toString();
	}

}
