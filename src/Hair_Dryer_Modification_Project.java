package hair_dryer_modification_project;

import java.io.Serializable;
import java.util.Scanner;

/*
 * @author Anoosha Sajid
 */

public class Hair_Dryer_Modification_Project implements Serializable {

    private Integer spray_intensity = 0;
    private Integer drynessLevel = 0;
    private boolean music_requested = false;
    private String massage_levels = null;
    private boolean bluetooth_connection = false;
    private boolean wireless_charging_requested = false;
    private Integer speed_Level = 0;
    private Integer m_levels = 0; //defaults set
    

    public Hair_Dryer_Modification_Project(){ // default constructor without arguments
     }
    
    public Hair_Dryer_Modification_Project(Integer spray_intensity, Integer drynessLevel, 
            boolean music_requested, String massage_levels, boolean bluetooth_connection, 
            boolean wireless_charging_requested, Integer speed_Level, Integer m_levels) { //constructor with arguments.
        this.spray_intensity = spray_intensity;
        this.drynessLevel = drynessLevel;
        this.music_requested = music_requested;
        this.massage_levels = massage_levels;
        this.bluetooth_connection = bluetooth_connection;
        this.wireless_charging_requested = wireless_charging_requested;
        this.speed_Level = speed_Level;
        this.m_levels = m_levels;
    }

    
    public Integer getSpeed_Level() { //getter for speed_level
        return speed_Level;
    }
    
    public void dryer_speed(Integer speed_level){ // method switches between dryer speeds
        this.speed_Level = speed_level;
        switch (this.speed_Level) {
            case 1:
                System.out.println("Minimum dryer speed is being used."); //
                break;
            case 2:
                System.out.println("Moderate dryer speed is being used."); //
                break;
            case 3:
                System.out.println("Maximum dryer speed is being used."); //
                break;
            default:
                System.out.println("Your dryer input was not recognized.");
                break;
        }
    }

    public Integer getSpray_intensity() { // getter for spray intensity
        return spray_intensity;
    }


    public void turnOnSpray(Integer Spray_In) { // method switches between spray intensity
        this.spray_intensity = Spray_In;
        switch (this.spray_intensity) {
            case 1:
                System.out.println("Minimum spray intensity is being used."); //
                break;
            case 2:
                System.out.println("Moderate spray intensity is being used."); //
                break;
            case 3:
                System.out.println("Maximum spray intensity is being used."); //
                break;
            default:
                System.out.println("Your input was not recognized.");
                break;
        }
    }

    public void turnOffSpray() { // method turns off spray
        System.out.println("Anti-Frizz spray is turned off.");
    }

    public Integer getDrynessLevel() {
        return drynessLevel;
    }

    /**
     * used to measure progress
     * @param dryness_level
     */
    public void progressMonitor(Integer dryness_level) {  // dryer interacts with the customer and asks how dry their hair is
        System.out.println("please write your current dryer progress between 1 to 100. 100 being the dryest."); //
        Scanner scanner = new Scanner(System.in);
        dryness_level = scanner.nextInt();
        this.drynessLevel = dryness_level; //Input

        if (this.drynessLevel < 50) {
            System.out.println("Your hair is super wet! let's get it dry! ");
        } else if (this.drynessLevel == 50) {
            System.out.println("Your hair is half dry. Let's give it a bit more time!");
        } else if (this.drynessLevel == 100) {
            System.out.println("Your hair is fully dry. Please turn me off now.");
        } else {
            System.out.println("Almost there! Keep using me! ");
            System.out.println("Don't forget to turn the dryer off.");
        }
    }
    

    public boolean isMusic_requested() {
        return music_requested;
    }
    

    public void play_music(boolean musicrequested) { // dryer plays music
        this.music_requested = musicrequested;
        /* If the user requests music, the loop will run and the dyer will play music. 
        If music player is disabled the dyer will not play music.*/

        if (this.music_requested) {
            System.out.println("Music is playing");
        } else {
            System.out.println("Music player is disabled.");
        }
    }

    public String getMassage_levels() {
        return massage_levels;
    }

    /**
     * method for massager activation
     *
     * @param levels
     */
    public void massager(Integer levels) {  // dryer switches between massage levels
        this.m_levels = levels;
        switch (this.m_levels) {
            case 1:
                this.massage_levels = "Massage levels are Low"; //Massage level: low
                break;
            case 2:
                this.massage_levels = "Message levels are Medium";  //Massage level: Medium
                break;
            case 3:
                this.massage_levels = "Massage levels are High";  //Massage level: High
                break;
            default:
                this.massage_levels = "Invalid Input";
                break;
        }
        System.out.println(massage_levels); // output massage level 1 as standard output
    }

    public boolean isBluetooth_connection() {
        return bluetooth_connection;
    }

    public boolean isWireless_charging_requested() {
        return wireless_charging_requested;
    }

    /**
     * method for wireless charging
     * @param wcr
     * @param bc
     */
    public void wireless_charging(boolean wcr, boolean bc) {
        this.wireless_charging_requested = wcr;
        this.bluetooth_connection = bc;

        /* While the hair dyer is connected to bluetooth, If the user requests wireless charging,
    the loop will run and the dyer will charge. If wireless charging is disabled
    the dyer will not charge. If the dyer is not connected to bluetooth, it will
    display a message saying not connected. */
        if (this.wireless_charging_requested && this.bluetooth_connection) {
            System.out.println("Dryer is charging wirelessly");
        } else if (this.wireless_charging_requested && !this.bluetooth_connection) {
            System.out.println("Bluetooth connection is disabled. Please connect to Bluetooth");
        } else {
            System.out.println("Wireless charging is disabled");
        }
    }
}
