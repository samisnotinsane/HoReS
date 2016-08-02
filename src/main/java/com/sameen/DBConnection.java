package com.sameen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by sameenislam on 22/07/2016.
 * Client code for interacting with MySQL database.
 */

public class DBConnection {

    private static final String DB_PROPERTIES_PATH = "/Users/sameenislam/Documents/Repositories/HoReS/src/res/db.properties";

    public static Connection getConnection() {
        Properties props = new Properties();
        FileInputStream fis = null;
//        InputStream input = null;
        Connection con = null;
        try {

            // http://stackoverflow.com/questions/8275499/how-to-call-getclass-from-a-static-method-in-java
//            Class currentClass = new Object() { }.getClass().getEnclosingClass();
//            input = currentClass.getClassLoader().getResourceAsStream(DB_PROPERTIES_PATH);

//            props.load(input);
            fis = new FileInputStream(DB_PROPERTIES_PATH);
            props.load(fis);

            // load the Driver Class
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

            // create the connection now
            con = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {

        String QUERY = "SELECT guest_id, name, address, phone FROM GUEST";

        //using try-with-resources to avoid closing resources (boiler plate code)
        try {

            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("address");
                int phone = rs.getInt("phone");
                System.out.println(id + "," + name + "," + email + "," + phone + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
