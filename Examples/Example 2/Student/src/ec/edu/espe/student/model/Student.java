/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edison Vaca , Pablo Cadena
 */
public class Student {
    private String name;
    private String lastName;
    private String phoneRe;
    private ArrayList<Float> grade;

    public Student() {
    }

    public Student(String name, String lastName, String phoneRe, ArrayList<Float> grades) {
        this.name = name;
        this.lastName = lastName;
        this.phoneRe = phoneRe;
        this.grade = grades;
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

    public String getPhoneRe() {
        return phoneRe;
    }

    public void setPhoneRe(String phoneRe) {
        this.phoneRe = phoneRe;
    }

    public ArrayList<Float> getGrades() {
        return grade;
    }

    public void setGrades(ArrayList<Float> grades) {
        this.grade = grades;
    }
    
    public Float calculateAverage(){
        return (this.grade.get(0)+this.grade.get(1)+this.grade.get(2))/3;
    }
    
    public String status(Float average){
        return average >= 14? "Aprobado":"No Aprobado";
    }
    
    public void dataEntry(){ 
        Scanner scn = new Scanner(System.in);
        ArrayList<Float> grades = new ArrayList<Float>();
        try{
        System.out.println("Nombre        : ");
        this.name = scn.nextLine(); 
        System.out.println("Apellido      : ");
        this.lastName = scn.nextLine();
        System.out.println("telef. Repre. : ");
        this.phoneRe = scn.nextLine();
        System.out.println("Nota 1    : ");
        grades.add(Float.parseFloat(scn.nextLine()));
        System.out.println("Nota 2    : ");
        grades.add(Float.parseFloat(scn.nextLine()));
        System.out.println("Nota 3    : ");
        grades.add(Float.parseFloat(scn.nextLine()));
        this.grade = grades;
        
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
    }
}
