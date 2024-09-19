/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pucp.airsoft.config;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Afedo
 */
public class DBManager {
     // Instancia única de DBManager
    private static DBManager dbManager;
    private Connection con;
    private static final String URL = "jdbc:mysql://lp2-labs-inf282-2023-2.cn6qvb4fnlge.us-east-1.rds.amazonaws.com:3306/inf282";
    private static final String USER = "master";
    private static final String PASSWORD = "lp2labsinf282";


    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);     
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
    public static DBManager getInstance(){
        if(dbManager == null){
            createInstance();
        }
        return dbManager;
    }
    
    private synchronized static void createInstance(){
        if(dbManager == null){
            dbManager = new DBManager();
        }
    }
}
