package Frames;

import java.lang.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PayOpt extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel Label,cardL,bkashL,nagadL,imgL;
	ImageIcon img,img1,img2;
	JButton card,bkash,nagad,exit,back;
	Color panelCol,btnCol,hovCol,clr;
	Font headFont,defFont,btnFont;
	
	public PayOpt()
	{
		super("Payment Option");
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
		
		Label = new JLabel("SELECT PAYMENT METHOD");
		Label.setBounds(90,30,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		
		img = new ImageIcon("Images/card.png");
		
		img1 = new ImageIcon("Images/bkash.png");
		
		
		img2 = new ImageIcon("Images/nagad1.png");
		
		
		card = new JButton(img);
		card.setBounds(90,100,120,113);
		card.setBackground(null);
		card.addMouseListener(this);
		card.addActionListener(this);
		panel.add(card);
		
		bkash = new JButton(img1);
		bkash.setBounds(237,100,120,113);
		bkash.setBackground(null);
		bkash.addMouseListener(this);
		bkash.addActionListener(this);
		panel.add(bkash);
		
		nagad = new JButton(img2);
		nagad.setBounds(380,100,120,113);
		nagad.setBackground(null);
		nagad.addMouseListener(this);
		nagad.addActionListener(this);
		panel.add(nagad);
		
		cardL = new JLabel("Card");
		cardL.setBounds(125,220,100,25);
		cardL.setFont(defFont);
		panel.add(cardL);
		
		bkashL = new JLabel("Bkash");
		bkashL.setBounds(275,220,100,25);
		bkashL.setFont(defFont);
		panel.add(bkashL);
		
		nagadL = new JLabel("Nagad");
		nagadL.setBounds(415,220,100,25);
		nagadL.setFont(defFont);
		panel.add(nagadL);
		
		clr = new Color(217,83,79);
		
		exit = new JButton("Exit");
		exit.setBounds(155,280,110,35);
		exit.setForeground(Color.WHITE);
		exit.setBackground(clr);
		exit.setFont(btnFont);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		back = new JButton("Back");
		back.setBounds(325,280,110,35);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);

		
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		
	    if(me.getSource()==exit)
		{
			exit.setBackground(Color.WHITE);
			exit.setForeground(clr);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(hovCol);
			back.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		
	    if(me.getSource()==exit)
		{
			exit.setBackground(clr);
			exit.setForeground(Color.WHITE);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
		
	    public void actionPerformed(ActionEvent ae)
	    {
		  if(ae.getSource()==back)
		  {
			PetSelect ps = new PetSelect();
			ps.setVisible(true);
			this.setVisible(false);
		  }
		  else if(ae.getSource() == card){
				card c = new card();
				c.setVisible(true);
				this.setVisible(false);
		  }
		  else if(ae.getSource() == bkash){
			Bkash c = new Bkash();
			c.setVisible(true);
			this.setVisible(false);
	  		}
			else if(ae.getSource() == nagad){
				JOptionPane.showMessageDialog(this, "Not available right now", "Not Available", JOptionPane.INFORMATION_MESSAGE);
			}
	    }
		
	
	
}	
	
	
