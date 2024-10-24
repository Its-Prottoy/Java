package Frames;

import java.lang.*;
import java.util.*;

import javax.swing.*; // javac *.java && java Start
import java.awt.*;
import java.awt.event.*;

import Classes.*;

public class Register extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JTextField namef,emailf,qustionf,ansf,capchaAnsf,phnf;
	JLabel reg,usernm,email,pass,conpass,question,ans,captcha,capchaEqual,phn, captchaQuesf;
	JPasswordField passf,conpassf;
	JButton exit;
	JButton back;
	JButton reset;
	JButton register, eyeOpen, eyeClose, eyeOpen1, eyeClose1;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	JComboBox combo;

	private int a, b;
	
	public Register(){
		super("Register");
		this.setSize(600,800);
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
		panel.setBackground(panelCol);
		this.add(panel);
		
		reg=new JLabel("REGISTER");
		reg.setBounds(200,0,400,50);
		reg.setFont(new Font("Segoe UI",Font.BOLD,40));
		panel.add(reg); //login.setFont(new Font("Arial",Font.BOLD,20));
		
		usernm=new JLabel("User Name");
		usernm.setBounds(100,60,400,30);
		usernm.setFont(defFont);
		panel.add(usernm); 
		
		namef=new JTextField();
		namef.setBounds(100,90,400,30);
		namef.setFont(fieldFont);
		panel.add(namef);
		
		pass=new JLabel("Password");
		pass.setBounds(100,130,400,30);
		pass.setFont(defFont);
		panel.add(pass);
		
		passf=new JPasswordField();
		passf.setBounds(100,160,400,30);
		passf.setFont(fieldFont);
		panel.add(passf);

		eyeClose = new JButton();
        eyeClose.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose.setBounds(510,165,20,20);
        eyeClose.setForeground(Color.white);
        eyeClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose.setFocusPainted(false);
        eyeClose.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose.setContentAreaFilled(false);
        eyeClose.addActionListener(this);
        panel.add(eyeClose);

        eyeOpen = new JButton();
        eyeOpen.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen.setBounds(510,165,20,20);
        eyeOpen.setForeground(Color.white);
        eyeOpen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen.setFocusPainted(false);
        eyeOpen.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen.setContentAreaFilled(false);
        eyeOpen.addActionListener(this);
        eyeOpen.setVisible(false);
        panel.add(eyeOpen);
		
		conpass=new JLabel("Confirm Password");
		conpass.setBounds(100,200,400,30);
		conpass.setFont(defFont);
		panel.add(conpass);
		
		conpassf=new JPasswordField();
		conpassf.setBounds(100,230,400,30);
		conpassf.setFont(fieldFont);
		panel.add(conpassf);

		eyeClose1 = new JButton();
        eyeClose1.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose1.setBounds(510,235,20,20);
        eyeClose1.setForeground(Color.white);
        eyeClose1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose1.setFocusPainted(false);
        eyeClose1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose1.setContentAreaFilled(false);
        eyeClose1.addActionListener(this);
        panel.add(eyeClose1);

        eyeOpen1 = new JButton();
        eyeOpen1.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen1.setBounds(510,235,20,20);
        eyeOpen1.setForeground(Color.white);
        eyeOpen1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen1.setFocusPainted(false);
        eyeOpen1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen1.setContentAreaFilled(false);
        eyeOpen1.addActionListener(this);
        eyeOpen1.setVisible(false);
        panel.add(eyeOpen1);
		
		email=new JLabel("Email");
		email.setBounds(100,270,400,30);
		email.setFont(defFont);
		panel.add(email);
		
		emailf=new JTextField();
		emailf.setBounds(100,300,400,30);
		emailf.setFont(fieldFont);
		panel.add(emailf);
		
		phn=new JLabel("Phone Number");
		phn.setBounds(100,340,400,30);
		phn.setFont(defFont);
		panel.add(phn);
		
		phnf=new JTextField();
		phnf.setBounds(100,370,400,30);
		phnf.setFont(fieldFont);
		panel.add(phnf);
		
		question=new JLabel("Security Question");
		question.setBounds(100,410,400,30);
		question.setFont(defFont);
		panel.add(question);
		
		String items[]={"Choose a security question...", "Your hobby?", "Your birth place?", "Your dream job?", "Your favorite car name?"};
		combo=new JComboBox(items);
		combo.setBounds(100,440,400,30);
		combo.setFont(fieldFont);
		panel.add(combo);
		
		ans=new JLabel("Answer");
		ans.setBounds(100,480,400,30);
		ans.setFont(defFont);
		panel.add(ans);
		
		ansf=new JTextField();
		ansf.setBounds(100,510,400,30);
		ansf.setFont(fieldFont);
		panel.add(ansf);
		
		captcha=new JLabel("Captcha");
		captcha.setBounds(100,550,400,30);
		captcha.setFont(defFont);
		panel.add(captcha);
		
		Random rand = new Random();
        a = rand.nextInt(10);
        b = rand.nextInt(10);

		captchaQuesf=new JLabel();
		captchaQuesf.setText(" " + a + " + " + b + " ");
		captchaQuesf.setBounds(100,580,80,30);
		captchaQuesf.setFont(defFont);
		captchaQuesf.setBackground(new Color(243, 162, 63));
		panel.add(captchaQuesf);
		
		capchaEqual=new JLabel(" = ");
		capchaEqual.setBounds(162,578,30,30);
		capchaEqual.setFont(defFont);
		panel.add(capchaEqual);
		
		capchaAnsf=new JTextField();
		capchaAnsf.setBounds(190,580,270,30);
		capchaAnsf.setFont(fieldFont);
		panel.add(capchaAnsf);
		
		
		//All buttons
		
		
		register=new JButton("Register");
		register.setBounds(190,640,200,30);
		register.setForeground(Color.WHITE);
		register.setBackground(new Color(54,185,255));
		register.setFont(btnFont);
		register.setCursor(new Cursor(Cursor.HAND_CURSOR));
		register.setFocusPainted(false);
		register.addMouseListener(this);
		register.addActionListener(this);
		panel.add(register);
		
		back=new JButton("Cancel");
		back.setBounds(235,700,110,30);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFocusPainted(false);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);
		
		reset=new JButton("Reset");
		reset.setBounds(370,700,110,30);
		reset.setForeground(Color.WHITE);
		reset.setBackground(btnCol);
		reset.setFont(btnFont);
		reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reset.setFocusPainted(false);
		reset.addMouseListener(this);
		reset.addActionListener(this);
		panel.add(reset);
		
		exit=new JButton("Exit");
		exit.setBounds(100,700,110,30);
		exit.setForeground(Color.WHITE);
		exit.setBackground(new Color(217,83,79));
		exit.setFont(btnFont);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==register){
			register.setBackground(Color.WHITE);
			register.setForeground(new Color(54,185,255));
		}
		else if(me.getSource()==exit){
			exit.setBackground(Color.WHITE);
			exit.setForeground(new Color(217,83,79));
		} 
		else if(me.getSource()==back){
			back.setBackground(btnHoverCol);
			back.setForeground(Color.WHITE);
		}
		else if(me.getSource()==reset){
			reset.setBackground(btnHoverCol);
			reset.setForeground(Color.WHITE);
		}
	}
	
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==register){
			register.setBackground(new Color(54,185,255));
			register.setForeground(Color.WHITE);
		}
		else if(me.getSource()==exit){
			exit.setBackground(new Color(217,83,79));
			exit.setForeground(Color.WHITE);
		} 
		else if(me.getSource()==back){
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
		else if(me.getSource()==reset){
			reset.setBackground(btnCol);
			reset.setForeground(Color.WHITE);
		}
	}


	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == exit){
			this.setVisible(false);
		}
		else if(ae.getSource() == back){
			GetStarted gs = new GetStarted();
			gs.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == reset){
			this.setVisible(false);
			Register r = new Register();
			r.setVisible(true);
		}
		else if(ae.getSource() == register){
			String t1 = namef.getText(); // User Name
			String t2 = passf.getText(); // Password
			String t3 = emailf.getText(); // Email
			String t4 = phnf.getText(); // Phn
			String t5 = String.valueOf(combo.getSelectedItem()); // Security Question
			String t6 = ansf.getText(); // Security Question Answer
			String cap = capchaAnsf.getText(); // Captcha
			String conf = conpassf.getText();
			
			int equal = 0;

			if(cap.isEmpty() == true){
				JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else{
				equal = Integer.parseInt(cap);

				if(t1.isEmpty() == true || t2.isEmpty() == true || t3.isEmpty() == true || t4.isEmpty() == true || t5.isEmpty() == true || t6.isEmpty() == true){
					JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
				}
				else if(t2.equals(conf) == false){
					JOptionPane.showMessageDialog(null, "Password not matched!", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
				else if(t3.contains("@") == false){
					JOptionPane.showMessageDialog(this, "Email should have '@' sign", "Invalid Email!", JOptionPane.WARNING_MESSAGE);
				}
				else if(t4.length() < 11 || t4.length() > 11){
					JOptionPane.showMessageDialog(this, "Phone number should be 11 digits!", "Invalid Phone Number", JOptionPane.WARNING_MESSAGE);
				}
				else if(equal != (a+b)){
					JOptionPane.showMessageDialog(null, "Wrong Captcha.", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
				else{
					UserAccount uacc = new UserAccount(t1,t2,t3,t4,t5,t6);
					uacc.addAccount();

					userlogin ul = new userlogin();
					this.setVisible(false);
					ul.setVisible(true);
				}
			}
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
		else if(ae.getSource() == eyeClose1){
            if (conpassf.getEchoChar() != '\u0000') {
                conpassf.setEchoChar('\u0000');
                eyeClose1.setVisible(false);
                eyeOpen1.setVisible(true);
            }
        }
        else if(ae.getSource() == eyeOpen1){
            conpassf.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            eyeOpen1.setVisible(false);
            eyeClose1.setVisible(true);
        }
	}
	
}