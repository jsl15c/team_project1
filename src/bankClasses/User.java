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

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private double accBalance;
    
    User(String first, String last, double balance, 
         String user, String pass) {
        this.firstName = first;
        this.lastName = last;
        this.accBalance = balance;
        this.username = user;
        this.password = pass;
    }
    
    
}
