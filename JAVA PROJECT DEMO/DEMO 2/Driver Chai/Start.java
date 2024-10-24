import javax.swing.*;
import java.awt.event.*;

import Login.*;
import User.*;
import Login.Signup;
import Dashboard.*;

public class Start {

  public static void main(String[] args) {

    Customer[] blankc = new Customer[1];
    Driver[] blankd = new Driver[100];

    new Login(blankc, blankd);

  }
}
