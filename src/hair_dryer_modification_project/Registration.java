/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hair_dryer_modification_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anoosha Sajid
 */
public class Registration {
    
        private String username;
        static  List<User> listOfUsers = new ArrayList<>();
        private String password;
        Integer Hair_type; 
        private User loggedInUser;
        static Registration Registration1 = new Registration();


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getHair_type() {
        return Hair_type;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHair_type(Integer Hair_type) {
        this.Hair_type = Hair_type;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
        
    
    public void userLogin() throws IOException{
        
        // Used to hold the instance of a user who successfully logged in
        loggedInUser = null;

        // Create an empty list to hold users

        // Add 3 users to the list
        listOfUsers.add(new User("user1","password1",1));
        listOfUsers.add(new User("user2","password2",2));
        listOfUsers.add(new User("user3","password3",3));

        // Get user input
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Please type your username :");
        username = br.readLine();   
        System.out.println("Please type your password :");
        password = br.readLine();
        System.out.println("\nPlease cheack your hair type: " // user selects what hair type they have
				+ "\n1.Frizzy"
				+ "\n2.Straight"
				+ "\n3.Curly");
        Hair_type = Integer.parseInt(br.readLine());

        // Iterate through list of users to see if we have a match
        for (User user : listOfUsers)
        {
            if (user.getUsername().equals(username))
            {
                if (user.getPassword().equals(password))
                {
                    if (user.getHair_type().equals(Hair_type))
                    {
                    loggedInUser = user;
                    break;
                    }
                }
            }
        }

        // if loggedInUser was changed from null, it was successful
        if (loggedInUser != null)
        {
            System.out.println("User successfully logged in: " + loggedInUser.getUsername());
        }
        else
        {
            System.out.println("Invalid username/password/hairtype combination"
                    + "You can still use the dryer optimized for your hair type!");
            
        }
    }

        
    public void regisration(){
            System.out.println("Let's get you registered!");
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Please type your username :");
            username = scan.nextLine();   
            System.out.println("Please type your password :");
            password = scan.nextLine();
            System.out.println("\nPlease cheack your hair type: " // user selects what hair type they have
				+ "\n1.Frizzy"
				+ "\n2.Straight"
				+ "\n3.Curly");
            Hair_type = Integer.parseInt(scan.nextLine());
            
        listOfUsers.add(new User(Registration1.username, Registration1.password, Registration1.Hair_type));
        
        
        for (User user : listOfUsers){
            if (user.getUsername()== null) {
            	user.setUsername(username);
            	user.setPassword(password);
            	user.setHair_type(Hair_type);} 
            
        loggedInUser = user;}
        }
}
