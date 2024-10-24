package Classes;

import java.lang.*;
import java.util.*;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

import Frames.*;

public class UserAccount {
    private String name, email, phn, pass, ques, ans;


    public UserAccount(){}

    public UserAccount(String name, String pass, String email, String phn, String ques, String ans){
        this.name = name;
        this.email = email;
        this.phn = phn;
        this.pass = pass;
        this.ques = ques;
        this.ans = ans;
    }

    public void addAccount(){
        try{
            File file = new File(".\\Datas\\User Data.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm a");

            String td = date.format(dtFormat);

            pw.println("User Name : " + name);  
            pw.println("Password : " + pass);       
            pw.println("Email : " + email);       
            pw.println("Phone Num: " + phn);       
            pw.println("Security Question : " + ques);           
            pw.println("Answer : " + ans);        
            pw.println("Time & Date : " + td);     
            pw.println("===============================================");
            
            pw.close();
            bw.close();
            fw.close();

            showMessageDialog(null, "Account Created Successfully", "Account Created", INFORMATION_MESSAGE);
        }
        catch(IOException ex){
            showMessageDialog(null, "Something went wrong!", "ERROR!", ERROR_MESSAGE);
        }
    }

    public void deleteAccount(String userRemove){
        String file = ".\\Datas\\User Data.txt";
        String temp = ".\\Datas\\temp.txt";

        File oldFile = new File(file);
        File newFile = new File(temp);

        int targetLine = 0;

        try {
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
                    String userName = Files.readAllLines(Paths.get(file)).get(i);
                    if (userName.substring(12).equals(userRemove)) {
                        targetLine = i;
                    }
                }
            }
        } 
        catch (Exception ex) {
            showMessageDialog(null, "Something went wrong!", "ERROR!", ERROR_MESSAGE);
        }

        try {
            FileWriter fw = new FileWriter(temp, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            BufferedReader reader = new BufferedReader(new FileReader(file));

            int line = 0;
            while (reader.readLine() != null){
                line++;
            }
            reader.close();

            for (int j = 0; j < line; j++) {
                String data = Files.readAllLines(Paths.get(file)).get(j);
                String user = data.substring(0, 4);

                if (targetLine != 0 && (j == targetLine || j == (targetLine + 1) || j == (targetLine + 2) || j == (targetLine + 3) || j == (targetLine + 4) || j == (targetLine + 5) || j == (targetLine + 6))) {
                    String name = Files.readAllLines(Paths.get(file)).get(j);
                    pw.println("#Deleted " + name);
                }
                else {
                    String name = Files.readAllLines(Paths.get(file)).get(j);
                    pw.println(name);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

        }
        catch (Exception ex) {
            showMessageDialog(null, "Something went wrong!", "ERROR!", ERROR_MESSAGE);
        }

        oldFile.delete();
        File trash = new File(file);
        newFile.renameTo(trash);
    }
    public boolean checkAccount(String name, String pass){
        boolean flag = false;

        try{
            String txtName = "User Name : " + name;
            String txtPass = "Password : " + pass;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Datas\\User Data.txt"));

            int lineCount = 0;
            while(reader.readLine() != null){
                lineCount++;
            }
            reader.close();

            for(int i=0 ; i <= lineCount ; i++){
                String userName = Files.readAllLines(Paths.get(".\\Datas\\User Data.txt")).get(i);

                if(userName.equals(txtName) == true){
                    String userPass = Files.readAllLines(Paths.get(".\\Datas\\User Data.txt")).get(i+1);

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