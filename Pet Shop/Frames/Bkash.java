package Frames;

import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
import java.awt.event.*;

public class Bkash extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	ImageIcon logo,pinkpic,shoplogo;
	JLabel logolabel,logoshop;
	JButton closeBt,confirmBt;
	JLabel enterV,resendC,marchant,bdt,call;
	JTextField number;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	
	public Bkash(){
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
		fieldFont = new Font("Segoe UI",Font.PLAIN,16);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		this.add(panel);
		
		logo=new ImageIcon("Images/bkashlogo.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(0,0,500,143);
		panel.add(logolabel);
		
		closeBt=new JButton("CLOSE");
		closeBt.setBounds(0,468,250,60);
		closeBt.setForeground(new Color(87,87,87));
		closeBt.setBackground(new Color(210,211,213));
		closeBt.setFont(defFont);
		closeBt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		closeBt.setFocusPainted(false);
		closeBt.addMouseListener(this);
		closeBt.addActionListener(this);
		panel.add(closeBt);
		
		confirmBt=new JButton("CONFIRM");
		confirmBt.setBounds(250,468,250,60);
		confirmBt.setForeground(new Color(87,87,87));
		confirmBt.setBackground(new Color(210,211,213));
		confirmBt.setFont(defFont);
		confirmBt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		confirmBt.setFocusPainted(false);
		confirmBt.addMouseListener(this);
		confirmBt.addActionListener(this);
		panel.add(confirmBt);
		
		number=new JTextField();
		number.setBounds(42,325,400,40);
		number.setFont(fieldFont);
		panel.add(number);
		
		marchant=new JLabel("Pet Shop Merchant");
		marchant.setBounds(60,145,400,30);
		marchant.setFont(new Font("Segoe UI",Font.PLAIN,14));
		panel.add(marchant);
		
		// bdt=new JLabel("BDT 1085");
		// bdt.setBounds(370,145,200,50);
		// bdt.setFont(new Font("Segoe UI",Font.PLAIN,22));
		// panel.add(bdt);
		
		enterV=new JLabel("Enter your Bkash account number");
		enterV.setBounds(125,290,400,30);
		enterV.setFont(fieldFont);
		enterV.setForeground(Color.WHITE);
		panel.add(enterV);
		
		resendC=new JLabel("By clicking on Confirm you are agreeing to our terms & conditions.");
		resendC.setBounds(40,380,450,30);
		resendC.setFont(new Font("Segoe UI",Font.PLAIN,14));
		resendC.setForeground(Color.WHITE);
		panel.add(resendC);
		
		call=new JLabel("CALL  16247");
		call.setBounds(165,505,300,100);
		call.setFont(new Font("Segoe UI",Font.BOLD,26));
		call.setForeground(new Color(226,17,111));
		panel.add(call);
		
		
		
		
		
		
		
		
		//Picture
		
		pinkpic=new ImageIcon("Images/pinkbackground.jpg");
		logolabel=new JLabel(pinkpic);
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
		if(me.getSource()==closeBt){
			closeBt.setBackground(new Color(163,164,166));
			closeBt.setForeground(new Color(226,17,111));
		}
		else if(me.getSource()==confirmBt){
			confirmBt.setBackground(new Color(163,164,166));
			confirmBt.setForeground(new Color(226,17,111));
		} 
	}
	public void mouseExited(MouseEvent me){if(me.getSource()==closeBt){
			closeBt.setForeground(new Color(87,87,87));
			closeBt.setBackground(new Color(210,211,213));
		}
		else if(me.getSource()==confirmBt){
			confirmBt.setBackground(new Color(210,211,213));
			confirmBt.setForeground(new Color(87,87,87));
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == confirmBt){
			String num = number.getText();
			if(num.length() < 11 || num.length() > 11){
				JOptionPane.showMessageDialog(this, "Phone number should be 11 digits!", "Invalid Phone Number", JOptionPane.WARNING_MESSAGE);
			}
			else{
				BkashVerification b = new BkashVerification();
				b.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource() == closeBt){
			PayOpt po = new PayOpt();
			this.setVisible(false);
			po.setVisible(true);
		}
	}
}