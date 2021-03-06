package Service;

import Models.Employee;
import Repositories.EmployeeRepository;


import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeService {
    EmployeeRepository er = new EmployeeRepository();

    public void createEmployee(Employee employee)  {
        try {
            er.createEmployee(employee.getEmployee_id(), employee.getEmployee_first_name(), employee.getEmployee_last_name(), employee.getEmployee_title(), employee.getEmployee_phone_number(), employee.getEmployee_email(), employee.getWorkplan_id(), employee.getAddress_id());
        }catch (SQLException e){
            System.out.println("problem med connetion");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());

        }
    }

    public void readEmployee() throws SQLException {
        ResultSet rs = er.readEmployee();

        //Extract data from result set
        while (rs.next()) {
            //Retrieve by column index
            int employee_id = rs.getInt(1);
            String employee_first_name = rs.getString(2);
            String employee_last_name = rs.getString(3);
            String employee_title = rs.getString(4);
            String employee_phone_number = rs.getString(5);
            String employee_email = rs.getString(6);
            int workplan_id = rs.getInt(7);
            int address_id = rs.getInt(8);

            //Display values
            System.out.print("Medarbejdernummer: " + employee_id);
            System.out.print(", Fornavn: " + employee_first_name);
            System.out.print(", Efternavn: " + employee_last_name);
            System.out.print(", Jobstilling: " + employee_title);
            System.out.print(", Nummer: " + employee_phone_number);
            System.out.print(", Email:" + employee_email);
            System.out.print(", Vagtplannummer: " + workplan_id);
            System.out.println(", Adresse: " + address_id);
        }
    }

    public void updateEmployee(Employee employee) throws SQLException {
        er.updateEmployee(employee.getEmployee_id(), employee.getEmployee_first_name(), employee.getEmployee_last_name(), employee.getEmployee_title(), employee.getEmployee_phone_number(), employee.getEmployee_email(), employee.getWorkplan_id(), employee.getAddress_id());
    }

    public void deleteEmployee(int employee_id) throws SQLException {
        er.deleteEmployee(employee_id);
    }
}

