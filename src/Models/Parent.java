package Models;

public class Parent {
    private int adressID;
    private String parentFirstName;
    private String parentLastName;
    private String phone;
    private String email;


    public Parent() {
    }

    public Parent(int adressID, String parentFirstName, String parentLastName, String phone, String email) {
        this.adressID = adressID;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.phone = phone;
        this.email = email;
    }

    public int getAdressID() {return adressID; }

    public void setAdressID(int adressID) { this.adressID = adressID; }

    public String getParentFirstName() { return parentFirstName; }

    public void setParentFirstName(String parentFirstName) { this.parentFirstName = parentFirstName; }

    public String getParentLastName() { return parentLastName;}

    public void setParentLastName(String parentLastName) { this.parentLastName = parentLastName; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}