package User;

import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon; //imports libraries
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

import Dashboard.*;
import Login.*;

public class Customer extends User {

  public Customer(String name, String phoneNumber, String emailAddress, String password) {
    super(name, phoneNumber, emailAddress, password);

  }

  public String getName() {

    return name;

  }

  public String getPhoneNum() {

    return phoneNumber;

  }

  public String getEmailaddress() {

    return emailAddress;

  }

  public String getPassword() {

    return password;

  }

  public void showCustomerDetails() {

    System.out.println("Name: " + name);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email Address: " + emailAddress);
    System.out.println("Password: " + password);

  }

}
