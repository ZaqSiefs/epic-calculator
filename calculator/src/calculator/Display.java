package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
	JButton bRad;
	JButton bDeg;
	JButton bFact;
	JButton bOpen;
	JButton bClose;
	JButton bParen;
	JButton bCe;
	
	JButton bInv;
	JButton bSin;
	JButton bLn;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton bDiv;
	
	JButton bPi;
	JButton bCos;
	JButton bLog;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton bTimes;
	
	JButton bE;
	JButton bTan;
	JButton bSqrt;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton bMinus;
	
	JButton bAns;
	JButton bExp;
	JButton bPwr;
	JButton b0;
	JButton bDot;
	JButton bEquals;
	JButton bPlus;
	
	
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
		this.setLayout(new GridLayout(5, 7, 5, 5));
		
		//=======================================================
		bRad 	= new JButton("Rad");
		bDeg 	= new JButton("Deg");
		bFact 	= new JButton("x!");
		bOpen 	= new JButton("(");
		bClose 	= new JButton(")");
		bParen 	= new JButton("%");
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
		
		this.add(bRad); 	
		this.add(bDeg); 	
		this.add(bFact); 	
		this.add(bOpen); 	
		this.add(bClose); 	
		this.add(bParen); 	
		this.add(bCe); 	
     
		this.add(bInv); 	
		this.add(bSin); 	
		this.add(bLn);		
		this.add(b7);		
		this.add(b8);		
		this.add(b9);	
		this.add(bDiv);
  
		this.add(bPi);		
		this.add(bCos);	
		this.add(bLog);	
		this.add(b4);		
		this.add(b5);		
		this.add(b6);		
		this.add(bTimes);	
  
		this.add(bE);		
		this.add(bTan);	
		this.add(bSqrt);	
		this.add(b1);		
		this.add(b2);		
		this.add(b3);		
		this.add(bMinus); 	
    
		this.add(bAns);	
		this.add(bExp);	
		this.add(bPwr);	
		this.add(b0);		
		this.add(bDot);	
		this.add(bEquals); 
		this.add(bPlus);	
		
		//=======================================================
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
