package Frames;

import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
import java.awt.event.*;

public class CatProduct2 extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JButton backbt,buybt;
	JLabel name,bdt,quantity,stock,thanks;
	ImageIcon img,logo;
	JLabel imglabel,logolabel, update;
	JComboBox combo;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	
	private double price = 460;
	private String product = "Cat Playing Toy";
	private double updatePrice;

	public CatProduct2(){
		
		super("Cat Playing Toy");
		this.setSize(900,600);
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
		
		//texts
		
		name=new JLabel("Cat Playing Toy");
		name.setBounds(453,200,400,40);
		name.setFont(headFont);
		panel.add(name);
		
		stock=new JLabel("IN STOCK");
		stock.setBounds(453,240,400,30);
		stock.setFont(fieldFont);
		stock.setForeground(new Color(83,176,136));
		panel.add(stock);
		
		bdt=new JLabel();
		bdt.setText(price + " BDT");
		bdt.setBounds(463,290,200,30);
		bdt.setFont(defFont);
		bdt.setForeground(new Color(62,34,22));
		panel.add(bdt);

		update = new JLabel();
		update.setBounds(553,290,400,30);
		update.setFont(defFont);
		update.setForeground(new Color(62,34,22));
		panel.add(update);
		
		quantity=new JLabel("Quantity:");
		quantity.setBounds(453,340,400,30);
		quantity.setFont(fieldFont);
		panel.add(quantity);
		
		//Combo box
		
		String items[]={"Select...", "01","02","03","04","05"};
		combo=new JComboBox(items);
		combo.setBounds(453,370,100,50);
		combo.setFont(defFont);
		combo.setBorder(BorderFactory.createLineBorder(btnHoverCol));
		combo.addActionListener(this);
		panel.add(combo);
		
		//Picture
		
		img=new ImageIcon("Images/Big/catplayingtoy.jpg");
		imglabel=new JLabel(img);
		imglabel.setBounds(22,80,400,400);
		panel.add(imglabel);
		
		logo=new ImageIcon("Images/thankyoufill.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(450,0,392,145);
		panel.add(logolabel);
		
		//buttons
		
		backbt=new JButton("BACK");
		backbt.setBounds(453,480,186,50);
		backbt.setForeground(Color.WHITE);
		backbt.setBackground(btnCol);
		backbt.setFont(btnFont);
		backbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backbt.setFocusPainted(false);
		backbt.addMouseListener(this);
		backbt.addActionListener(this);
		panel.add(backbt);
		
		
		buybt=new JButton("BUY NOW");
		buybt.setBounds(659,480,186,50);
		buybt.setForeground(Color.WHITE);
		buybt.setBackground(btnCol);
		buybt.setFont(btnFont);
		buybt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buybt.setFocusPainted(false);
		buybt.addMouseListener(this);
		buybt.addActionListener(this);
		panel.add(buybt);
		
	}
	
	
	//Mouselistener
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==backbt){
			backbt.setBackground(btnHoverCol);
			backbt.setForeground(Color.WHITE);
		}
		else if(me.getSource()==buybt){
			buybt.setBackground(btnHoverCol);
			buybt.setForeground(Color.WHITE);
		} 
	}
	
	
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==backbt){
			backbt.setForeground(Color.WHITE);
			backbt.setBackground(btnCol);
		}
		else if(me.getSource()==buybt){
			buybt.setBackground(btnCol);
			buybt.setForeground(Color.WHITE);
		}
	}


	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == combo){
			int quantity = combo.getSelectedIndex();
			if(quantity == 1){
				updatePrice = price * quantity;
				update.setText(" X " + quantity + " = " + updatePrice + " BDT");
			}
			else if(quantity == 1){
				updatePrice = price * quantity;
				update.setText(" X " + quantity + " = " + updatePrice + " BDT");
			}
			else if(quantity == 2){
				updatePrice = price * quantity;
				update.setText(" X " + quantity + " = " + updatePrice + " BDT");
			}
			else if(quantity == 3){
				updatePrice = price * quantity;
				update.setText(" X " + quantity + " = " + updatePrice + " BDT");
			}
			else if(quantity == 4){
				updatePrice = price * quantity;
				update.setText(" X " + quantity + " = " + updatePrice + " BDT");
			}
		}
		else if(ae.getSource() == buybt){
			int index = combo.getSelectedIndex();
			if(index == 0){
				JOptionPane.showMessageDialog(this, "Please select quantity", "WARNING!", JOptionPane.WARNING_MESSAGE);
			}
			else{
				PayOpt po = new PayOpt();
				this.setVisible(false);
				po.setVisible(true);
			}
		}
		else if(ae.getSource() == backbt){
			cataccessories cat = new cataccessories();
			cat.setVisible(true);
			this.setVisible(false);
		}
	}
}