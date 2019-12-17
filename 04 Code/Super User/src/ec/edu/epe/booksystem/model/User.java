
package ec.edu.epe.booksystem.model;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class User {
    private String name;
    private String lastName;
    private String user;
    private String password;

    public User() {
    }

    public User(String name, String lastName, String user, String password) {
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.password = password;
    }


    
    public void showInformationUser(){
        System.out.println("\nName:"+this.getName()
        +"\nLast Name:"+this.getLastName()
        +"\nUser:"+this.getUser()
        +"\nPassword:"+this.getPassword());
    }
    public void dataEntry(){
        Scanner scn = new Scanner(System.in);
        System.out.println("\nUser Information\n");
        try{
           
            System.out.println("Name: ");
            this.name=(scn.nextLine()); 
            System.out.println("Last Name");
            this.lastName=(scn.nextLine());
            System.out.println("User");
            this.user = scn.nextLine();
            System.out.println("Password");
            this.password = scn.nextLine();     
        }
        catch(Exception e){
            System.out.println("Invalid format");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

   
    
    
}
