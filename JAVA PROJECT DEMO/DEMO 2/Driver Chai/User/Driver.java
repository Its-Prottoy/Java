package User;

import java.lang.*;
/*import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon;																				//imports libraries
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;*/
import Dashboard.*;
import Login.*;

public class Driver extends User {
  String nidNumber;
  String lisenceNumber;
  String yearsExp;
  String carType;
  String rate;

  public Driver(String name, String phoneNumber, String emailAddress, String password, String nidNumber,
      String lisenceNumber,
      String yearsExp, String carType, String rate) {
    super(name, phoneNumber, emailAddress, password);
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.password = password;
    this.nidNumber = nidNumber;
    this.lisenceNumber = lisenceNumber;
    this.yearsExp = yearsExp;
    this.carType = carType;
    this.rate = rate;

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

  public String getNidNumber() {

    return nidNumber;

  }

  public String getLisenceNumber() {

    return lisenceNumber;

  }

  public String getYearsExp() {

    return yearsExp;

  }

  public String getCarType() {

    return carType;

  }

  public String getRate() {

    return rate;

  }

  public void showDriverDetails() {

    System.out.println("Name: " + name);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email Address:" + emailAddress);
    System.out.println("lisenceNumber: " + lisenceNumber);

  }

}
