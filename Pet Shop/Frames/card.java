package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class card extends JFrame implements MouseListener, ActionListener{

    JLabel cname,cno,cvv,invo,exp,ptype,imgl;
    JTextField cnamef,cnof,expf;
    JPasswordField cvvf;
    JButton back,next;
    JPanel panel;
    Color c1,c2;
    Font f1,f2,f3;
    JComboBox combo;
    ImageIcon img;

    public card()
    {
   super("pet shop");
  this.setSize(430,500);
  this.setLocationRelativeTo(null);

  f1=new Font("Calibria ",Font.BOLD,20);
  f2=new Font("Segoe UI",Font.PLAIN,12);
  f3=new Font("Serif Bold",Font.BOLD,14);

  c1=new Color(255,242,223);
  c2=new Color(61,35,20);

  panel=new JPanel();
  panel.setBackground(c1);
  panel.setLayout(null);
  this.add(panel);

  invo=new JLabel("Invoice");
  invo.setBounds(170,10,90,27);
  invo.setForeground(c2);
  invo.setFont(f1);
  panel.add(invo);

  ptype=new JLabel("Sclect your Card type");
  ptype.setBounds(10,67,170,13);
  ptype.setForeground(c2);
  ptype.setFont(f2);
  panel.add(ptype);



  String type[]={"Visa","American Express","Master Card","Pay Pal"};
  combo=new JComboBox<>(type);
  combo.setBounds(8,83,120,23);
  combo.setBackground(c1);
  panel.add(combo);

  cno=new JLabel("Card no ");
  cno.setBounds(12,140,100,25);
  cno.setForeground(c2);
  cno.setFont(f3);
  panel.add(cno);

  cnof=new JTextField();
  cnof.setBounds(10,165,360,28);
  panel.add(cnof);

  cname=new JLabel("Card Holder Name");
  cname.setBounds(12,195,200,25);
  cname.setForeground(c2);
  cname.setFont(f3);
  panel.add(cname);

  cnamef=new JTextField();
  cnamef.setBounds(10,219,360,25);
  panel.add(cnamef);

  exp=new JLabel("Expired Date");
  exp.setBounds(13,275,180,25);
  exp.setForeground(c2);
  exp.setFont(f3);
  panel.add(exp);


  expf=new JTextField();
  expf.setBounds(10,300,130,25);
  panel.add(expf);

  cvv=new JLabel("CVV no");
  cvv.setBounds(210,275,180,25);
  cvv.setForeground(c2);
  cvv.setFont(f3);
  panel.add(cvv);

  cvvf=new JPasswordField();
  cvvf.setBounds(200,300,130,25);
  panel.add(cvvf);

  back=new JButton("Back");
  back.setBounds(11,400,90,30);
  back.setBackground(c2);
  back.setForeground(Color.WHITE);
  back.setFont(f3);
  back.addMouseListener(this);
  back.addActionListener(this);
  panel.add(back);

  next=new JButton("Next");
  next.setBounds(123,400,90,30);
  next.setBackground(c2);
  next.setForeground(Color.WHITE);
  next.setFont(f3);
  next.addMouseListener(this);
  next.addActionListener(this);
  panel.add(next);


  img=new ImageIcon("Images/Credit-Card-Icons-2-removebg-preview-2.png");
  imgl=new JLabel(img);
  imgl.setBounds(145,20,200,150);
  panel.add(imgl);



    }
  
    public void mouseClicked(MouseEvent e) {
    
    }
    public void mouseEntered(MouseEvent e) {
      if(e.getSource()==back)
      {
        back.setForeground(c2);
        back.setBackground(Color.WHITE);
      }
      else if(e.getSource()==next)
      {
        next.setForeground(c2);
        next.setBackground(Color.WHITE);
      }
    }
  
    public void mouseExited(MouseEvent e) {
        back.setForeground(Color.WHITE);
        back.setBackground(c2);

        next.setForeground(Color.white);
        next.setBackground(c2);
    }
   
    public void mousePressed(MouseEvent e) {}
    
    public void mouseReleased(MouseEvent e) {}
    
    public void actionPerformed(ActionEvent ae){
        char[] password = cvvf.getPassword();
        int cvv = password.length;

        if(ae.getSource() == next){
            if(cvv > 3 || cvv < 3){
              JOptionPane.showMessageDialog(this, "CVV should be 3 digits!", "Invalid CVV", JOptionPane.WARNING_MESSAGE);
            }
            else{

            }
        }
        else if(ae.getSource() == back){
          PayOpt po = new PayOpt();
          this.setVisible(false);
          po.setVisible(true);
        }
    }
}