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
        static  ArrayList<User> listOfUsers = new ArrayList<User>();
        private Integer ID = 0;
        static Registration Registration1 = new Registration();
        static User User1 = new User();
        private boolean pointer = true;


    public String getUsername() { return username;}
    public Integer getID() { return ID;}
    public boolean isPointer() { return pointer;}
    public void setUsername(String username) { this.username = username;}
    public void setID(Integer ID) { this.ID = ID;}
    public void setPointer(boolean pointer) { this.pointer = pointer;}
    

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
        
        for (User i : listOfUsers) {
        	if (i.getUsername().equals(Registration1.getUsername())) {
                System.out.println("Hello " + Registration1.getUsername());
                loggedInUser = 1;
                break;
        	}
        }       
        if (loggedInUser == 0) {
        	
            System.out.println("Enter Hair Type");
            Integer hair_type = Input.nextInt();
            if (hair_type == 0) {
            	System.out.println("Since you have entered a wrong value. Please try again");
            	listOfUsers.add(new User(Registration1.getUsername(), Registration1.getID()));
            	Registration1.setID(Registration1.getID()+1);
            }
            
        listOfUsers.add(new User());
        listOfUsers.stream().filter((i) -> (i.getUsername()==null)).map((i) -> {
            i.setUsername(Registration1.getUsername());
                return i;
            }).map((i) -> {
                i.setHair_type(hair_type);
                return i;
            }).map((i) -> {
                System.out.println(" Hello " + i.getUsername());
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
        
        public static void continueMessage() {
		System.out.println("Press 0 to exit, 1 to continue as another User:");
		if(Input.nextInt()== 0) {
                    Registration1.setPointer(false);
                    }
	}
        
        public static void exitMessage() {
		System.out.println("Thank you for using me, Have a nice day!");
	}
    
    
    
}