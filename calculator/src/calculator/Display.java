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
	
	JPanel numberPanel;
	
	
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
//		this.setLayout(new GridLayout(5, 7, 5, 5));
		
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
		
		bRad.addActionListener(this);
		bDeg.addActionListener(this); 	
		bFact.addActionListener(this); 	
		bOpen.addActionListener(this); 	
		bClose.addActionListener(this); 	
		bParen.addActionListener(this); 	
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
		
		numberPanel = new JPanel(new GridLayout(4, 3));
		
		numberPanel.add(b7);		
		numberPanel.add(b8);		
		numberPanel.add(b9);	
		
		numberPanel.add(b4);		
		numberPanel.add(b5);		
		numberPanel.add(b6);		
		
		numberPanel.add(b1);		
		numberPanel.add(b2);		
		numberPanel.add(b3);	
		
		numberPanel.add(b0);	
		numberPanel.add(bDot);	
		numberPanel.add(bEquals);
		
//		.add(bPlus);	
//		.add(bDiv);
//		.add(bTimes);	
//		.add(bMinus); 
		
//		this.add(bRad); 	
//		this.add(bDeg); 	
//		this.add(bFact); 	
//		this.add(bOpen); 	
//		this.add(bClose); 	
//		this.add(bParen); 	
//		this.add(bCe); 	
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
		this.add(numberPanel);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b7) {
			System.out.println(7);
		}
	}
}
