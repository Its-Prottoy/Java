package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import Classes.*;

public class Splash extends JWindow {
	JLabel userLabel,imgLabel;
	JPanel panel;
	Color myColor;
	Font myFont;
	ImageIcon img;
	
	public Splash(){
		panel = new JPanel();
		panel.setLayout(null);
		
		img = new ImageIcon("Images/petshoplogo.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0, 450, 300);
		panel.add(imgLabel);
		
		this.add(panel);
		setSize(450, 300);
		this.setLocationRelativeTo(null);
	}	
}