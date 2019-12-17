/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanicSystem.controler;

import ec.edu.espe.mechanicSystem.controler.Car;
import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class FileMechanic {
    
    public void createCarFile(ArrayList<Car> arrayBook){
        String bookFile= "Car.csv";
        File file = new File (bookFile);
        if(file.exists())file.delete();
        
             try  {
            CsvWriter writer = new CsvWriter(new FileWriter(bookFile,true),';');
            for(Car newBook : arrayBook){
                writer.write(newBook.getBrand());
                writer.write(newBook.getColorCar());
                writer.write(newBook.getHystoriOfCar());
                writer.endRecord();
            }
            writer.close();
        }
    catch(IOException e){
            
        }
    }
   
       
    public ArrayList <Car> readBookFile(){
        
        ArrayList<Car> arrayBook = new ArrayList<>();
        
        try{
            String bookFile= "Book.csv";
            File book = new File(bookFile);
            
            if(book.exists())
            {
                FileReader fileReader = new FileReader(book);
                try (BufferedReader buffeReader = new BufferedReader(fileReader)) {
                    String pass;
                    while((pass = buffeReader.readLine())!=null)
                    {
                        Car car = new Car();
                        String[] contact = pass.split(";");
                        
                        car.setBrand(contact[0]);
                        car.setCountry(contact[1]);
                        car.setColorCar(contact[2]);
                        arrayBook.add(car);
                    }
                }
            
            }
        }catch(IOException e){
            System.out.println(e);}
        
        return arrayBook;
    }
    
    
}
