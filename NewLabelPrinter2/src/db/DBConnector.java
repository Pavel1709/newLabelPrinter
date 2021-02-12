/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
//import com.ibm.as400.access.AS400JDBCDriver;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author pmolchanov
 */
public class DBConnector {
    String DRIVER;
    String URL;
    private String login;
    private String password;
    Connection connection;
    public DBConnector(String DRIVER, String URL, String login, String password) {
        this.DRIVER = DRIVER;
        this.URL = URL;
        this.login = login;
        this.password = password;
    }
    public String getDRIVER() {
        return DRIVER;
    }
    public String getURL() {
        return URL;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Connection getConnect() {
        return connection;
    }
    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public void connect() throws ClassNotFoundException, SQLException {
        try {
            System.out.println("Trying to connect");
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, login,password );
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } 

    }   
}
