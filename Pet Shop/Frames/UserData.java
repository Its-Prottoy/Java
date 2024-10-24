package Frames;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.*;
import java.nio.file.*;

import Classes.*;

public class UserData extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
	JLabel headL;
	JButton back, add, refresh, delete, exit;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    Cursor cursor;
	Color panelCol,btnCol,btnHoverCol, exitCol, loginCol;
    Font headFont, defFont, btnFont, fieldFont;

    private String[] tableCol = {"User Name", "Password", "Email", "Phone Number", "Security Question", "Answer", "Date and Time"};
    private String[] dataRow = new String[7];

    public UserData(){
        this.setTitle("Pet Shop - User Data");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
        exitCol = new Color(217,83,79);
        loginCol = new Color(81,188,86);

        headFont = new Font("Segoe UI",Font.BOLD,35);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
        fieldFont = new Font("Segoe UI",Font.PLAIN,16);

        panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        headL = new JLabel("USER DATA");
		headL.setBounds(490,30,300,30);
        headL.setForeground(btnCol);
		headL.setFont(headFont);
	    panel.add(headL);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(tableCol);

        table.setModel(model);
        table.setFont(fieldFont);
        table.setSelectionBackground(new Color(252, 232, 207));
        table.setRowHeight(25);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(230);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(155);
        table.getColumnModel().getColumn(5).setPreferredWidth(250);
        table.getColumnModel().getColumn(6).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 1082, 300);
        scroll.setBackground(btnHoverCol);
        panel.add(scroll);

        exit = new JButton("Exit");
		exit.setBounds(310,490,250,45);
		exit.setForeground(Color.WHITE);
		exit.setBackground(exitCol);
		exit.setFont(btnFont);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);

        back = new JButton("Back");
		back.setBounds(610,490,250,45);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFocusPainted(false);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);

        refresh = new JButton("Refresh");
		refresh.setBounds(235,425,200,45);
		refresh.setForeground(Color.WHITE);
		refresh.setBackground(btnCol);
		refresh.setFont(btnFont);
		refresh.setCursor(new Cursor(Cursor.HAND_CURSOR));
		refresh.setFocusPainted(false);
		refresh.addMouseListener(this);
		refresh.addActionListener(this);
		panel.add(refresh);

        delete = new JButton("Delete");
		delete.setBounds(485,425,200,45);
		delete.setForeground(Color.WHITE);
		delete.setBackground(btnCol);
		delete.setFont(btnFont);
		delete.setCursor(new Cursor(Cursor.HAND_CURSOR));
		delete.setFocusPainted(false);
		delete.addMouseListener(this);
		delete.addActionListener(this);
		panel.add(delete);

        add = new JButton("Add");
		add.setBounds(735,425,200,45);
		add.setForeground(Color.WHITE);
		add.setBackground(btnCol);
		add.setFont(btnFont);
		add.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add.setFocusPainted(false);
		add.addMouseListener(this);
		add.addActionListener(this);
		panel.add(add);

        try {
			String file = ".\\Datas\\User Data.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int line = 0;
            while (reader.readLine() != null){
                line++;
            }
            reader.close();

            for (int i = 0; i < line; i++) {
                String data = Files.readAllLines(Paths.get(file)).get(i);
                String user = data.substring(0, 4);
                if (user.equals("User")) {
                    dataRow[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12);//name
                    dataRow[1] = Files.readAllLines(Paths.get(file)).get((i+1)).substring(11);//pass
                    dataRow[2] = Files.readAllLines(Paths.get(file)).get((i+2)).substring(8);//email
					dataRow[3] = Files.readAllLines(Paths.get(file)).get((i+3)).substring(11);//phone
                    dataRow[4] = Files.readAllLines(Paths.get(file)).get((i+4)).substring(20);//ques
                    dataRow[5] = Files.readAllLines(Paths.get(file)).get((i+5)).substring(9);//ans
                    dataRow[6] = Files.readAllLines(Paths.get(file)).get((i+6)).substring(14);//date
                    model.addRow(dataRow);
                }
            }

        } catch (Exception ioe) {
            return;
        }
    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me){
		if(me.getSource() == refresh){
			refresh.setBackground(btnHoverCol);
			refresh.setForeground(Color.WHITE);
		}
		else if(me.getSource() == delete){
			delete.setBackground(new Color(232,49,47));
			delete.setForeground(Color.WHITE);
		}
		else if(me.getSource() == add){
			add.setBackground(loginCol);
			add.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(new Color(167, 41, 37));
			exit.setForeground(Color.WHITE);
		}
        else if(me.getSource() == back){
			back.setBackground(btnHoverCol);
			back.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == refresh){
			refresh.setBackground(btnCol);
			refresh.setForeground(Color.WHITE);
		}
		else if(me.getSource() == delete){
			delete.setBackground(btnCol);
			delete.setForeground(Color.WHITE);
		}
		else if(me.getSource() == add){
			add.setBackground(btnCol);
			add.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit){
			exit.setBackground(exitCol);
			exit.setForeground(Color.WHITE);
		}
        else if(me.getSource() == back){
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == refresh){
			this.setVisible(false);
            UserData frame = new UserData();
            frame.setVisible(true);
		}
		else if(ae.getSource() == delete){
			if (table.getSelectionModel().isSelectionEmpty() == true) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete", "WARNING!", JOptionPane.WARNING_MESSAGE);
        	}
			else{
				int confirm = JOptionPane.showConfirmDialog(this, "Delete User?", "Confirmation", JOptionPane.YES_NO_OPTION);

				if(confirm == JOptionPane.YES_OPTION){
					String userRemove = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

					UserAccount userAcc = new UserAccount();
					userAcc.deleteAccount(userRemove);

					this.setVisible(false);
					UserData frame = new UserData();
					frame.setVisible(true);
				}
			}
		}
		else if(ae.getSource() == add){
			AdminUserAdd userAdd = new AdminUserAdd();
			userAdd.setVisible(true);

			this.setVisible(false);
		}
		else if(ae.getSource() == back){
			AdminPanel admin = new AdminPanel();
			admin.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
	}
}