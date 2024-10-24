package Frames;

import java.lang.*;
import javax.swing.*;

import Classes.AdminAccount;

import java.awt.*;
import java.awt.event.*;

public class chngAdmin extends JFrame implements MouseListener, ActionListener{

    JLabel name,pass,wel,eyeOLabel, eyeCLabel;
    JPanel panel;
    JTextField namef;
    JPasswordField passf;
    JButton back,change, eyeClose, eyeOpen;
    Color panelCol,btnCol,btnHoverCol, exitCol, loginCol;
    Font headFont, defFont, btnFont, fieldFont;

    public chngAdmin()
    {
        super("Change Admin Informations");
        this.setSize(650,375);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
        exitCol = new Color(217,83,79);
        loginCol = new Color(81,188,86);

        headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,16);
        fieldFont = new Font("Segoe UI",Font.PLAIN,16);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(panelCol);
        this.add(panel);

        wel=new JLabel("Change Admin Name and Password");
        wel.setBounds(50,0,600,80);
        wel.setForeground(btnCol);
        wel.setFont(headFont);
        panel.add(wel);

        name=new JLabel("Name:");
        name.setBounds(190,80,100,82);
        name.setFont(defFont);
        panel.add(name);

        namef=new JTextField();
        namef.setBounds(250,106,210,35);
        namef.setFont(fieldFont);
        panel.add(namef);

        pass=new JLabel("Password:");
        pass.setBounds(160,145,150,82);
        pass.setFont(defFont);
        panel.add(pass);

        passf=new JPasswordField();
        passf.setBounds(250,170,210,35);
        passf.setFont(fieldFont);
        panel.add(passf);

        eyeClose = new JButton();
        eyeClose.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose.setBounds(470,177,20,20);
        eyeClose.setForeground(Color.white);
        eyeClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose.setFocusPainted(false);
        eyeClose.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose.setContentAreaFilled(false);
        eyeClose.addActionListener(this);
        panel.add(eyeClose);

        eyeOpen = new JButton();
        eyeOpen.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen.setBounds(470,177,20,20);
        eyeOpen.setForeground(Color.white);
        eyeOpen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen.setFocusPainted(false);
        eyeOpen.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen.setContentAreaFilled(false);
        eyeOpen.addActionListener(this);
        eyeOpen.setVisible(false);
        panel.add(eyeOpen);

        back=new JButton("Cancel");
        back.setBounds(185,250,90,35);
        back.setBackground(btnHoverCol);
        back.setFont(btnFont);
        back.setForeground(Color.WHITE);
        back.addMouseListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFocusPainted(false);
        back.addActionListener(this);
        panel.add(back);

        change=new JButton("Change");
        change.setBounds(350,250,100,35);
        change.setBackground(btnHoverCol);
        change.setFont(btnFont);
        change.setForeground(Color.WHITE);
        change.addMouseListener(this);
        change.setCursor(new Cursor(Cursor.HAND_CURSOR));
		change.setFocusPainted(false);
        change.addActionListener(this);
        panel.add(change);
    }
   
    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==back)
        {
            back.setBackground(exitCol);
            
        }
        else if(e.getSource()==change)
        {
            change.setBackground(btnCol);
        }
    }
   
    public void mouseExited(MouseEvent e) {
        back.setBackground(btnHoverCol);
        change.setBackground(btnHoverCol);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == eyeClose){
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
        else if(ae.getSource() == back){
            this.setVisible(false);
        }
        else if(ae.getSource() == change){
            String t1, t2;
            t1 = namef.getText();
            t2 = passf.getText();

            if(t1.isEmpty() == true || t2.isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Please fill out all fields.", "WARNING!", JOptionPane.WARNING_MESSAGE);
			}
            else{
                AdminAccount adAcc = new AdminAccount();
                adAcc.changeAccount(t1, t2);
                
                this.setVisible(false);
            }
        }
    }
}
