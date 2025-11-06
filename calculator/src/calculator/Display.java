package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class Display extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static final int TOTAL_BUTTONS = 35;
	
	// Prefix "b" means "button"
	final JButton bRad;
	final JButton bDeg;
	final JButton bFact;
	final JButton bOpen;
	final JButton bClose;
	final JButton bPercent;
	final JButton bCe;

	final JButton bInv;
	final JButton bSin;
	final JButton bLn;
	final JButton b7;
	final JButton b8;
	final JButton b9;
	final JButton bDiv;

	final JButton bPi;
	final JButton bCos;
	final JButton bLog;
	final JButton b4;
	final JButton b5;
	final JButton b6;
	final JButton bTimes;

	final JButton bE;
	final JButton bTan;
	final JButton bSqrt;
	final JButton b1;
	final JButton b2;
	final JButton b3;
	final JButton bMinus;

	final JButton bAns;
	final JButton bExp;
	final JButton bPwr;
	final JButton b0;
	final JButton bDot;
	final JButton bEquals;
	final JButton bPlus;
	
	final Font buttonFont = new Font("Aster", Font.PLAIN, 25);
	
	JLabel screen;
	Border screenBorder;
	
	JPanel leftColumn;
	JPanel centerColumn;
	JPanel rightColumn;
	JPanel topRow;
	
	StringBuilder command = new StringBuilder();
	
	
	
	Display() {
		
        // Here you can select the selected theme class name in JTatt
        try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //=======================================================
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 700));
		this.setLayout(null);
		this.setResizable(false);
		
		//=======================================================
		bRad 	= new JButton("Rad");
		bDeg 	= new JButton("Deg");
		bFact 	= new JButton("x!");
		bOpen 	= new JButton("(");
		bClose 	= new JButton(")");
		bPercent= new JButton("%");
		bCe 	= new JButton("CE");
		
		bInv 	= new JButton("Inv");
		bSin 	= new JButton("sin");
		bLn		= new JButton("ln");
		b7		= new JButton("7");
		b8		= new JButton("8");
		b9		= new JButton("9");
		bDiv	= new JButton("/");
		
		bPi		= new JButton("pi");
		bCos	= new JButton("cos");
		bLog	= new JButton("log");
		b4		= new JButton("4");
		b5		= new JButton("5");
		b6		= new JButton("6");
		bTimes	= new JButton("x");
		
		bE		= new JButton("e");
		bTan	= new JButton("tan");
		bSqrt	= new JButton("sqrt");
		b1		= new JButton("1");
		b2		= new JButton("2");
		b3		= new JButton("3");
		bMinus 	= new JButton("-");
		
		bAns	= new JButton("Ans");
		bExp	= new JButton("EXP");
		bPwr	= new JButton("pwr");
		b0		= new JButton("0");
		bDot	= new JButton(".");
		bEquals = new JButton("=");
		bPlus 	= new JButton("+");
		
		//=======================================================
		
		bRad.addActionListener(this);
		bDeg.addActionListener(this); 	
		bFact.addActionListener(this); 	
		bOpen.addActionListener(this); 	
		bClose.addActionListener(this); 	
		bPercent.addActionListener(this); 	
		bCe.addActionListener(this); 	
		bInv.addActionListener(this); 	
		bSin.addActionListener(this); 	
		bLn.addActionListener(this);		
		b7.addActionListener(this);		
		b8.addActionListener(this);		
		b9.addActionListener(this);		
		bDiv.addActionListener(this);	
		bPi.addActionListener(this);		
		bCos.addActionListener(this);	
		bLog.addActionListener(this);	
		b4.addActionListener(this);		
		b5.addActionListener(this);		
		b6.addActionListener(this);		
		bTimes.addActionListener(this);	
		bE.addActionListener(this);		
		bTan.addActionListener(this);	
		bSqrt.addActionListener(this);	
		b1.addActionListener(this);		
		b2.addActionListener(this);		
		b3.addActionListener(this);		
		bMinus.addActionListener(this); 	
		bAns.addActionListener(this);	
		bExp.addActionListener(this);	
		bPwr.addActionListener(this);	
		b0.addActionListener(this);		
		bDot.addActionListener(this);	
		bEquals.addActionListener(this); 
		bPlus.addActionListener(this); 	
		
		bRad.setFont(buttonFont);
		bDeg.setFont(buttonFont); 	
		bFact.setFont(buttonFont); 	
		bOpen.setFont(buttonFont); 	
		bClose.setFont(buttonFont); 	
		bPercent.setFont(buttonFont); 	
		bCe.setFont(buttonFont); 	
		bInv.setFont(buttonFont); 	
		bSin.setFont(buttonFont); 	
		bLn.setFont(buttonFont);		
		b7.setFont(buttonFont);		
		b8.setFont(buttonFont);		
		b9.setFont(buttonFont);		
		bDiv.setFont(buttonFont);	
		bPi.setFont(buttonFont);		
		bCos.setFont(buttonFont);	
		bLog.setFont(buttonFont);	
		b4.setFont(buttonFont);		
		b5.setFont(buttonFont);		
		b6.setFont(buttonFont);		
		bTimes.setFont(buttonFont);	
		bE.setFont(buttonFont);		
		bTan.setFont(buttonFont);	
		bSqrt.setFont(buttonFont);	
		b1.setFont(buttonFont);		
		b2.setFont(buttonFont);		
		b3.setFont(buttonFont);		
		bMinus.setFont(buttonFont); 	
		bAns.setFont(buttonFont);	
		bExp.setFont(buttonFont);	
		bPwr.setFont(buttonFont);	
		b0.setFont(buttonFont);		
		bDot.setFont(buttonFont);	
		bEquals.setFont(buttonFont); 
		bPlus.setFont(buttonFont); 	
		
		//=======================================================
		
		centerColumn = new JPanel(new GridLayout(4, 3, 1, 1));
		
		centerColumn.add(b7);		
		centerColumn.add(b8);		
		centerColumn.add(b9);	
		
		centerColumn.add(b4);		
		centerColumn.add(b5);		
		centerColumn.add(b6);		
		
		centerColumn.add(b1);		
		centerColumn.add(b2);		
		centerColumn.add(b3);	
		
		centerColumn.add(b0);	
		centerColumn.add(bDot);	
		centerColumn.add(bEquals);
		
		rightColumn = new JPanel(new GridLayout(5, 1, 1, 1));
		
		rightColumn.add(bCe); 	
		rightColumn.add(bDiv);
		rightColumn.add(bTimes);	
		rightColumn.add(bMinus); 
		rightColumn.add(bPlus);	
		
		topRow = new JPanel(new GridLayout(1, 3, 1, 1));
		
		topRow.add(bOpen); 	
		topRow.add(bClose); 	
		topRow.add(bPercent);
		
		leftColumn = new JPanel(new GridLayout(5, 3, 1, 1));
		
		leftColumn.add(bRad); 	
		leftColumn.add(bDeg); 	
		leftColumn.add(bFact); 	
     
		leftColumn.add(bInv); 	
		leftColumn.add(bSin); 	
		leftColumn.add(bLn);		

		leftColumn.add(bPi);		
		leftColumn.add(bCos);	
		leftColumn.add(bLog);	
        
		leftColumn.add(bE);		
		leftColumn.add(bTan);	
		leftColumn.add(bSqrt);		
        
		leftColumn.add(bAns);	
		leftColumn.add(bExp);	
		leftColumn.add(bPwr);	
		
		//=======================================================
		
		screen = new JLabel("0", SwingConstants.RIGHT);

		screen.setVerticalAlignment(SwingConstants.BOTTOM);
		screen.setFont(new Font("Aster", Font.PLAIN, 100));
		screen.setForeground(new Color(0xFFFFFF));
		screen.setBackground(Color.BLACK);
		screen.setOpaque(true);
		screen.setBorder(screenBorder);
		
		//=======================================================
		final int boundMult = 2;
		
		screen.setBounds(0, 0, 392 * boundMult, 80 * boundMult);
		leftColumn.setBounds(0, 81 * boundMult, 170 * boundMult, 250 * boundMult);
		topRow.setBounds(171 * boundMult, 81 * boundMult, 170 * boundMult, 50 * boundMult);
		centerColumn.setBounds(171 * boundMult, 132 * boundMult, 170 * boundMult, 199 * boundMult);
		rightColumn.setBounds(342 * boundMult, 81 * boundMult, 50 * boundMult, 250 * boundMult);
		
		this.add(screen);
		this.add(leftColumn);
		this.add(topRow);
		this.add(centerColumn);
		this.add(rightColumn);
		this.pack();
		
		//=======================================================

		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b0) {
			command.append("0");
		}
		else if (e.getSource() == b1) {
			command.append("1");
		}
		else if (e.getSource() == b2) {
			command.append("2");
		}
		else if (e.getSource() == b3) {
			command.append("3");
		}
		else if (e.getSource() == b4) {
			command.append("4");
		}
		else if (e.getSource() == b5) {
			command.append("5");
		}
		else if (e.getSource() == b6) {
			command.append("6");
		}
		else if (e.getSource() == b7) {
			command.append("7");
		}
		else if (e.getSource() == b8) {
			command.append("8");
		}
		else if (e.getSource() == b9) {
			command.append("9");
		}
		else if (e.getSource() == bDot) {
			if (!command.toString().contains(".")) {
				command.append(".");
			}
		}
		else if (e.getSource() == bOpen) {
			command.append("(");
		}
		else if (e.getSource() == bClose) {
			command.append(")");
		}
		else if (e.getSource() == bDiv) {
			command.append("/");
		}
		else if (e.getSource() == bTimes) {
			command.append("*");
		}
		else if (e.getSource() == bMinus) {
			command.append("-");
		}
		else if (e.getSource() == bPlus) {
			command.append("+");
		}
		else if (e.getSource() == bEquals) {
			Calculator.parse(command);
			command.setLength(0);
			screen.setText(Calculator.getState().toString());
			screen.repaint();
			return;
		}
		else if (e.getSource() == bCe) {
			command.setLength(0);
			Calculator.parse(command);
			command.append("0");
			
		}

		screen.setText(command.toString());
		screen.repaint();
		System.out.println("State:   " + Calculator.getState());
	}
	
	private static void appendCommand(char c) {
		
	}
}
