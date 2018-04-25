package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccessDB {
    static AccessDB instance = new AccessDB();
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/ap?useSSL=false";
    static Connection con;

    /**
     * we want to use JDBC protocol, mysql DBMS , the local host with
     * the database ap
     */

    public static void main(String[] args) throws SQLException {
        try {

            //***  Establishing the connection
            con = null;
            Statement s = null;
            Class.forName(JDBC_DRIVER);

            // in the url we have to tell which account and password to use
            con = DriverManager.getConnection(DATABASE_URL, "jesper", "keapassword");

            //*** now that the connection is established we do the query
            s = con.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM person");

            // if the resultset is not empty, we position to first row and display first field
            if (rs != null)
                while (rs.next()) {
                    //System.out.println("Data from name: " + rs.getString("vendor_name") +
                    //      "        " + rs.getString("vendor_city"));
                    System.out.println(rs.getString("person_id"));
                    System.out.println(rs.getString("first_name"));
                    System.out.println(rs.getString("last_name"));
                }
            s.close();
            con.close();
        }
        /* correct errorhandling takes up a lot of space */ catch (SQLException sqlex) {
            try {
                System.out.println(sqlex.getMessage());
                con.close();
                System.exit(1);  // terminate program
            } catch (SQLException sql) {
            }
        } catch (ClassNotFoundException noClass) {
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);  // terminate program
        }
    }

    public void createConnection() {
        con = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Vendors> executeStamementVendorList() {
        createConnection();
        Statement s = null;
        ArrayList<Vendors> vendorList = new ArrayList<>();
        try {
            s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT vendor_name,  vendor_city  from vendors where default_account_number > '500'");
            if (rs != null) {
                while (rs.next()) {
                    try {
                        vendorList.add(new Vendors(rs.getString("vendor_name"), rs.getString("vendor_city")));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            }
            s.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vendorList;
    }

    public static AccessDB getInstance() {
        return instance;
    }


}