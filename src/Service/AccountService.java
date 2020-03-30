package Service;

import Models.Employee;
import Repositories.AccountRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService {
    AccountRepository ar = new AccountRepository();

    public void createAccount(Employee employee) throws SQLException{
        ar.createAccount(employee.getUser(),employee.getPassword(),employee.getEmployee_id());
    }

    public void readAccount() throws SQLException{
        ResultSet rs = ar.readAccount();

        while(rs.next()){
            String user = rs.getString(1);
            String password = rs.getString(2);
            int employee_id = rs.getInt(3);

            System.out.println(user);
            System.out.println(password);
            System.out.println(employee_id);

        }
    }

    public void updateAccount(Employee employee) throws SQLException{
        ar.udpateAccount(employee.getUser(),employee.getPassword(),employee.getEmployee_id());
    }

    public void deleteAccount(int employee_id) throws SQLException{
        ar.deleteAccount(employee_id);
    }
}
