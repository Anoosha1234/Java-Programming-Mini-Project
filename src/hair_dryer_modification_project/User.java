package hair_dryer_modification_project;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anoosha Sajid
 */
public class User extends Hair_Dryer_Modification_Project {
    
    private String username;
    private String password;
    private Integer hair_type;

    public User (String username, String password, Integer hair_type)
    {
        this.username = username;
        this.password = password;
        this.hair_type = hair_type;
    }

    String getUsername() {
        return username;}
    
    String getPassword() {
        return password;}

    public Integer getHair_type() {
        return hair_type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHair_type(Integer hair_type) {
        this.hair_type = hair_type;
    }
    
    
    
    public User (){ // empty constructor
    }
    
    
    public void UserData(Integer hairtype) throws IOException {
        this.hair_type = hairtype;
        
        switch (hairtype) { // switch function switches between different hair types and their required settings. 
            case 1:
                System.out.println("Your hair is Frizzy. The dryer has been modified to optimum settings for your hair"); //
                
                Hair_Dryer_Modification_Project user1 = new Hair_Dryer_Modification_Project(); // default constructor
                user1.dryer_speed(1); // call for the dryer speed funtion.
                user1.massager(1); // call fo the massager function
                
                System.out.println("Do You want to use the anti-frizz spray? "
				+ "\n1.Input 1 for 'Yes' "
				+ "\n2.Input 2 for 'No' ");
                Scanner scn = new Scanner(System.in);
                Integer sc = scn.nextInt();
                switch (sc) {
                    case 1:
                    user1.turnOnSpray(3); // turns on maximum intensity for frizzy hair
                    break;
                    case 2:
                    user1.turnOffSpray(); // turns spray off
                    break;
                    default:
                    System.out.println("Invalid Input");
                    user1.turnOffSpray();
                    break;
                 }
                
                user1.progressMonitor(0);
                
                System.out.println("Would you like music?"
                        + " Press Y for yes.");
                Scanner s0 = new Scanner(System.in);
		String yesorno0 = s0.next();
                    switch (yesorno0) {
                        case "y":    
                         user1.play_music(true); // plays music if input is lower-case y
                         break;
                        case "Y":
                         user1.play_music(true);  //plays music if input in upper-case y
                         break;
                        default:
                         user1.play_music(false); // does not play music
                        break;
                   }
                
                user1.wireless_charging(true, true);  // charges wirelessly
                break;
                
                
            case 2:
                System.out.println("Your hair is Straight. The dryer has been modified to optimum settings for your hair"); //
                
                Hair_Dryer_Modification_Project user2 = new Hair_Dryer_Modification_Project();
                
                user2.dryer_speed(2);
                user2.massager(2);
                
                System.out.println("Do You want to use the anti-frizz spray? "
				+ "\n1.Input 1 for 'Yes' "
				+ "\n2.Input 2 for 'No' ");
                Scanner scn1 = new Scanner(System.in);
                Integer sc1 = scn1.nextInt();
                switch (sc1) {
                    case 1:
                    user2.turnOnSpray(1);
                    break;
                    case 2:
                    user2.turnOffSpray();
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                 }
                
                user2.progressMonitor(0);
                
                System.out.println("Would you like music?"
                        + " Press Y for yes.");
                Scanner s = new Scanner(System.in);
		String yesorno = s.next();
                    switch (yesorno) {
                        case "y":    
                         user2.play_music(true);
                         break;
                        case "Y":
                         user2.play_music(true);
                         break;
                        default:
                         user2.play_music(false);
                        break;
                   }
                    
                user2.wireless_charging(true, true);
                break;
                
                
            case 3:
                System.out.println("Your hair is Curly. The dryer has been modified to optimum settings for your hair"); //
                Hair_Dryer_Modification_Project user3 = new Hair_Dryer_Modification_Project();
                
                user3.dryer_speed(3);
                user3.massager(3);
                
                System.out.println("Do You want to use the anti-frizz spray? "
				+ "\n1.Input 1 for 'Yes' "
				+ "\n2.Input 2 for 'No' ");
                Scanner scn2 = new Scanner(System.in);
                Integer sc2 = scn2.nextInt();
                switch (sc2) {
                    case 1:
                    user3.turnOnSpray(2);
                    break;
                    case 2:
                    user3.turnOffSpray();
                    break;
                    default:
                    System.out.println("Invalid Input");
                    break;
                 }
                
                user3.progressMonitor(0);
                
                System.out.println("Would you like music?"
                        + " Press Y for yes.");
                Scanner s1 = new Scanner(System.in);
		String yesorno1 = s1.next();
                    switch (yesorno1) {
                         case "y":    
                         user3.play_music(true);
                         break;
                        case "Y":
                         user3.play_music(true);
                         break;
                        default:
                         user3.play_music(false);
                        break;
                   }
                
                user3.wireless_charging(true, true);
                break;
        }
        
    }


}
