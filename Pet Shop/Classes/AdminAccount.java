package Classes;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

import static javax.swing.JOptionPane.*;

import Frames.*;

public class AdminAccount {
    private String name, pass;

    public AdminAccount(){}

    public AdminAccount(String name, String pass){
        this.name = name;;
        this.pass = pass;
    }

    public void changeAccount(String name, String pass){
        String adminData = ".\\Datas\\Admin Data.txt";
        File oldData = new File(adminData);
        oldData.delete();
        try{
            File file = new File(".\\Datas\\Admin Data.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("======================================================");
            pw.println("\t\t### Pet Shop Admin Data ###");
            pw.println("======================================================");
            pw.println("User Name : " + name);               
            pw.println("Password : " + pass);            
            pw.println("======================================================");

            pw.flush();
            pw.close();
            bw.close();
            fw.close();

            showMessageDialog(null, "Admin name & password changed successfully!", "Changed", INFORMATION_MESSAGE);
        }
        catch(IOException ioe){
            showMessageDialog(null, "Something went wrong", "ERROR!", ERROR_MESSAGE);
        }
    }
    public boolean checkAccount(){
        boolean flag = false;

        try{
            String txtName = "User Name : " + name;
            String txtPass = "Password : " + pass;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Datas\\Admin Data.txt"));

            int lineCount = 0;
            while(reader.readLine() != null){
                lineCount++;
            }
            reader.close();

            for(int i=0 ; i <= lineCount ; i++){
                String userName = Files.readAllLines(Paths.get(".\\Datas\\Admin Data.txt")).get(i);

                if(userName.equals(txtName) == true){
                    String userPass = Files.readAllLines(Paths.get(".\\Datas\\Admin Data.txt")).get(i+1);

                    if(userPass.equals(txtPass) == true){
                        flag = true;
                        break;
                    }
                }
            }
        }
        catch(Exception ex){
            showMessageDialog(null, "Wrong username or password!", "ERROR!", ERROR_MESSAGE);
        }

        return flag;
    }
}