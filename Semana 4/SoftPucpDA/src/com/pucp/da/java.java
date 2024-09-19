
package com.pucp.da;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class java {
    
    public static  void main(String[] args){
        try{
            class.forName{"com.mysql.cj-jdbc.Driver"};
            String cadenaConexion = "jdbc:mysql://" + host + ":port/db";
            Connection conn = DriverManager.getConnection(cadenaConexion);
            String sql = "select id, nombre, activo from Alumno";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("Id: " + id);
            }
            
        } catch (Exception ex){
            System.out.println("Error encontrado: "+ex);
        }
    }
}
