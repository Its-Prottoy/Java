package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class verifyCard extends JFrame implements MouseListener, ActionListener {

    JLabel main,body,code,imglable;
    JPanel panel;
    JPasswordField codef;
    JButton back,pay;
    Color pc,btc,btc2;
    Font f1,f2,f3;
    ImageIcon img;

    public verifyCard()
    {
      super("Card Verification");
      this.setSize(400,400);
      this.setLocationRelativeTo(null);
      this.setResizable(false);

      f1=new Font("Segoe UI",Font.BOLD,15);
      f2=new Font("Segoe UI",Font.PLAIN,16);
      f3=new Font("Segoe UI",Font.BOLD,12);

      pc=new Color(255,242,223);
      btc=new Color(61,35,20);
      //btc2=new Color(81,188,86);


      panel=new JPanel();
      panel.setLayout(null);
      panel.setBackground(getForeground());
      panel.setBackground(pc);
      this.add(panel);

      main=new JLabel("Card Verification ");
      main.setForeground(btc);
      main.setBounds(22,1,200,20);
      main.setFont(f1);
      panel.add(main);

      body=new JLabel("We have a payment request from Pet Shop .");
      body.setBounds(9,126,850,22);
      body.setForeground(btc);
      body.setFont(f2);
      panel.add(body);

      
      body=new JLabel("We send OTP to your phone for Verification .");
      body.setBounds(9,166,850,22);
      body.setForeground(btc);
      body.setFont(f2);
      panel.add(body);

      
      body=new JLabel("Please enter right OTP for Payment.");
      body.setBounds(9,206,850,22);
      body.setForeground(btc);
      body.setFont(f2);
      panel.add(body);

      code=new JLabel("Enter Your OTP");
      code.setBounds(22,240,280,40);
      code.setForeground(btc);
      code.setFont(f1);
      panel.add(code);

      codef=new JPasswordField();
      codef.setBounds(150,250,150,20);
      panel.add(codef);

      back=new JButton("Back");
     back.setBounds(22,310,70,25);
      back.setFont(f3);
     back.setBackground(btc);
      back.setForeground(Color.WHITE);
      back.addMouseListener(this);
      back.addActionListener(this);
      panel.add(back);

      pay=new JButton("Pay");
      pay.setBounds(100,310,70,25);
      pay.setForeground(Color.WHITE);
      pay.setBackground(btc);
      pay.setFont(f3);
      pay.addMouseListener(this);
      pay.addActionListener(this);
      panel.add(pay);



      img=new ImageIcon("Images/dhaka-bank-logo-C6A8C97CF8-seeklogo.com.png");
      imglable=new JLabel(img);
      imglable.setBounds(80,30,200,80);
      panel.add(imglable);



    }
 
    public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {
    if(e.getSource()==back)
    {
        back.setBackground(Color.WHITE);
        back.setForeground(btc);
    }
    else if(e.getSource()==pay)
    {
       pay.setBackground(Color.WHITE);
        pay.setForeground(btc);
    }
 }
 public void mouseExited(MouseEvent e) {

    pay.setBackground(btc);
    pay.setForeground(Color.WHITE);

    back.setBackground(btc);
    back.setForeground(Color.WHITE);
 }

 public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {
    }
    
   public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == pay){
         JOptionPane.showMessageDialog(this, "Payment successful. Your order is placed!", "Successful", JOptionPane.INFORMATION_MESSAGE);
		 PayOpt po = new PayOpt();
		this.setVisible(false);
		po.setVisible(true);
      }
      else if(ae.getSource() == back){
         PayOpt po = new PayOpt();
         this.setVisible(false);
         po.setVisible(true);
      }
   }
    
}
