package Frames;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

import Classes.*;


public class AdminUserAdd extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel nameL,emailL, phnL,passL,queL,ansL,defL;
	JTextField nameF,emailF, phnF,ansF, passF;
	JButton backBtn,addBtn;
	JComboBox queC;
	Color panelCol,btnCol,btnHoverCol, exitCol, loginCol;
    Font headFont, defFont, btnFont, fieldFont;
	
	public AdminUserAdd()
	{
		super("Admin User Add");
		this.setSize(570,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
        exitCol = new Color(217,83,79);
        loginCol = new Color(81,188,86);

        headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,16);
        fieldFont = new Font("Segoe UI",Font.PLAIN,16);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);
		
		
		defL = new JLabel("Enter Information");
		defL.setBounds(150,20,450,35);
		defL.setFont(headFont);
	    panel.add(defL);
		
		nameL = new JLabel("User name:");
		nameL.setBounds(100,90,450,35);
		nameL.setFont(defFont);
		panel.add(nameL);
		
		nameF = new JTextField();
		nameF.setBounds(200,90,250,35);
		nameF.setFont(fieldFont);
		panel.add(nameF);
		
		emailL = new JLabel("Email:");
		emailL.setBounds(143,140,300,35);
		emailL.setFont(defFont);
		panel.add(emailL);
		
		emailF = new JTextField();
		emailF.setBounds(200,140,250,35);
		emailF.setFont(fieldFont);
		panel.add(emailF);

		phnL = new JLabel("Phone No:");
		phnL.setBounds(105,190,300,35);
		phnL.setFont(defFont);
		panel.add(phnL);

		phnF = new JTextField();
		phnF.setBounds(200,190,250,35);
		phnF.setFont(fieldFont);
		panel.add(phnF);
		
		passL = new JLabel("Password:");
		passL.setBounds(109,240,450,35);
		passL.setFont(defFont);
		panel.add(passL);
		
		passF = new JTextField();
		passF.setBounds(200,240,250,35);
		passF.setFont(fieldFont);
		panel.add(passF);
		
		String que[] = {"Choose a security question...", "Your hobby?", "Your birth place?", "Your dream job?", "Your favorite car name?"};
		
		queL = new JLabel("Security Question:");
		queL.setBounds(38,290,450,35);
		queL.setFont(defFont);
		panel.add(queL);
		
		queC = new JComboBox(que);
		queC.setBounds(200,290,250,35);
		queC.setFont(fieldFont);
		panel.add(queC);
		
		
		ansL = new JLabel("Answer:");
		ansL.setBounds(125,340,450,35);
		ansL.setFont(defFont);
		panel.add(ansL);
		
		ansF = new JTextField();
		ansF.setBounds(200,340,250,35);
		ansF.setFont(fieldFont);
		panel.add(ansF);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(140,420,90,35);
		backBtn.setForeground(Color.WHITE);
		backBtn.setBackground(btnCol);
		backBtn.setFont(btnFont);
		backBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backBtn.setFocusPainted(false);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		addBtn = new JButton("Add");
		addBtn.setBounds(315,420,90,35);
		addBtn.setForeground(Color.WHITE);
		addBtn.setBackground(loginCol);
		addBtn.setFont(btnFont);
		addBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addBtn.setFocusPainted(false);
		addBtn.addMouseListener(this);
		addBtn.addActionListener(this);
		panel.add(addBtn);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me){
		if(me.getSource() == backBtn){
			backBtn.setBackground(btnHoverCol);
			backBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == addBtn){
			addBtn.setBackground(Color.WHITE);
			addBtn.setForeground(loginCol);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == backBtn){
			backBtn.setBackground(btnCol);
			backBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == addBtn){
			addBtn.setBackground(loginCol);
			addBtn.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == addBtn){
			String t1, t2, t3, t4, t5, t6;
			t1 = nameF.getText();
			t2 = passF.getText();
			t3 = emailF.getText();
			t4 = phnF.getText();
			t5 = String.valueOf(queC.getSelectedItem());
			t6 = ansF.getText();

			if(t1.isEmpty() == true || t2.isEmpty() == true || t3.isEmpty() == true || t4.isEmpty() == true || t5.isEmpty() == true || t6.isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Please fill out all fields.", "WARNING!", JOptionPane.WARNING_MESSAGE);
			}
			else if(t3.contains("@") == false){
				JOptionPane.showMessageDialog(this, "Email should have '@' sign", "Invalid Email!", JOptionPane.WARNING_MESSAGE);
			}
			else if(t4.length() < 11 || t3.length() > 11){
				JOptionPane.showMessageDialog(this, "Phone number should be 11 digits!", "Invalid Phone Number", JOptionPane.WARNING_MESSAGE);
			}
			else{
				UserAccount acc = new UserAccount(t1, t2, t3, t4, t5, t6);
				acc.addAccount();

				this.setVisible(false);
				UserData frame = new UserData();
				frame.setVisible(true);
			}
        }
        else if(ae.getSource() == backBtn){
            this.setVisible(false);
        }
	}
}