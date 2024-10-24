package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cataccessories extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel name1,name2,name3,name4,name5,name6,wel;
	JButton b1,b2,b3,b4,b5,b6,back,exit;
	JLabel imglabel;
	ImageIcon img1,img2,img3,img4,img5,img6;
	Font headFont,defFont,fieldFont,btnFont;
	Color panelCol,btnCol,btnHoverCol;
	
	public cataccessories(){
		
		super("Pet Shop");
		this.setSize(900,630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
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
		panel.setBackground(panelCol);
		this.add(panel);
		
		//Heading part
		
		wel=new JLabel("CAT ACCESSORIES");
        wel.setBounds(330,0,600,95);
        wel.setForeground(btnCol);
        wel.setFont(headFont);
        panel.add(wel);
		
		//image & buttons & name & price 
		
		img1=new ImageIcon("Images/catproduct01.jpg");
		imglabel=new JLabel(img1);
		panel.add(imglabel);
		
		b1=new JButton(img1);
		b1.setBounds(90,110,150,150);
		b1.setBackground(null);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setFocusPainted(false);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		name1=new JLabel("Cat Body Belt");
        name1.setBounds(90,260,300,30);
        name1.setForeground(btnCol);
        name1.setFont(defFont);
        panel.add(name1);
		
		name1=new JLabel("Price 400 Tk");
        name1.setBounds(90,280,150,30);
        name1.setForeground(btnCol);
        name1.setFont(fieldFont);
        panel.add(name1);
		
		
		
		
		img2=new ImageIcon("Images/catplayingtoy.jpg");
		imglabel=new JLabel(img2);
		panel.add(imglabel);
		
		b2=new JButton(img2);
		b2.setBounds(370,110,150,150);
		b2.setBackground(null);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setFocusPainted(false);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		name2=new JLabel("Cat Playing Toy");
        name2.setBounds(370,260,300,30);
        name2.setForeground(btnCol);
        name2.setFont(defFont);
        panel.add(name2);
		
		name2=new JLabel("Price 460 Tk");
        name2.setBounds(370,280,110,30);
        name2.setForeground(btnCol);
        name2.setFont(fieldFont);
        panel.add(name2);
		
		
		
		
		img3=new ImageIcon("Images/catneckbelt.jpg");
		imglabel=new JLabel(img3);
		panel.add(imglabel);
		
		b3=new JButton(img3);
		b3.setBounds(650,110,150,150);
		b3.setBackground(null);
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.setFocusPainted(false);
		b3.addMouseListener(this);
		b3.addActionListener(this);
		panel.add(b3);
		
		name3=new JLabel("Cat Neck Belt");
        name3.setBounds(650,260,300,30);
        name3.setForeground(btnCol);
        name3.setFont(defFont);
        panel.add(name3);
		
		name3=new JLabel("Price 280 Tk");
        name3.setBounds(650,280,110,30);
        name3.setForeground(btnCol);
        name3.setFont(fieldFont);
        panel.add(name3);
		
		
		
		
		img4=new ImageIcon("Images/CatBag.jpg");
		imglabel=new JLabel(img4);
		panel.add(imglabel);
		
		b4=new JButton(img4);
		b4.setBounds(90,320,150,150);
		b4.setBackground(null);
		b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4.setFocusPainted(false);
		b4.addMouseListener(this);
		b4.addActionListener(this);
		panel.add(b4);
		
		name4=new JLabel("Cat Bag");
        name4.setBounds(90,470,300,30);
        name4.setForeground(btnCol);
        name4.setFont(defFont);
        panel.add(name4);
		
		name4=new JLabel("Price 900 Tk");
        name4.setBounds(90,490,140,30);
        name4.setForeground(btnCol);
        name4.setFont(fieldFont);
        panel.add(name4);
		
		
		
		
		img5=new ImageIcon("Images/MeowMixDryCatFood.jpg");
		imglabel=new JLabel(img5);
		panel.add(imglabel);
		
		b5=new JButton(img5);
		b5.setBounds(370,320,150,150);
		b5.setBackground(null);
		b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b5.setFocusPainted(false);
		b5.addMouseListener(this);
		b5.addActionListener(this);
		panel.add(b5);
		
		name5=new JLabel("Meow Mix Cat Food");
        name5.setBounds(370,470,300,30);
        name5.setForeground(btnCol);
        name5.setFont(defFont);
        panel.add(name5);
		
		name5=new JLabel("Price 700 Tk");
        name5.setBounds(370,490,150,30);
        name5.setForeground(btnCol);
        name5.setFont(fieldFont);
        panel.add(name5);
		
		
		
		
		img6=new ImageIcon("Images/CatECollarSunflower.jpg");
		imglabel=new JLabel(img6);
		panel.add(imglabel);
		
		b6=new JButton(img6);
		b6.setBounds(650,320,150,150);
		b6.setBackground(null);
		b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b6.setFocusPainted(false);
		b6.addMouseListener(this);
		b6.addActionListener(this);
		panel.add(b6);
		
		name6=new JLabel("Cat E Collar Sunflower");
        name6.setBounds(650,470,300,30);
        name6.setForeground(btnCol);
        name6.setFont(defFont);
        panel.add(name6);
		
		name6=new JLabel("Price 800 Tk");
        name6.setBounds(650,490,150,30);
        name6.setForeground(btnCol);
        name6.setFont(fieldFont);
        panel.add(name6);
		
		
		//buttons
		
		
		back=new JButton("Back");
        back.setBounds(325,540,100,30);
        back.setBackground(btnCol);
        back.setFont(btnFont);
        back.setForeground(Color.WHITE);
        back.addMouseListener(this);
        back.addActionListener(this);
        panel.add(back);
		
		
		exit=new JButton("Exit");
        exit.setBounds(465,540,100,30);
        exit.setBackground(btnCol);
        exit.setFont(btnFont);
        exit.setForeground(Color.WHITE);
        exit.addMouseListener(this);
        back.addActionListener(this);
        panel.add(exit);
	}
	
	
	
	public void mouseClicked(MouseEvent e) {}
    
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==back)
        {
            back.setBackground(btnHoverCol);
            
        }
        else if(e.getSource()==exit)
        {
            exit.setBackground(btnHoverCol);
        }
       
    }
   
    public void mouseExited(MouseEvent e) {
        back.setBackground(btnCol);
        exit.setBackground(btnCol);
       
    }
   
    public void mousePressed(MouseEvent e) {}
   
    public void mouseReleased(MouseEvent e) {}

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            CatProduct1 c1 = new CatProduct1();
            c1.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b2){
            CatProduct2 c2 = new CatProduct2();
            c2.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b3){
            CatProduct3 c3 = new CatProduct3();
            c3.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b4){
            CatProduct4 c4 = new CatProduct4();
            c4.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b5){
            CatProduct5 c5 = new CatProduct5();
            c5.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b6){
            CatProduct6 c6 = new CatProduct6();
            c6.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == back){
            PetSelect ps = new PetSelect();
            ps.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == exit){
            this.setVisible(false);
        }
    }
}