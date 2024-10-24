package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PetSelect extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel Label,catL,dogL,imgL;
	ImageIcon img,img1;
	JButton catBtn,dogBtn,exit,back;
	Color panelCol,btnCol,hovCol,clr;
	Font headFont,defFont,btnFont;
	
	PetSelect()
	{
		super("Pet Selection");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		hovCol = new Color(241,146,26);
		
		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);
		
		Label = new JLabel("SELECT YOUR PET");
		Label.setBounds(165,30,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		
		img = new ImageIcon("Images/PS.png");
		imgL = new JLabel(img);
		imgL.setBounds(125,100,150,150);
		panel.add(imgL);
		
		img1 = new ImageIcon("Images/PSPIC1.png");
		imgL = new JLabel(img1);
		imgL.setBounds(325,100,150,150);
		panel.add(imgL);
		
		catBtn = new JButton(img);
		catBtn.setBounds(125,100,150,150);
		catBtn.setBackground(null);
		catBtn.addMouseListener(this);
		catBtn.addActionListener(this);
		panel.add(catBtn);
		
		dogBtn = new JButton(img1);
		dogBtn.setBounds(325,100,150,150);
		dogBtn.setBackground(null);
		dogBtn.addMouseListener(this);
		dogBtn.addActionListener(this);
		panel.add(dogBtn);
		
		catL = new JLabel("Cat");
		catL.setBounds(188,260,100,25);
		catL.setFont(defFont);
		panel.add(catL);
		
		dogL = new JLabel("Dog");
		dogL.setBounds(386,260,100,25);
		dogL.setFont(defFont);
		panel.add(dogL);
		
		clr = new Color(217,83,79);
		
		exit = new JButton("Exit");
		exit.setBounds(165,310,110,35);
		exit.setForeground(Color.WHITE);
		exit.setBackground(clr);
		exit.setFont(btnFont);
		exit.addActionListener(this);
		panel.add(exit);
		
		back = new JButton("Back");
		back.setBounds(330,310,110,35);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.addActionListener(this);
		panel.add(back);	
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==catBtn)
		{
			catBtn.setBackground(hovCol);
			catBtn.setForeground(Color.WHITE);
			
		}
		else if(me.getSource()==dogBtn)
		{
			dogBtn.setBackground(hovCol);
			dogBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==exit)
		{
			exit.setBackground(Color.WHITE);
			exit.setForeground(clr);
		}
		else if(me.getSource()==back)
		{
			dogBtn.setBackground(hovCol);
			dogBtn.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==catBtn)
		{
			catBtn.setBackground(btnCol);
			catBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==dogBtn)
		{
			dogBtn.setBackground(btnCol);
			dogBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==exit)
		{
			exit.setBackground(clr);
			exit.setForeground(Color.WHITE);
		}
		else if(me.getSource()==back)
		{
			dogBtn.setBackground(btnCol);
			dogBtn.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
		
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==catBtn){
			cataccessories A1=new cataccessories();
			this.setVisible(false);
			A1.setVisible(true);
		}
		else if(ae.getSource()==dogBtn){
			dogaccessories A2=new dogaccessories();
			A2.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==exit){
			this.setVisible(false);
		}
		else if(ae.getSource()==back){
			GetStarted B1=new GetStarted();
			B1.setVisible(true);
			this.setVisible(false);
		}
	}
}