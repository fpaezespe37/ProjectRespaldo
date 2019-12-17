/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.model;

/**
 *
 * @author Inforlan
 */
public class Auto {
    private String brand;
    private String model;
    private String color;
    private String owner;
    private int placa;

    public Auto(String brand, String model, String color, String owner,int placa) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.owner = owner;
        this.placa = placa;
    }

    public Auto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
}
