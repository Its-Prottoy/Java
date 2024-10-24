package Login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import Images.*;
import User.*;

public class CustomerSignUp implements ActionListener {

  Customer[] customers = new Customer[100];

  JFrame cusSignupFrame;
  JPanel customerSignUp;
  JPanel signupComplete;
  JLabel l1, l2;
  JTextField tf1, tf2, tf3;
  JPasswordField cp1, ccp1;
  JButton signUp, returnToLogin, returnToSignup;

  CustomerSignUp() {
    cusSignupFrame = new JFrame();

    customerSignUp = new JPanel();

    l1 = new JLabel("Signup as Customer");
    l1.setBounds(300, 100, 400, 80);
    Font bigFont = l1.getFont().deriveFont(Font.PLAIN, 40f);
    l1.setFont(bigFont);

    tf1 = new JTextField("Name");
    tf1.setBounds(300, 200, 150, 30);

    tf1.setFont(bigFont);

    tf2 = new JTextField("Phone Number");
    tf2.setBounds(300, 300, 150, 30);
    tf2.setFont(bigFont);

    tf3 = new JTextField("Email");
    tf3.setBounds(300, 400, 150, 30);
    tf3.setFont(bigFont);

    cp1 = new JPasswordField("Admin Password", 7);
    cp1.setBounds(750, 200, 150, 80);
    cp1.setFont(bigFont);

    ccp1 = new JPasswordField("Confirm Password", 7);
    ccp1.setBounds(750, 300, 150, 80);
    ccp1.setFont(bigFont);

    signUp = new JButton();
    signUp.setBounds(150, 200, 70, 30);
    signUp.addActionListener(this);
    signUp.setOpaque(false);
    signUp.setContentAreaFilled(false);
    signUp.setBorderPainted(true);
    signUp.setForeground(Color.BLACK);

    customerSignUp.add(l1);
    customerSignUp.add(tf1);
    customerSignUp.add(tf2);
    customerSignUp.add(tf3);
    customerSignUp.add(cp1);
    customerSignUp.add(ccp1);
    customerSignUp.add(signUp);
    customerSignUp.setLayout(null);
    customerSignUp.setBounds(0, 0, 1000, 700);
    customerSignUp.setBackground(Color.green);
    customerSignUp.setVisible(true);

    signupComplete = new JPanel();

    l2 = new JLabel("Account has been successfully created!");
    l2.setBounds(300, 100, 400, 80);
    l2.setFont(bigFont);

    returnToLogin = new JButton();
    returnToLogin.setBounds(150, 200, 70, 30);
    returnToLogin.addActionListener(this);
    returnToLogin.setOpaque(false);
    returnToLogin.setContentAreaFilled(false);
    returnToLogin.setBorderPainted(true);
    returnToLogin.setForeground(Color.BLACK);

    returnToSignup = new JButton();
    returnToSignup.setBounds(150, 300, 70, 30);
    returnToSignup.addActionListener(this);
    returnToSignup.setOpaque(false);
    returnToSignup.setContentAreaFilled(false);
    returnToSignup.setBorderPainted(true);
    returnToSignup.setForeground(Color.BLACK);

    signupComplete.add(l2);
    signupComplete.add(returnToLogin);
    signupComplete.add(returnToSignup);
    signupComplete.setLayout(null);
    signupComplete.setBounds(0, 0, 1000, 700);
    signupComplete.setBackground(Color.green);
    signupComplete.setVisible(false);

    cusSignupFrame.add(customerSignUp);
    cusSignupFrame.add(signupComplete);
    cusSignupFrame.setLayout(null);
    cusSignupFrame.setTitle("Customer Signup - Driver Chai");
    cusSignupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cusSignupFrame.setSize(1000, 700);
    cusSignupFrame.setLocationRelativeTo(null);
    cusSignupFrame.setVisible(true);

  }

  public void addCustomer(Customer a)// function for adding an account to the array
  {
    int count = 0;

    for (int i = 0; i < customers.length; i++) {
      if (customers[i] == null) {
        customers[i] = a;
        count++;
        this.customers = customers;
        break;
      }
    }
    if (count == 0) {
      System.out.println("Account not added");
    } else {
      System.out.println("Account added");
    }
  }

  public Customer[] getCus() {

    return customers;

  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == signUp) {
      String name = tf1.getText();
      String phoneNo = tf2.getText();
      String email = tf3.getText();
      String pass = cp1.getText();
      String confPass = ccp1.getText();

      if (name != null && phoneNo != null && email != null && pass.equals(confPass)) {
        Customer a = new Customer(name, phoneNo, email, pass);
        addCustomer(a);
        customerSignUp.setVisible(false);
        signupComplete.setVisible(true);

      }
    }

    if (e.getSource() == returnToLogin) {
      cusSignupFrame.setVisible(false);
      Driver[] dummyd = new Driver[1];
      new Login(customers, dummyd);

    }

    if (e.getSource() == returnToSignup) {
      signupComplete.setVisible(false);
      customerSignUp.setVisible(true);

    }

  }

}
