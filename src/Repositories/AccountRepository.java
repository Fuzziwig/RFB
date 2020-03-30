package Repositories;

import Config.MySQLConnection;

import java.sql.*;

public class AccountRepository {

    private Connection con;

    public AccountRepository(){
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createAccount(String username, String user_pass, int employee_id) throws SQLException {
        String sql = "INSER INTO account_table(username, user_pass, employee_id)"+"VALUES(?,?,?)";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, user_pass);
        preparedStatement.setInt(3, employee_id);
        preparedStatement.execute();
        preparedStatement.close();


    }

    public ResultSet readAccount() throws SQLException {
        String sql = "SELECT * FROM rfb.account_table";
        Statement stmt = con.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void udpateAccount(String username, String user_pass, int employee_id) throws SQLException {
        String sql = "UPDATE account_table(username, user_pass, employee_id) WHERE employee_id=?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, user_pass);
        preparedStatement.setInt(3, employee_id);
        preparedStatement.execute();
        preparedStatement.close();


    }


    public void deleteAccount(int employee_id) throws SQLException{
        String sql = "DELETE FROM account_table WHERE employee_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,employee_id);
        preparedStatement.execute();
        preparedStatement.close();
    }

}
