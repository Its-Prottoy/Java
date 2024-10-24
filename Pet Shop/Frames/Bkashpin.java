package Frames;

import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
import java.awt.event.*;

public class Bkashpin extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	ImageIcon logo,pink,shoplogo;
	JLabel logolabel,logoshop;
	JButton close,confirm;
	JLabel enterV,resendC,marchant,bdt,call;
	JPasswordField pin;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	
	public Bkashpin(){
		super("Bkash");
		this.setSize(500,625);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //middle point popup
		this.setResizable(false);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);

		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		fieldFont = new Font("Segoe UI",Font.BOLD,15);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		this.add(panel);
		
		logo=new ImageIcon("Images/bkash.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(0,0,500,143);
		panel.add(logolabel);
		
		close=new JButton("CLOSE");
		close.setBounds(0,468,250,60);
		close.setForeground(new Color(87,87,87));
		close.setBackground(new Color(210,211,213));
		close.setFont(defFont);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setFocusPainted(false);
		close.addMouseListener(this);
		close.addActionListener(this);
		panel.add(close);
		
		confirm=new JButton("CONFIRM");
		confirm.setBounds(250,468,250,60);
		confirm.setForeground(new Color(87,87,87));
		confirm.setBackground(new Color(210,211,213));
		confirm.setFont(defFont);
		confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		confirm.setFocusPainted(false);
		confirm.addMouseListener(this);
		confirm.addActionListener(this);
		panel.add(confirm);
		
		pin=new JPasswordField();
		pin.setBounds(42,325,400,40);
		pin.setFont(fieldFont);
		pin.setFont(new Font("Serif Bold",Font.BOLD,29));

		
		panel.add(pin);
		
		


		marchant=new JLabel("Pet Shop Merchant");
		marchant.setBounds(60,145,400,30);
		marchant.setFont(new Font("Segoe UI",Font.PLAIN,14));
		panel.add(marchant);
		
		/*
		bdt=new JLabel("BDT 1085");
		bdt.setBounds(370,145,200,50);
		bdt.setFont(new Font("Segoe UI",Font.PLAIN,22));
		panel.add(bdt);
		*/
		
		enterV=new JLabel("Enter your Bkash PIN number");
		enterV.setBounds(125,290,400,30);
		enterV.setFont(fieldFont);
		enterV.setForeground(Color.WHITE);
		panel.add(enterV);
		
		
		
		call=new JLabel("CALL  16247");
		call.setBounds(165,505,300,100);
		call.setFont(new Font("Segoe UI",Font.BOLD,26));
		call.setForeground(new Color(226,17,111));
		panel.add(call);
		
		
		
		
	
		
		pink=new ImageIcon("Images/pinkbackground.jpg");
		logolabel=new JLabel(pink);
		logolabel.setBounds(0,203,550,325);
		panel.add(logolabel);
		
		shoplogo=new ImageIcon("Images/shoplogo.jpg");
		logoshop=new JLabel(shoplogo);
		logoshop.setBounds(10,147,50,50);
		panel.add(logoshop);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==close){
			close.setBackground(new Color(163,164,166));
			close.setForeground(new Color(226,17,111));
		}
		else if(me.getSource()==confirm){
			confirm.setBackground(new Color(163,164,166));
			confirm.setForeground(new Color(226,17,111));
		} 
	}
	public void mouseExited(MouseEvent me){if(me.getSource()==close){
			close.setForeground(new Color(87,87,87));
			close.setBackground(new Color(210,211,213));
		}
		else if(me.getSource()==confirm){
			confirm.setBackground(new Color(210,211,213));
			confirm.setForeground(new Color(87,87,87));
		}
	}

	public void actionPerformed(ActionEvent ae){
		char[] ch = pin.getPassword();
        int len = ch.length;

        if(ae.getSource() == confirm){
            if(len > 5 || len < 3){
              JOptionPane.showMessageDialog(this, "Bkash PIN should be 5 digits!", "Invalid PIN", JOptionPane.WARNING_MESSAGE);
            }
            else{
				JOptionPane.showMessageDialog(this, "Payment successful. Your order is placed!", "Successful", JOptionPane.INFORMATION_MESSAGE);
				
				PayOpt po = new PayOpt();
				this.setVisible(false);
				po.setVisible(true);
            }
        }
		else if(ae.getSource() == close){
			PayOpt po = new PayOpt();
			this.setVisible(false);
			po.setVisible(true);
		 }
	}
}