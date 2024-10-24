package Login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import User.*;
import Login.*;
import Dashboard.*;
import User.Driver;

public class DriverSignUp implements ActionListener {

  Driver[] drivers = new Driver[100];

  JFrame driSignupFrame;
  JPanel driverSignUp;
  JPanel signupComplete;
  JLabel l1, l2;
  JTextField tf1, tf2, tf3, tf4, tf5, tf6;
  JPasswordField cp1, ccp1;
  JButton signUp, returnToLogin, returnToSignup;
  JComboBox<String> experience, carType;
  String[] carTypes = { "Sedan", "SUV", "Coupe", "Minivan", "Hatchback" };
  String[] driverExperience = { "1-3 years", "2-5 years", "5-10 years", "10-15 years" };

  DriverSignUp() {
    driSignupFrame = new JFrame();

    driverSignUp = new JPanel();

    l1 = new JLabel("Signup as Driver");
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

    tf4 = new JTextField("NID Number");
    tf4.setBounds(300, 480, 150, 30);
    tf4.setFont(bigFont);

    tf5 = new JTextField("Lisence Number");
    tf5.setBounds(300, 540, 150, 30);
    tf5.setFont(bigFont);

    carType = new JComboBox<>(carTypes);
    carType.setBounds(400, 250, 140, 20);

    experience = new JComboBox<>(driverExperience);
    experience.setBounds(400, 350, 140, 20);

    signUp = new JButton("Sign-up");
    signUp.setBounds(150, 200, 70, 30);
    signUp.addActionListener(this);
    signUp.setOpaque(false);
    signUp.setContentAreaFilled(false);
    signUp.setBorderPainted(true);
    signUp.setForeground(Color.BLACK);

    driverSignUp.add(l1);
    driverSignUp.add(tf1);
    driverSignUp.add(tf2);
    driverSignUp.add(tf3);
    driverSignUp.add(tf4);
    driverSignUp.add(tf5);
    driverSignUp.add(experience);
    driverSignUp.add(carType);
    driverSignUp.add(cp1);
    driverSignUp.add(ccp1);
    driverSignUp.add(signUp);
    driverSignUp.setLayout(null);
    driverSignUp.setBounds(0, 0, 1000, 700);
    driverSignUp.setBackground(Color.green);
    driverSignUp.setVisible(true);

    signupComplete = new JPanel();

    l2 = new JLabel("Account has been successfully created!");
    l2.setBounds(300, 100, 400, 80);
    l2.setFont(bigFont);

    returnToLogin = new JButton("Return to Login");
    returnToLogin.setBounds(150, 200, 150, 30);
    returnToLogin.addActionListener(this);
    returnToLogin.setOpaque(false);
    returnToLogin.setContentAreaFilled(false);
    returnToLogin.setBorderPainted(true);
    returnToLogin.setForeground(Color.BLACK);

    returnToSignup = new JButton("Return to Sign-up");
    returnToSignup.setBounds(150, 300, 150, 30);
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

    driSignupFrame.add(driverSignUp);
    driSignupFrame.add(signupComplete);
    driSignupFrame.setLayout(null);
    driSignupFrame.setTitle("Customer Signup - Driver Chai");
    driSignupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    driSignupFrame.setSize(1000, 700);
    driSignupFrame.setLocationRelativeTo(null);
    driSignupFrame.setVisible(true);

  }

  public void addDriver(Driver a)// function for adding an account to the array
  {
    int count = 0;

    for (int i = 0; i < drivers.length; i++) {
      if (drivers[i] == null) {
        drivers[i] = a;
        count++;
        this.drivers = drivers;
        break;
      }
    }
    if (count == 0) {
      System.out.println("Account not added");
    } else {
      System.out.println("Account added");
    }
  }

  public Driver[] getDriver() {

    return drivers;

  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == signUp) {
      String name = tf1.getText();
      String phoneNo = tf2.getText();
      String email = tf3.getText();
      String nid = tf4.getText();
      String lisence = tf5.getText();
      String type = carType.getSelectedItem().toString();
      String exp = experience.getSelectedItem().toString();
      String pass = cp1.getText();
      String confPass = ccp1.getText();
      String rate = tf6.getText();

      if (name != null && phoneNo != null && email != null && pass.equals(confPass)) {
        Driver a = new Driver(name, phoneNo, email, pass, nid, lisence, exp, type,
            rate);

        addDriver(a);
        driverSignUp.setVisible(false);
        signupComplete.setVisible(true);

      }
    }

    if (e.getSource() == returnToLogin) {
      driSignupFrame.setVisible(false);
      Customer[] dummyc = new Customer[1];
      new Login(dummyc, drivers);

    }

    if (e.getSource() == returnToSignup) {
      signupComplete.setVisible(false);
      driverSignUp.setVisible(true);

    }

  }

}
