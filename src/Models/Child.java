package Models;

public class Child {
    private int cpr_nr;
    private int date_of_entry;
    private String child_first_name;
    private String child_last_name;
    private String location;
    private String children_info;

    public Child() {
    }

    public Child(int cpr_nr, int date_of_entry, String child_first_name, String child_last_name, String location, String children_info) {
        this.cpr_nr = cpr_nr;
        this.date_of_entry = date_of_entry;
        this.child_first_name = child_first_name;
        this.child_last_name = child_last_name;
        this.location = location;
        this.children_info = children_info;
    }

    public int getCpr_nr() {
        return cpr_nr;
    }

    public void setCpr_nr(int cpr_nr) {
        this.cpr_nr = cpr_nr;
    }

    public int getDate_of_entry() {
        return date_of_entry;
    }

    public void setDate_of_entry(int date_of_entry) {
        this.date_of_entry = date_of_entry;
    }

    public String getChild_first_name() {
        return child_first_name;
    }

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getChild_last_name() {
        return child_last_name;
    }

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChildren_info() {
        return children_info;
    }

    public void setChildren_info(String children_info) {
        this.children_info = children_info;
    }
}
