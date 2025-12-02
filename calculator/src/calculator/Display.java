package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public final class Display extends JFrame{
	/**
	 * This really doesn't matter for this project
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Associated Calculator object for this display
	 */
	private static final Calculator calculator = new Calculator();;
	
	/**
	 * Buttons for the calculator.
	 * "B" prefix stands for "Button" and helps me find the buttons in auto-fill.
	 */
	final private static JButton B_RAD     = new JButton("Rad");
	final private static JButton B_DEG     = new JButton("Deg");
	final private static JButton B_FACT    = new JButton("x!");
	final private static JButton B_OPEN    = new JButton("(");
	final private static JButton B_CLOSE   = new JButton(")");
	final private static JButton B_PERCENT = new JButton("%");
	final private static JButton B_CE      = new JButton("CE");
                                                             
	final private static JButton B_INV     = new JButton("Inv");
	final private static JButton B_SIN     = new JButton("sin");
	final private static JButton B_LN      = new JButton("ln");
	final private static JButton B_7       = new JButton("7");
	final private static JButton B_8       = new JButton("8");
	final private static JButton B_9       = new JButton("9");
	final private static JButton B_DIV     = new JButton("/");
                                                             
	final private static JButton B_PI      = new JButton("pi");
	final private static JButton B_COS     = new JButton("cos");
	final private static JButton B_LOG     = new JButton("log");
	final private static JButton B_4       = new JButton("4");
	final private static JButton B_5       = new JButton("5");
	final private static JButton B_6       = new JButton("6");
	final private static JButton B_TIMES   = new JButton("x");
                                                             
	final private static JButton B_E       = new JButton("e");
	final private static JButton B_TAN     = new JButton("tan");
	final private static JButton B_SQRT    = new JButton("sqrt");
	final private static JButton B_1       = new JButton("1");
	final private static JButton B_2       = new JButton("2");
	final private static JButton B_3       = new JButton("3");
	final private static JButton B_MINUS   = new JButton("-");
                                                             
	final private static JButton B_ANS     = new JButton("Ans");
	final private static JButton B_EXP     = new JButton("EXP");
	final private static JButton B_PWR     = new JButton("pwr");
	final private static JButton B_0       = new JButton("0");
	final private static JButton B_DOT     = new JButton(".");
	final private static JButton B_EQ  	   = new JButton("=");
	final private static JButton B_PLUS    = new JButton("+");
	
	/**
	 * Lists of buttons for easier data access.
	 * LEFT_BUTTONS holds all buttons in the left display column, from left-right, top-down.
	 * CENTER_BUTTONS holds all buttons in the center display column, from left-right, top-down.
	 * RIGHT_BUTTONS holds all buttons in the right display column, from left-right, top-down.
	 */
	final private static List<JButton> LEFT_BUTTONS = List.of(
			B_RAD, B_DEG, B_FACT, B_INV, B_SIN, B_LN, B_PI, 
			B_COS, B_LOG, B_E, B_TAN, B_SQRT, B_ANS, B_EXP, B_PWR
		);
	
	final private static List<JButton> CENTER_BUTTONS = List.of(
			B_OPEN, B_CLOSE, B_PERCENT, B_7, B_8, B_9, B_4, 
			B_5, B_6, B_1, B_2, B_3, B_0, B_DOT, B_EQ
		);
	
	final private static List<JButton> RIGHT_BUTTONS = List.of(
			B_CE, B_DIV, B_TIMES, B_MINUS, B_PLUS
		);
	
	final private static List<List<JButton>> BUTTONS = List.of(
			LEFT_BUTTONS, CENTER_BUTTONS, RIGHT_BUTTONS
		);
	
	/**
	 * Divisions of the JFrame for the Display.
	 * SCREEN is where the visual feedback about the state of the calculator will be located
	 * LEFT_COLUMN is where all of the LEFT_BUTTONS will be located
	 * CENTER_COLUMN is where all of the CENTER_BUTTONS will be located
	 * RIGHT_COLUMN is where all of the RIGHT_BUTTONS will be located
	 */
	final private static JLabel SCREEN = new JLabel("0", SwingConstants.RIGHT);
	final private static JPanel LEFT_COLUMN = new JPanel(new GridLayout(5, 3, 1, 1));
	final private static JPanel CENTER_COLUMN = new JPanel(new GridLayout(5, 3, 1, 1));
	final private static JPanel RIGHT_COLUMN = new JPanel(new GridLayout(5, 1, 1, 1));                                                                             
	
	
	/**
	 * Border coordinates for the JFrame Display components. Yes I know the naming could be more clear. Deal with it
	 * SCALE_DISPLAY scales each component to make resizing easier. 
	 * 
	 * ABBREVIATIONS:
	 * T = top, L = left, R = right, B = bottom
	 * B = border                              
	 * Eg. TB = Top Border                     
	 */
	final private static int SCALE_DISPLAY = 2;

	final private static int SCREEN_LB = SCALE_DISPLAY * 0;
	final private static int SCREEN_TB = SCALE_DISPLAY * 0;
	final private static int SCREEN_RB = SCALE_DISPLAY * 392; 
	final private static int SCREEN_BB = SCALE_DISPLAY * 80;

	final private static int LEFT_LB = SCALE_DISPLAY * 0;
	final private static int LEFT_TB = SCALE_DISPLAY * 81;
	final private static int LEFT_RB = SCALE_DISPLAY * 170;
	final private static int LEFT_BB = SCALE_DISPLAY * 250;
	       
	final private static int CENT_LB = SCALE_DISPLAY * 171;
	final private static int CENT_TB = SCALE_DISPLAY * 81;
	final private static int CENT_RB = SCALE_DISPLAY * 170;
	final private static int CENT_BB = SCALE_DISPLAY * 250;
	 
	final private static int RIGHT_LB = SCALE_DISPLAY * 342;
	final private static int RIGHT_TB = SCALE_DISPLAY * 81;
	final private static int RIGHT_RB = SCALE_DISPLAY * 50;
	final private static int RIGHT_BB = SCALE_DISPLAY * 250;
	
	/**
	 * Font.  What else did you think it was?
	 */
	final private static Font FONT = new Font("Aster", Font.PLAIN, 25);
	
	Display() {
        //=======================================================
		// Set the JFrame attributes
		//=======================================================
        
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 700));
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		//=======================================================
		// set screen attributes
		//=======================================================

		SCREEN.setVerticalAlignment(SwingConstants.BOTTOM);
		SCREEN.setFont(new Font("Aster", Font.PLAIN, 100));
		SCREEN.setForeground(new Color(0xFFFFFF));
		SCREEN.setBackground(Color.BLACK);
		SCREEN.setOpaque(true);
		
		//=======================================================
		// Set the button attributes
		//=======================================================
		
		for (List<JButton> buttons : BUTTONS) {
			for (JButton button : buttons) {
				button.addActionListener(Display.calculator);
				button.setFont(Display.FONT);
				button.setFocusPainted(false);
			}
		}
		
		//=======================================================
		// Add JButtons to the JFrame divisions
		//=======================================================
		
		for (JButton button : CENTER_BUTTONS) {
			CENTER_COLUMN.add(button);
		}
		
		for (JButton button : RIGHT_BUTTONS) {
			RIGHT_COLUMN.add(button);
		}
		
		for (JButton button : LEFT_BUTTONS) {
			LEFT_COLUMN.add(button);
		}
		
		
		//=======================================================
		// Set bounds for the JFrame divisions
		//=======================================================
		
		SCREEN.setBounds(SCREEN_LB, SCREEN_TB, SCREEN_RB, SCREEN_BB);
		LEFT_COLUMN.setBounds(LEFT_LB, LEFT_TB, LEFT_RB, LEFT_BB);
		CENTER_COLUMN.setBounds(CENT_LB, CENT_TB, CENT_RB, CENT_BB);
		RIGHT_COLUMN.setBounds(RIGHT_LB, RIGHT_TB, RIGHT_RB, RIGHT_BB);
		
		//=======================================================
		// Add all elements to the JFrame
		//=======================================================
		this.add(SCREEN);
		this.add(LEFT_COLUMN);
		this.add(CENTER_COLUMN);
		this.add(RIGHT_COLUMN);
		this.pack();
		
		//=======================================================
		// Make is all appear, baby
		//=======================================================

		this.setVisible(true);
	}
	
	/**
	 * Getter for SCREEN
	 * @return SCREEN object
	 */
	public static JLabel getScreen() {
		return Display.SCREEN;
	}
	
	public static void setScreen(String content) {
		SCREEN.setText(content);
		SCREEN.repaint();
	}
}
