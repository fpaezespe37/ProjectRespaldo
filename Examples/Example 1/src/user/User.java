package user;

import ec.edu.espe.user.model.Registry;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Registry> registrys = new ArrayList<Registry>();
        
        registrys.add(new Registry("Carlos","Macas","0984337857","1721736445","car_los@java.com"));
        registrys.add(new Registry("sebastian","Chalco","0999304735","1711517184","seb_chal@java.com"));
        registrys.add(new Registry("Sandra","Garces","0984914327","1724269875","sa_gar@java.com"));
        registrys.add(new Registry("Allan","Sangolqui","0995433255","1717854924","a_lan15@java.com"));
        
        ExportCsv(registrys);
        ImportCsv();
    
    }

    private static void ExportCsv(List<Registry> registrys) {
        String fileOutput = "Users.csv";
        boolean exist = new File(fileOutput).exists();
        
        if(exist){
            File fileUsers = new File(fileOutput);
            fileUsers.delete();
        }
        
        try {
            
            CsvWriter CsvOutput = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
            CsvOutput.write("Name");
            CsvOutput.write("Last Name");
            CsvOutput.write("Cellphone");
            CsvOutput.write("ID");
            CsvOutput.write("Emali");
            
            CsvOutput.endRecord();
            
            for(Registry user : registrys ) {
              CsvOutput.write(user.getName());
              CsvOutput.write(user.getLastName());
              CsvOutput.write(user.getCellphone());
              CsvOutput.write(user.getId());
              CsvOutput.write(user.getEmail());
              
              CsvOutput.endRecord(); 
            }
            
            CsvOutput.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void ImportCsv(){
        try {
            List<Registry> registrys = new ArrayList<Registry>();
            
            CsvReader readRegistrys = new CsvReader("Users.csv");
            readRegistrys.readHeaders();
            
            while(readRegistrys.readRecord()){
                String name = readRegistrys.get(0);
                String lastName = readRegistrys.get(1);
                String cellphone = readRegistrys.get(2);
                String id = readRegistrys.get(3);
                String email = readRegistrys.get(4);
                
                registrys.add(new Registry(name, lastName, cellphone, id, email));     
            }
            
            readRegistrys.close();
            
            for(Registry user : registrys){
                System.out.println(user.getName() + " , "
                + user.getLastName() + " , "
                +user.getCellphone() + " , "
                + user.getId() + "  "
                +user.getEmail());
            
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
     }
    
}
