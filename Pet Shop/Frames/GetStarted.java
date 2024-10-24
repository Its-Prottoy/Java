package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import Classes.*;

public class GetStarted extends JFrame implements MouseListener, ActionListener
{
    JLabel  Label;
	JPanel Panel;
	ImageIcon img;
	JLabel imgLabel;
	
    JButton login;
    JButton register;
    JButton exit;
    JButton adLogin;
	
	Color panelCol, btnHoverCol, btnCol, exitCol;
	Font headFont, defFont, btnFont;
	
	public GetStarted()
	{
		super("Login");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
		exitCol = new Color(217,83,79);

		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,16);
		
		Panel = new JPanel();
		Panel.setLayout(null);
		Panel.setBackground(panelCol);
		
		img = new ImageIcon("Images/petshoplogo.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(215,0,450,300);
		Panel.add(imgLabel);
		
		Label = new JLabel("Get Started");
		Label.setBounds(390,325,300,30);
		Label.setFont(new Font("Segoe UI", Font.BOLD, 25));
		Panel.add(Label);
		
		login = new JButton("Login");
		login.setBounds(225,375,450,30);
		login.setForeground(Color.WHITE);
		login.setBackground(btnCol);
		login.setFont(btnFont);
		login.addActionListener(this);
		login.addMouseListener(this);
		login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		login.setFocusPainted(false);
		Panel.add(login);
		
		register = new JButton("Register");
		register.setBounds(225,420,450,30);
		register.setForeground(Color.WHITE);
		register.setBackground(btnCol);
		register.setFont(btnFont);
		register.addActionListener(this);
		register.addMouseListener(this);
		register.setCursor(new Cursor(Cursor.HAND_CURSOR));
		register.setFocusPainted(false);
		Panel.add(register);
		
		adLogin = new JButton("Admin Login");
		adLogin.setBounds(225,465,450,30);
		adLogin.setForeground(Color.WHITE);
		adLogin.setBackground(btnCol);
		adLogin.setFont(btnFont);
		adLogin.addActionListener(this);
		adLogin.addMouseListener(this);
		adLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adLogin.setFocusPainted(false);
		Panel.add(adLogin);
		
		exit = new JButton("Exit");
		exit.setBounds(225,505,450,30);
		exit.setForeground(Color.WHITE);
		exit.setBackground(exitCol);
		exit.setFont(btnFont);
		exit.addActionListener(this);
		exit.addMouseListener(this);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		Panel.add(exit);

		this.add(Panel);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me){
		if(me.getSource() == login){
			login.setBackground(btnHoverCol);
			login.setForeground(Color.WHITE);
		}
		else if(me.getSource() == register){
			register.setBackground(btnHoverCol);
			register.setForeground(Color.WHITE);
		}
		else if(me.getSource() == adLogin){
			adLogin.setBackground(btnHoverCol);
			adLogin.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(Color.WHITE);
			exit.setForeground(new Color(217,83,79));
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == login){
			login.setBackground(btnCol);
			login.setForeground(Color.WHITE);
		}
		else if(me.getSource() == register){
			register.setBackground(btnCol);
			register.setForeground(Color.WHITE);
		}
		else if(me.getSource() == adLogin){
			adLogin.setBackground(btnCol);
			adLogin.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(exitCol);
			exit.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == login){
			userlogin ul = new userlogin();
			ul.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == register){
			Register r = new Register();
			r.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == adLogin){
			adminlogin admin = new adminlogin();
			admin.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
	}
}