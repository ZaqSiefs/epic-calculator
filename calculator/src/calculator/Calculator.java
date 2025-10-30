package calculator;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {
	BigDecimal state;
	
	Calculator() {
		this.state = new BigDecimal("0");
	}

	public static void parse(StringBuilder command) {
		// TODO parse the command
		
		if (!validParentheses(command)) {
			return;
		}
		System.out.println("Valid Parentheses");
		
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

}
