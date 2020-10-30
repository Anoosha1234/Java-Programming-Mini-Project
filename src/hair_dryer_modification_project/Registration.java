package hair_dryer_modification_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anoosha Sajid
 */
public class Registration {
    
        static Scanner Input = new Scanner(System.in);
        private String username;
        private String password;
        static  ArrayList<User> listOfUsers = new ArrayList<User>();
        private Integer ID = 0;
        static Registration Registration1 = new Registration();
        static User User1 = new User();
        private boolean pointer = true;


    public String getUsername() { 
        return username;
    }
    
    public String getPassword() { 
        return password;
    }
    
    public Integer getID() { 
        return ID;
    }
    
    public boolean isPointer() { 
        return pointer;
    }
    
    public void setUsername(String username) { 
        this.username = username;
    }
    
    public void setPassword(String password) { 
        this.password = password;
    }
    
    public void setID(Integer ID) { 
        this.ID = ID;
    }
    
    public void setPointer(boolean pointer) { 
        this.pointer = pointer;
    }
    

    public Registration() {
    }
    
    public static void UserList() {
	listOfUsers.add(new User());
        User defaultUser = listOfUsers.get(0);
        defaultUser.setUsername("Default");
        defaultUser.setHair_type(2);
        defaultUser.setIndex(Registration1.getID());
        Registration1.setID(Registration1.getID()+1);
    }
    
    public static void userLogin() {
        
        // Used to hold the instance of a user who successfully logged in
        int loggedInUser = 0;
        System.out.println("Enter Username");
        Registration1.setUsername(Input.next());
        System.out.println("Enter Password");
        Registration1.setPassword(Input.next());
        
        for (User i : listOfUsers) {
        	if (i.getUsername().equals(Registration1.getUsername())) 
                {
                     if (i.getPassword().equals(Registration1.password))
                        {
                            System.out.println("Hello " + Registration1.getUsername());
                            loggedInUser = 1;
                             break;
                 }
            }
        }       
        
        // if loggedInUser was changed from 0 , it was successful
        if (loggedInUser == 0) {
        	
            System.out.println("\nPlease cheack your hair type: " // user selects what hair type they have
				+ "\n1.Frizzy"
				+ "\n2.Straight"
				+ "\n3.Curly");
            Integer hair_type = Input.nextInt();
            if (hair_type == 0) {
            	System.out.println("You have input an invalid value. Please try again");
            	listOfUsers.add(new User(Registration1.getUsername(), Registration1.getPassword(), Registration1.getID()));
            	Registration1.setID(Registration1.getID()+1);
            }
            
        listOfUsers.add(new User());
        listOfUsers.stream().filter((i) -> (i.getUsername()==null)).map((i) -> {
            i.setUsername(Registration1.getUsername());
                return i;
            }).map((i) -> {
                i.setPassword(Registration1.getPassword());
                return i;
            }).map((i) -> {
                i.setHair_type(hair_type);
                return i;
            }).map((i) -> {
                System.out.println("Hello " + i.getUsername());
                return i;
            }).map((i) -> {
                i.setIndex(Registration1.getID());
                return i;
            }).forEachOrdered((_item) -> {
                Registration1.setID(Registration1.getID()+1);
            });
        }
        }
    
    	public static void User() throws IOException {
		User CurrentUser = null;
		 for (User i : listOfUsers) {
	        	if (i.getUsername().equals(Registration1.getUsername())) {
	        		CurrentUser = i;
	        		break;
	        	}
	       }
		
		User1.UserData(CurrentUser.getHair_type());
	}
        
    /**
     * To iterate from Array list
     */
    public static void iteration() {
		System.out.println("Press 0 to exit, 1 to continue as another User:");
		if(Input.nextInt()== 0) {
                    Registration1.setPointer(false);
                    }
	}
        
        public static void exitMethod() {
		System.out.println("Thank you for using me, Have a nice day!");
	}
    
    
    
}