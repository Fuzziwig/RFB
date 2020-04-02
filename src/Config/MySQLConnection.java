package Config;

import java.sql.*;


public class MySQLConnection  {

    // edit these to change DB connection
    /*
    private String dbHost = "den1.mysql2.gear.host:3306";
    private String dbDatabase = "rfb";
    private String dbUser = "rfb";
    private String dbPassword = "Pt4v6_H_O1v6";
    */
    private Connection con;

    //"jdbc:mysql://den1.mysql2.gear.host/rfb?autoReconnect=true&useSSL=false","rfb","Pt4v6_H_O1v6");


    // Register JDBC driver
    public MySQLConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // create db connection. returns null on failure
    public Connection create() {
        try {
            con=DriverManager.getConnection(
                    "jdbc:mysql://den1.mysql2.gear.host:3306/rfb","rfb","Pt4v6_H_O1v6");
            //"jdbc:mysql://den1.mysql4.gear.host:3306/rfb1","rfb1","Bd8cF_I-9GrA");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

