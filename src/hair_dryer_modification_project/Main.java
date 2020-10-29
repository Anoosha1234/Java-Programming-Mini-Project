package hair_dryer_modification_project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anoosha Sajid
 */
public class Main extends Registration {   
public static void main (String[] args) throws IOException {
    
        
        String greeting = "Hello";
        
        System.out.println("*** Welcome to the hairdryer ***\n");
        System.out.println(greeting);
        
       System.out.println("If you are already registered, press 1. Otherwise, press 2 for new registration");
                Scanner scn = new Scanner(System.in);
                Integer sc = scn.nextInt();
                switch (sc) {
                    case 1:
                    Registration Registration1 = new Registration();
                    Registration1.userLogin();
                    User user1 = new User();
                    user1.UserData(Registration1.getHair_type());
                    break;
                    case 2:
                    Registration Registration2 = new Registration();
                    Registration2.regisration();
                    User user2 = new User();
                    user2.UserData(Registration2.getHair_type());
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;}
                    
} }