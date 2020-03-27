package Repositories;

import Config.MySQLConnection;

import java.sql.*;

public class ParentRepository {


    private Connection con;

    public ParentRepository() {
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createParent(int parent_id, String parent_first_name, String parent_last_name, String parent_phone, String parent_email, int address_id) throws SQLException {
        String sql = "INSERT INTO parent_table(parent_id, parent_first_name, parent_last_name, parent_phone, parent_email, address_id)" + "VALUES (?,?,?,?,?,?)";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, parent_id);
        preparedStatement.setString(2, parent_first_name);
        preparedStatement.setString(3, parent_last_name);
        preparedStatement.setString(4, parent_phone);
        preparedStatement.setString(5, parent_email);
        preparedStatement.setInt(6, address_id);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public ResultSet readParent() throws SQLException {
        String sql = "SELECT * FROM rfb.parent_table";
        Statement stmt = con.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateParent(String parent_first_name, String parent_last_name, String parent_phone, String parent_email, int address_id, int parent_id) throws SQLException {
        String sql = "UPDATE rfb.parent_table SET parent_first_name=?, parent_last_name=?, parent_phone=?, parent_email=?, address_id=? WHERE parent_id=?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, parent_first_name);
        preparedStatement.setString(2, parent_last_name);
        preparedStatement.setString(3, parent_phone);
        preparedStatement.setString(4, parent_email);
        preparedStatement.setInt(5, address_id);
        preparedStatement.setInt(6, parent_id);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void deleteParent(int parent_id) throws SQLException {
        String sql = "DELETE FROM rfb.parent_table WHERE parent_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,parent_id);
        preparedStatement.execute();
        preparedStatement.close();
    }


}


