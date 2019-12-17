package ec.edu.espe.mechanicSystem.model;

/**
 *
 * @author Mechanics.java
 */
public class Client {
    private String name;
    private String dni;

    public Client(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public Client() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
   
    
}
