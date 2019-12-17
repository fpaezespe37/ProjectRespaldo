package ec.edu.espe.mechanicSystem.controler;

import ec.edu.espe.mechanicSystem.model.Client;

/**
 *
 * @author Mechanics.java
 */
public class Car {
    private String  model,brand,country,colorCar,hystoriOfCar,lincesePlate;
    private int year;
    private Client client;
    
    public Car() {
    }

    public Car(String model, String brand, String country, String colorCar, int year, Client client,String hystoriOfCar,String lincesePlate) {
        this.model = model;
        this.brand = brand;
        this.country = country;
        this.colorCar = colorCar;
        this.year = year;
        this.client = client;
        this.hystoriOfCar = hystoriOfCar;
        this.lincesePlate = lincesePlate;

    }

    public String getLincesePlate() {
        return lincesePlate;
    }

    public void setLincesePlate(String lincesePlate) {
        this.lincesePlate = lincesePlate;
    }
    

    public String getHystoriOfCar() {
        return hystoriOfCar;
    }

    public void setHystoriOfCar(String hystoriOfCar) {
        this.hystoriOfCar = hystoriOfCar;
    }
    
    

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorcar) {
        this.colorCar = colorcar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
