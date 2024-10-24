package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import Classes.*;

public class PetShop extends JFrame implements MouseListener, ActionListener {
	JPanel panel;
	JPanel label;
	JLabel wlc;
	ImageIcon logo, icon;
	JLabel logolabel;
	JButton exit;
	JButton cont;
	JButton next;
	Color panelCol, btnHoverCol, btnCol, exitCol;
	Font headFont, defFont, btnFont;
	
	public PetShop(){
		super("Get Started");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
		exitCol = new Color(217,83,79);

		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,16);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);
		
		icon = new ImageIcon(getClass().getResource("/Images/petshoplogo.jpg"));
		this.setIconImage(icon.getImage());
		
		logo=new ImageIcon("Images/petshoplogo.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(215,0,450,300);
		panel.add(logolabel);
		
		wlc=new JLabel("Welcome to Pet Shop!");
		wlc.setBounds(335,300,300,30);
		wlc.setFont(defFont);
		panel.add(wlc);
		
		next=new JButton("Get Started");
		next.setBounds(225,375,450,30);
		next.setForeground(Color.WHITE);
		next.setBackground(btnCol);
		next.setFont(btnFont);
		next.addMouseListener(this);
		next.addActionListener(this);
		next.setCursor(new Cursor(Cursor.HAND_CURSOR));
		next.setFocusPainted(false);
		panel.add(next);
		
		cont=new JButton("Contribution");
		cont.setBounds(225,420,450,30);
		cont.setForeground(Color.WHITE);
		cont.setBackground(btnCol);
		cont.setFont(btnFont);
		cont.addMouseListener(this);
		cont.addActionListener(this);
		cont.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cont.setFocusPainted(false);
		panel.add(cont);
		
		exit=new JButton("Exit");
		exit.setBounds(225,465,450,30);
		exit.setForeground(Color.WHITE);
		exit.setBackground(exitCol);
		exit.setFont(btnFont);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		panel.add(exit);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me){
		if(me.getSource() == next){
			next.setBackground(btnHoverCol);
			next.setForeground(Color.WHITE);
		}
		else if(me.getSource() == cont){
			cont.setBackground(btnHoverCol);
			cont.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(Color.WHITE);
			exit.setForeground(new Color(217,83,79));
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == next){
			next.setBackground(btnCol);
			next.setForeground(Color.WHITE);
		}
		else if(me.getSource() == cont){
			cont.setBackground(btnCol);
			cont.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(exitCol);
			exit.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == next){
			GetStarted login = new GetStarted();
			login.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == cont){
			contribution login = new contribution();
			login.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
	}
}