/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanicSystem.view;

import ec.edu.espe.mechanicSystem.model.Client;
import java.util.Scanner;
import ec.edu.espe.mechanicSystem.controler.Car;

/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args){
        while(true){
        selectionOpcion(); 
        }
        
    
    }
    
      private static void menu() {
        System.out.println("Machine");
        System.out.println("1) Registry car");
        System.out.println("2) Show hytori");
        System.out.println("3) Exit");

    }
      private static void selectionOpcion(){
          
          menu();
          
          int opc ;
          Scanner opcion = new Scanner(System.in);
          
          System.out.println("Insert a opcion: ");
          opc =  opcion.nextInt(); 
          
          switch(opc){
                  case 1:
                      System.out.println("Inserte un caro nuevo \n");
                      creatCar();
                      break;
                      
                  case 2:
                      System.out.println("Mostrar historial de carros");
                      break;
                   
                  case 3:
                      System.exit(opc);
                       
              } 
    }
      
    private static void creatCar() {
        
        Scanner scan = new Scanner(System.in);
        Car data1 = new Car();
        Client data2 = new Client();
        
        System.out.println("Insert the model of the car : ");
        String model = scan.nextLine();
        data1.setModel(model);
        
        System.out.println(" Insert brand to the car : ");
        String brand = scan.nextLine();
        data1.setBrand(brand);
        
        System.out.println("Country: ");
        String country = scan.nextLine();
        data1.setCountry(country);
        
        System.out.println("Insert color of the car:  ");
        String color = scan.nextLine();
        data1.setColorCar(color);
        
        System.out.println("Insert Year of the car: ");
        int year = scan.nextInt();
        data1.setYear(year);
        
        System.out.println("Insert lincese plate: ");
        String car = scan.nextLine();
        data1.setLincesePlate(car);
        
        System.out.println("Car damage: ");
        String damage = scan.nextLine();
        data1.setHystoriOfCar(damage);
        
        System.out.println("Name of the client: ");
        String name = scan.nextLine();
        data2.setName(name);
        
        System.out.println("DNI of the client: ");
        String dni = scan.nextLine();
        data2.setDni(name);
        
        System.out.println("\n The model is : " + data1.getModel()+ 
                "\n The brand is: " + data1.getBrand() + 
                "\n country of the car: " + data1.getCountry()+ 
                "\n Color of the car: " + data1.getColorCar() + 
                "\n Year of the car : " + data1.getYear() +
                "\n Lincese plate: " + data1.getLincesePlate() +
                "\n The damage is : " + data1.getHystoriOfCar() + "\n ");
        
        System.out.println(" Name of the clinet: " + data2.getName() + 
                "\n Dni: " + data2.getDni()+ "\n");
        
        
        
        
    }
    
}
