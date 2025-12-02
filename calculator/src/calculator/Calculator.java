package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javax.swing.JButton;

public final class Calculator implements ActionListener{
	private static BigDecimal state = BigDecimal.ZERO;
	private static final StringBuilder COMMAND = new StringBuilder("0");
	private static final Deque<String> COMMAND_STACK = new ArrayDeque<>();
	private static int openingParenthesesPressed = 0;
	private static int closingParenthesesPressed = 0;
	
	Calculator() {}
	
	public static void updateCommand() {
		
	}

	public static void executeCommand() {
		// TODO parse the command
		if (COMMAND.length() == 0) {
			Calculator.setState(new BigDecimal("0"));
			return;
		}
		
		if (!validParentheses(COMMAND)) {
			return;
		}
		System.out.println("Valid Parentheses");
		
		while (!COMMAND.toString().isBlank()) {
			if (COMMAND.charAt(0) <= 57 && COMMAND.charAt(0) >= 48) {
				int length = 0;
				while(COMMAND.toString().length() > length && COMMAND.charAt(length) <= 57 && COMMAND.charAt(length) >= 48) {
					length++;
					}
				
				Calculator.setState(new BigDecimal(COMMAND.substring(0, length)));
				COMMAND.delete(0, length + 1);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO:
		// 1. Fetch buttonID <DONE>  
		// 2. Update screen with current state of command
		// 2.1 Ensure command is valid by running series of checks
		
		// 3. Execute command when "=" is pressed
		// 4. Update screen with result of executing the command 
		
		String buttonID = ((JButton) e.getSource()).getText();	
		
		if (buttonID == "=") {
			executeCommand();
		}
		else {
			updateCommand(buttonID);
		}
		
		Display.getScreen().repaint();
		System.out.println("State:   " + Calculator.getState());
	}
	
	private static void updateCommand(String buttonID) {
		int index = getIndex();
		switch (buttonID) {
		case "0" :
			if (COMMAND.toString() == "0")
				break;
	
		case "1":
		case "2":
		case "3": 
		case "4": 
		case "5": 
		case "6": 
		case "7": 
		case "8": 
		case "9": 
			placeDigit(buttonID, index);
			break;
			
		case "(": 
			placeParentheses(buttonID, index);
			break;
					
		case ")":
			
			if (closingParenthesesPressed < openingParenthesesPressed)
				incrementClosingParentheses(index);
			break;
			
		case "+":
		case "/": 
		case "x": 
		case "-": 
			placeOperand(buttonID, index);
			break;
			
		case "Rad": 
			break;
			
		case "Deg": 
			break;
			
		case "x!": 
			break;
		
		case "%": 
			break;
		
		case "CE": 
			break;
		
		case "Inv":
			break;
		
		case "sin": 
			break;
		
		case "ln": 
			break;
		
		case "pi": 
			break;
		
		case "cos": 
			break;
		
		case "log": 
			break;
		
		case "e": 
			break;
		
		case "tan": 
			break;
		
		case "sqrt": 
			break;
		
		case "Ans":
			break;
		
		case "EXP": 
			break;
		
		case "pwr":
			break;
		
		case ".":
			break;
		
		}
		Display.setScreen(COMMAND.toString());
		System.out.println(COMMAND);
	}

	private static void placeParentheses(String buttonID, int index) {
		// Param buttonID is unused, but I liked the consistency with the other methods
		if (COMMAND.charAt(0) == '0') 
			COMMAND.replace(0, 1, "()");
		else
			COMMAND.insert(index, "()");
		
		openingParenthesesPressed++;
	}
	
	private static void placeDigit(String buttonID, int index) {
		if (COMMAND.charAt(0) == '0')
			COMMAND.replace(0, 1, buttonID);
		else {
			if (COMMAND.length() > 1 && COMMAND.charAt(index - 1) == ')')
				buttonID = "x" + buttonID;
			COMMAND.insert(index, buttonID);
		}
	}
	
	private static void placeOperand(String buttonID, int index) {
		// This is broken
		char target = COMMAND.charAt(index);
		
		if (target == '+' ||  target == 'x' ||  target == '/') {
			COMMAND.replace(index + 1,  index + 1, buttonID);
			return;
		}
		
		COMMAND.insert(index + 1, (buttonID));
	}
	
	private static int getIndex() {
		int close = closingParenthesesPressed + 1;
		for (int i = COMMAND.length() - 1; i > 0; i--) {
			if (COMMAND.charAt(i) == ')') {
				if (close == openingParenthesesPressed) {
					return i;
				}
				
				close++;
			}
		}
		return COMMAND.length();
	}
	
	private static void incrementClosingParentheses(int index) {
		if (COMMAND.charAt(index - 1) == '(')
			return;
		closingParenthesesPressed++;
	}
	
	private static boolean multiplyParentheses(int index) {
		
		return false;
	}
	
	public static void updateScreen(String content) {
		Display.setScreen(content);
	}

}
