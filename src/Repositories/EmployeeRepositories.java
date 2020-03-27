package Repositories;

import Config.MySQLConnection;

import java.sql.*;

public class EmployeeRepositories {

    private Connection con;

    public EmployeeRepositories() {
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createEmployee(int employee_id, String employee_first_name, String employee_last_name, String employee_title, String employee_phone_number, String employee_email, int workplan_id, int address_id) throws SQLException {
        String sql ="INSERT INTO employee_table(employee_id, employee_first_name, employee_last_name, employee_title, employee_phone_number, employee_email, workplan_id, address_id)"+"VALUES (?,?,?,?,?,?,?,?)";
        //A SQL statement is precompiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times.
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,employee_id);
        preparedStatement.setString(2,employee_first_name);
        preparedStatement.setString(3,employee_last_name);
        preparedStatement.setString(4,employee_title);
        preparedStatement.setString(5,employee_phone_number);
        preparedStatement.setString(6,employee_email);
        preparedStatement.setInt(7,workplan_id);
        preparedStatement.setInt(8,address_id);
        preparedStatement.execute();
        preparedStatement.close();
    }
    //Execute a query
    public ResultSet readEmployee() throws SQLException {
        String sql = "SELECT * FROM rfb.employee_table";
        Statement stmt = con.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateEmployee(int employee_id, String employee_first_name, String employee_last_name, String employee_title, String employee_phone_number, String employee_email, int workplan_id, int address_id) throws SQLException {
        String sql = "UPDATE rfb.employee_table SET employee_first_name=?, employee_last_name=?, employee_title=?, employee_phone_number=?, employee_email=?, workplan_id=?, address_id=? WHERE employee_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,employee_first_name);
        preparedStatement.setString(2,employee_last_name);
        preparedStatement.setString(3,employee_title);
        preparedStatement.setString(4,employee_phone_number);
        preparedStatement.setString(5,employee_email);
        preparedStatement.setInt(6,workplan_id);
        preparedStatement.setInt(7, address_id);
        preparedStatement.setInt(8, employee_id);
        preparedStatement.execute();
        preparedStatement.close();
    }
    public void deleteEmployee(int employee_id) throws SQLException {
        String sql = "DELETE FROM rfb.employee_table WHERE employee_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,employee_id);
        preparedStatement.execute();
        preparedStatement.close();
    }
}