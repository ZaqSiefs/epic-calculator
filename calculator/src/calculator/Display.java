package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	JPanel centerColumn;
	JPanel rightColumn;
	
	
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
		this.setSize(1000, 500);
		this.setLayout(new GridLayout(1, 2, 1, 1));
		
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
		
		//=======================================================
		
		centerColumn = new JPanel(new GridLayout(5, 3, 1, 1));
		
		centerColumn.add(bOpen); 	
		centerColumn.add(bClose); 	
		centerColumn.add(bPercent);
		
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
		
//		this.add(bRad); 	
//		this.add(bDeg); 	
//		this.add(bFact); 	
 	

//     
//		this.add(bInv); 	
//		this.add(bSin); 	
//		this.add(bLn);		
//
//		this.add(bPi);		
//		this.add(bCos);	
//		this.add(bLog);	
//  
//		this.add(bE);		
//		this.add(bTan);	
//		this.add(bSqrt);		
//    
//		this.add(bAns);	
//		this.add(bExp);	
//		this.add(bPwr);	
	


		
		//=======================================================
		
		this.add(centerColumn);
		this.add(rightColumn);
		
		
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
			command.append("/");
		}
		else if (e.getSource() == bEquals) {
			Calculator.parse(command);
			command.setLength(0);
		}
		else if (e.getSource() == bCe) {
			command.setLength(0);
			Calculator.parse(command);
			
		}

		System.out.println("Command: " + command);
		System.out.println("State:   " + Calculator.getState());
	}
}
