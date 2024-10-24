package User;

import java.lang.*;

import Dashboard.*;
import Login.*;

public abstract class User {
  protected String name;
  protected String phoneNumber;
  protected String emailAddress;
  protected String password;

  User(String name, String phoneNumber, String emailAddress, String password) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.password = password;

  }

  public abstract String getName();

  public abstract String getPhoneNum();

  public abstract String getEmailaddress();

  public abstract String getPassword();

}
