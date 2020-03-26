package Models;

public class Parent {
    private int adress_id;
    private String parent_first_name;
    private String parent_last_name;
    private String parent_phone;
    private String parent_email;



    public Parent() {
    }

    public Parent(int adress_id, String parent_first_name, String parent_last_name, String parent_phone, String parent_email, String address_id) {
        this.adress_id = adress_id;
        this.parent_first_name = parent_first_name;
        this.parent_last_name = parent_last_name;
        this.parent_phone = parent_phone;
        this.parent_email = parent_email;

    }

    public int getAdress_id() { return adress_id; }

    public String getParent_first_name() { return parent_first_name; }

    public String getParent_last_name() { return parent_last_name; }

    public String getParent_phone() { return parent_phone; }

    public String getParent_email() { return parent_email; }

    public void setAdress_id(int adress_id) { this.adress_id = adress_id; }

    public void setParent_first_name(String parent_first_name) { this.parent_first_name = parent_first_name; }

    public void setParent_last_name(String parent_last_name) { this.parent_last_name = parent_last_name; }

    public void setParent_phone(String parent_phone) { this.parent_phone = parent_phone; }

    public void setParent_email(String parent_email) { this.parent_email = parent_email; }

}