package ec.edu.espe.mechanicSystem.model;

/**
 *
 * @author Mechanics.java
 */
public class Payment {
    private String method;
    private int value;

    public Payment(String method, int value) {
        this.method = method;
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
}
