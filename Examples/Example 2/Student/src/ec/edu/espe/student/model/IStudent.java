/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.model;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Edison Vaca , Pablo Cadena
 */
public class IStudent {
    public void createStudentFile(ArrayList<Student> arrStudent){
        String studentFile= "Student.csv";
        
        File file = new File (studentFile);
        if(file.exists())file.delete();
   
        try  {
            CsvWriter writer = new CsvWriter(new FileWriter(studentFile,true),';');

            for(Student student : arrStudent){
                writer.write(student.getName());
                writer.write(student.getLastName());
                writer.write(student.getPhoneRe());
                writer.write(student.getGrades().get(0).toString());
                writer.write(student.getGrades().get(1).toString());
                writer.write(student.getGrades().get(2).toString());
                writer.write(student.calculateAverage().toString());
                writer.write(student.status(student.calculateAverage()));
                writer.endRecord();
            }
            writer.close();
        }
    catch(IOException e){
            
        }
    }
    
    public ArrayList <Student> readStudentFile(){
        ArrayList<Student> arr = new ArrayList<Student>();
        try{
            String studentFile= "Student.csv";
            File f=new File(studentFile);
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Student student = new Student();
                    String[] contact = line.split(";");
                    
                    student.setName(contact[0]);
                    student.setLastName(contact[1]);
                    student.setPhoneRe(contact[2]);
            
                    ArrayList<Float> grades  = new ArrayList<Float>();
                    grades.add(Float.parseFloat(contact[3]));
                    grades.add(Float.parseFloat(contact[4]));
                    grades.add(Float.parseFloat(contact[5]));
            
                    student.setGrades(grades);
            
                    arr.add(student);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return arr;
    }
}
