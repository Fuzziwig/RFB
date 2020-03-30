package Models;

public class Employee extends Account {
    private int employee_id;
    private String employee_first_name;
    private String employee_last_name;
    private String employee_title;
    private String employee_phone_number;
    private String employee_email;
    private int workplan_id;
    private int address_id;

    public Employee() {
    }

    public Employee(String user, String password){
        super(user, password);
    }

    public Employee(int employee_id, String employee_first_name, String employee_last_name, String employee_title, String employee_phone_number, String employee_email, int workplan_id, int address_id) {
        this.employee_id = employee_id;
        this.employee_first_name = employee_first_name;
        this.employee_last_name = employee_last_name;
        this.employee_title = employee_title;
        this.employee_phone_number = employee_phone_number;
        this.employee_email = employee_email;
        this.workplan_id = workplan_id;
        this.address_id = address_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getWorkplan_id() {
        return workplan_id;
    }

    public void setWorkplan_id(int workplan_id) {
        this.workplan_id = workplan_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getEmployee_first_name() {
        return employee_first_name;
    }

    public void setEmployee_first_name(String employee_first_name) {
        this.employee_first_name = employee_first_name;
    }

    public String getEmployee_last_name() {
        return employee_last_name;
    }

    public void setEmployee_last_name(String employee_last_name) {
        this.employee_last_name = employee_last_name;
    }

    public String getEmployee_title() {
        return employee_title;
    }

    public void setEmployee_title(String employee_title) {
        this.employee_title = employee_title;
    }

    public String getEmployee_phone_number() {
        return employee_phone_number;
    }

    public void setEmployee_phone_number(String employee_phone_number) {
        this.employee_phone_number = employee_phone_number;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }
}