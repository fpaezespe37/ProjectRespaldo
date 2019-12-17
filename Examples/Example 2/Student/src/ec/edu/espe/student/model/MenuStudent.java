/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.student.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuStudent {
    public void showMenu() {  
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        int option;
        while(!exit){
            System.out.println("\n\t Promedios de Estudiantes\n");
            System.out.println("1| Ingresar Datos de Estudiante");
            System.out.println("2| Enlistar Notas");
            System.out.println("3| Salir");
           
            System.out.println("\nDigite una opcion: ");
            option = scn.nextInt();
           
            switch(option){
                case 1:
                    createStudent();
                    break;
                case 2:
                    readStudents();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
        }
    }
    public void createStudent(){
        Student student = new Student();
        ArrayList<Student> arrSt = new ArrayList<Student>();
        IStudent fileSt = new IStudent();
        File file = new File ("Student.csv");
        
        if(file.exists()){
            arrSt = fileSt.readStudentFile();
            student.dataEntry();
            arrSt.add(student);
            fileSt.createStudentFile(arrSt);
        }else{
            student.dataEntry();
            arrSt.add(student);
            fileSt.createStudentFile(arrSt);
        }
        
        
        System.out.println("Estudiante registrado Con Exito");
    }
    public void readStudents(){
        ArrayList<Student> arrSt = new ArrayList<Student>();
        IStudent fileSt = new IStudent();
        
        arrSt = fileSt.readStudentFile();
        
        for (int i = 0; i < arrSt.size(); i++) {
            Student student = new Student();
            student = arrSt.get(i);
            Float average = student.calculateAverage();
            System.out.println("Nombre       : "+ student.getName()+" "+student.getLastName());
            System.out.println("telf. Repre. : "+ student.getPhoneRe());
            System.out.println("Nota 1       : "+ student.getGrades().get(0));
            System.out.println("Nota 2       : "+ student.getGrades().get(1));
            System.out.println("Nota 3       : "+ student.getGrades().get(2));
            System.out.println("Promedio     : "+ average);
            System.out.println("Estado       : "+ student.status(average)+"\n");
        }
    }
}
