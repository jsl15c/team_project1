/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankClasses;

/**
 *
 * @author jarrod
 */

// used for iostream functionality
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {    
    // private member data
    private String username;
    private String password;
    private User[] userList;
    
    // public member functions
    Admin() {
        this.username = "admin";
        this.password = "password";
        fillUserList();
    }
    
    private void fillUserList() {
        userList = new User[15];
        
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public User[] getUsers() {
        // sizes new object array to length of userList
        int size = this.userList.length;
        User[] allUsers = new User[size];
        // copies users (from text file) into new object array
        for (int i = 0; i < this.userList.length; i++) {
            allUsers[i] = this.userList[i];
        }
        return allUsers;
    }
    
    public static void main(String args[]) {
        System.out.println("Admin works!");
        Admin admin = new Admin();
        System.out.println("Admin info: " + admin.getUsername() + " " + admin.getPassword());
        System.out.println("# of users: " + admin.getUsers().length);
       
        
        //    PrintWriter writer = new PrintWriter(userData);
        //    FileInputStream is = new FileInputStream(userData);
        //    FileOutputStream os = new FileOutputStream(userData);
        try {
             // iostream classes
            File userData = null;
            userData = new File("data.txt");
            boolean fileCreated = userData.createNewFile();
            System.out.println(fileCreated);
            userData.delete();
            System.out.println(fileCreated);
            
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }    
}
