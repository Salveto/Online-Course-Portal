/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;

/**
 *
 * @author vinay
 */
public class DatabaseManager {
    
    Connection con;

    public DatabaseManager() {
        this.con = new Connect().getCon();
    }
    
    
    
    
}
