package ec.edu.espe.user.model;

/**
 *
 * @author Steven
 */
public class Registry {
    private String name;
    private String lastName;
    private String cellphone;
    private String id;
    private String email;

    public Registry(String name, String lastName, String cellphone, String id, String email) {
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.id = id;
        this.email = email;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
