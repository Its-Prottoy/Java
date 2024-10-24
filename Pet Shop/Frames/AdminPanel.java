package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel label;
	JLabel admin;
	ImageIcon logo;
	JLabel logolabel;
	JButton userdata;
	JButton cngpass;
	JButton exit;
	JButton back;
	Color panelCol, btnHoverCol, btnCol, exitCol, colour;
	Font headFont, defFont, btnFont, myfont;
	
	public AdminPanel(){
		super("Admin Panel");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

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
		
		logo=new ImageIcon("Images/adminpanellogo.png");
		logolabel=new JLabel(logo);
		logolabel.setBounds(550,0,300,300);
		panel.add(logolabel);
		
		admin=new JLabel("Admin Panel");
		admin.setBounds(100,120,600,100);
		myfont=new Font("Calibri",Font.BOLD,70);
		admin.setFont(myfont);
		admin.setForeground(btnCol);
		panel.add(admin);
		
		userdata=new JButton("User Data");
		userdata.setBounds(170,350,260,50);
		userdata.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		userdata.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		userdata.setFont(myfont);
		userdata.addMouseListener(this);
		userdata.addActionListener(this);
		userdata.setCursor(new Cursor(Cursor.HAND_CURSOR));
		userdata.setFocusPainted(false);
		panel.add(userdata);
		
		cngpass=new JButton("Change Admin Password");
		cngpass.setBounds(450,350,260,50);
		cngpass.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		cngpass.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		cngpass.setFont(myfont);
		cngpass.addMouseListener(this);
		cngpass.addActionListener(this);
		cngpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cngpass.setFocusPainted(false);
		panel.add(cngpass);
		
		exit=new JButton("Exit");
		exit.setBounds(170,420,260,50); //(450,450,260,30);
		exit.setForeground(Color.BLACK);
		colour=new Color(252, 232, 207);
		exit.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		exit.setFont(myfont);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		panel.add(exit);
		
		back=new JButton("Back");
		back.setBounds(450,420,260,50); //(450,450,260,30);
		back.setForeground(Color.BLACK);
		colour=new Color(252, 232, 207);
		back.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		back.setFont(myfont);
		back.addMouseListener(this);
		back.addActionListener(this);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFocusPainted(false);
		panel.add(back);		
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me){
		if(me.getSource() == userdata){
			userdata.setBackground(btnCol);
			userdata.setForeground(Color.WHITE);
		}
		else if(me.getSource() == cngpass){
			cngpass.setBackground(btnCol);
			cngpass.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(new Color(217,83,79));
			exit.setForeground(Color.WHITE);
		}
		else if(me.getSource() == back){
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == userdata){
			userdata.setBackground(btnHoverCol);
			userdata.setForeground(Color.WHITE);
		}
		else if(me.getSource() == cngpass){
			cngpass.setBackground(btnHoverCol);
			cngpass.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(new Color(252, 232, 207));
			exit.setForeground(Color.BLACK);
		}
		else if(me.getSource() == back){
			back.setBackground(new Color(252, 232, 207));
			back.setForeground(Color.BLACK);
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == userdata){
			UserData ud = new UserData();
			ud.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == cngpass){
			chngAdmin cngAd = new chngAdmin();
			cngAd.setVisible(true);
		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
		else if(ae.getSource() == back){
			GetStarted gs = new GetStarted();
			gs.setVisible(true);
			this.setVisible(false);
		}
	}
}