/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epe.booksystem.model;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Document {

    public Document() {
    }

    public void addNewUser(ArrayList<User> userList){
        String userFile= "Users.csv";
        File file = new File (userFile);
        if(file.exists())file.delete();
   
        try  {
            CsvWriter writer = new CsvWriter(new FileWriter(userFile,true),';');
            for(User newUser : userList){
                writer.write(newUser.getName());
                writer.write(newUser.getLastName());
                writer.write(newUser.getUser());
                writer.write(newUser.getPassword());
                writer.endRecord();
            }
            writer.close();
        }
    catch(IOException e){
            
        }
    }
    
    public ArrayList<User> readAllUsers(){
        ArrayList<User> userList = new ArrayList<>();
                
        try{
            String userFile= "Users.csv";
            File f=new File(userFile);
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String column;
                while((column = br.readLine())!=null)
                {
                    User user = new User();
                    String[] contact = column.split(";");
                    
                    user.setName(contact[0]);
                    user.setLastName(contact[1]);
                    user.setUser(contact[2]);
                    user.setPassword(contact[3]);
                    userList.add(user);
                }
                br.close();
            }
        }catch(IOException e){
            System.out.println(e);}
       return userList; 
    }
    public void showUserByName(String name){
        System.out.println("\nInformation about the "+name);
        
        ArrayList<User> userList = new ArrayList<>();
        userList = readAllUsers();
        for (int i = 0; i < userList.size(); i++) {
            User user = new User();
            user = userList.get(i);
            if (user.getName().equals(name)) {
                user.showInformationUser();
            }
        }
    } 
}
