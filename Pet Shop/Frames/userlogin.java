package Frames;

import java.lang.*;
import javax.swing.*;

import Classes.*;

import java.awt.*;
import java.awt.event.*;

public class userlogin extends JFrame implements MouseListener, ActionListener{

    JLabel name,pass,wel,imglable,forgotPasswordLabel;
    JPanel panel;
    JTextField namef;
    JPasswordField passf;
    JButton back,exit,login, eyeClose, eyeOpen;
    Font f1,bf,fieldFont;
    Color c1,c2,c3;
    ImageIcon img;
    JCheckBox c;

    

    public userlogin()
    {
        super("Pet Shop - Login");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

        f1=new Font("Calibri",Font.BOLD,25);
        bf=new Font("Arial Black",Font.BOLD,14);
        c1=new Color(255,242,223);
        c2=new Color(241,146,26);
        c3=new Color(61,35,20);
        fieldFont = new Font("Segoe UI",Font.PLAIN,16);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);
        this.add(panel);

        wel=new JLabel("User Login");
        wel.setBounds(240,0,600,95);
        wel.setForeground(c3);
        wel.setFont(f1);
        panel.add(wel);

        name=new JLabel("Name");
        name.setBounds(125,300,100,82);
        name.setFont(f1);
        name.setForeground(c3);
        panel.add(name);

        namef=new JTextField();
        namef.setBounds(235,320,210,39);
        namef.setFont(fieldFont);
        panel.add(namef);

        pass=new JLabel("Password");
        pass.setBounds(125,350,150,82);
        pass.setFont(f1);
        pass.setForeground(c3);
        panel.add(pass);

        passf=new JPasswordField();
        passf.setBounds(235,370,210,39);
        passf.setFont(fieldFont);
        panel.add(passf);

        back=new JButton("Back");
        back.setBounds(90,500,90,35);
        back.setBackground(c2);
        back.setFont(bf);
        back.setForeground(Color.WHITE);
        back.addMouseListener(this);
        back.addActionListener(this);
        panel.add(back);

        exit=new JButton("Exit");
        exit.setBounds(230,500,110,35);
        exit.setBackground(c2);
        exit.setFont(bf);
        exit.setForeground(Color.WHITE);
        exit.addMouseListener(this);
        exit.addActionListener(this);
        panel.add(exit);

        login=new JButton("Login");
        login.setBounds(380,500,110,35);
        login.setBackground(c2);
        login.setFont(bf);
        login.setForeground(Color.WHITE);
        login.addMouseListener(this);
        login.addActionListener(this);
        panel.add(login);

        eyeClose = new JButton();
        eyeClose.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose.setBounds(460,378,20,20);
        eyeClose.setForeground(Color.white);
        eyeClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose.setFocusPainted(false);
        eyeClose.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose.setContentAreaFilled(false);
        eyeClose.addActionListener(this);
        panel.add(eyeClose);

        eyeOpen = new JButton();
        eyeOpen.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen.setBounds(460,378,20,20);
        eyeOpen.setForeground(Color.white);
        eyeOpen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen.setFocusPainted(false);
        eyeOpen.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen.setContentAreaFilled(false);
        eyeOpen.addActionListener(this);
        eyeOpen.setVisible(false);
        panel.add(eyeOpen);

        c=new JCheckBox("Remember me");
        c.setBounds(200,450,110,30);
        c.setBackground(c1);
        panel.add(c);

        img=new ImageIcon("Images/petshoplogo.jpg");
        imglable=new JLabel(img);
        imglable.setBounds(100,55,450,300);
        panel.add(imglable);

    }
   
    public void mouseClicked(MouseEvent e) {

        if(e.getSource()==forgotPasswordLabel)
        {
            JOptionPane.showConfirmDialog(this,"Do you want to recover Password ?","User login of Pet Shop",JOptionPane.YES_NO_OPTION);
        }
    }
    
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==back)
        {
            back.setBackground(c3);
            
        }
        else if(e.getSource()==exit)
        {
            exit.setBackground(c3);
        }
        else if(e.getSource()==login)
        {
            login.setBackground(c3);
        }
    }
   
    public void mouseExited(MouseEvent e) {
        back.setBackground(c2);
        exit.setBackground(c2);
        login.setBackground(c2);
    }
   
    public void mousePressed(MouseEvent e) {}
   
    public void mouseReleased(MouseEvent e) { }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String t1, t2;
            t1 = namef.getText();
            t2 = passf.getText();

            if(t1.isEmpty() == true || t2.isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Please fill out all fields.", "WARNING!", JOptionPane.WARNING_MESSAGE);
			}
            else{
                UserAccount adAcc = new UserAccount();
                if(adAcc.checkAccount(t1, t2) == true){
                    JOptionPane.showMessageDialog(this, "Login Successful, press OK", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
                    
                    PetSelect pet = new PetSelect();
                    pet.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
        if(ae.getSource() == back){
            GetStarted gs = new GetStarted();
            gs.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == exit){
            this.setVisible(false);
        }
        else if(ae.getSource() == eyeClose){
            if (passf.getEchoChar() != '\u0000') {
                passf.setEchoChar('\u0000');
                eyeClose.setVisible(false);
                eyeOpen.setVisible(true);
            }
        }
        else if(ae.getSource() == eyeOpen){
            passf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            eyeOpen.setVisible(false);
            eyeClose.setVisible(true);
        }
    }
    
}
