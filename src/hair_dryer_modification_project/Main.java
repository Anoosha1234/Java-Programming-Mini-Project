package hair_dryer_modification_project;

import java.io.IOException;
/**
 *
 * @author Anoosha Sajid
 */
public class Main {   
public static void main (String[] args) throws IOException {
    
        
        String greeting = "Hello";
        
        System.out.println("*** Welcome to the hairdryer ***\n");
        System.out.println(greeting);
        
        Registration.UserList();
        while(Registration.Registration1.isPointer()){
        Registration.userLogin();
        Registration.User();
        Registration.continueMessage();
	}
        Registration.exitMessage();

} }