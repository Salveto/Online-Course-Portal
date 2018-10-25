/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import static java.lang.Class.forName;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinay
 */
public class Connect {
    private Connection con;
    private String url = "mysql:jdbc://localhost:3036";
    private String uname = "root";
    private String pwd = "";
    private String dbName = "onlinecourse";

    public Connect(String uname, String pwd, String dbName) {
//        this.con = con;
//        this.url = "mysql:jdbc://localhost:3036";
        this.uname = uname;
        this.pwd = pwd;
        this.dbName = dbName;
        createConnection();
    }

    public Connect(String dbname) {
        this.dbName = dbname;
        createConnection();
    }
    
    
    
    public Connect(){
       createConnection();
    }

    public Connection getCon() {
        return con;
    }
    
    
    
    
   private void createConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String urlFull = url+"/"+dbName;
        
        try {
            this.con = DriverManager.getConnection(urlFull, uname, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
