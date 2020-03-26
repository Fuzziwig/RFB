package Repositories;

import Config.MySQLConnection;

import java.sql.*;

public class ChildRepository {


    private Connection con;

    public ChildRepository() {
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createChild(int cpr_nr, int date_of_entry, String child_first_name, String child_last_name, String location, String children_info)throws SQLException {
        String sql ="INSERT INTO children_table(cpr_nr, date_of_entry, child_first_name, child_last_name, location, children_info)"+"VALUES (?,?,?,?,?,?)";
        //A SQL statement is precompiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times.
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,cpr_nr);
        preparedStatement.setInt(2,date_of_entry);
        preparedStatement.setString(3,child_first_name);
        preparedStatement.setString(4,child_last_name);
        preparedStatement.setString(5,location);
        preparedStatement.setString(6,children_info);
        preparedStatement.execute();
        preparedStatement.close();
    }

    //Execute a query
    public ResultSet readChildren() throws SQLException {
        String sql = "SELECT * FROM rfb.children_table";
        Statement stmt = con.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateChild(int date_of_entry, String child_first_name, String child_last_name, String location, String children_info, int cpr_nr) throws SQLException {
        String sql = "UPDATE rfb.childrentable SET date_of_entry=?, child_first_name=?, child_last_name=?, location=?, children_info=? WHERE cpr_nr=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,date_of_entry);
        preparedStatement.setString(2,child_first_name);
        preparedStatement.setString(3,child_last_name);
        preparedStatement.setString(4,location);
        preparedStatement.setString(5,children_info);
        preparedStatement.setInt(6,cpr_nr);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void deleteChild(int cpr_nr) throws SQLException {
        String sql = "DELETE FROM rfb.children_table WHERE cprNrID=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,cpr_nr);
        preparedStatement.execute();
        preparedStatement.close();
    }
}
