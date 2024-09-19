/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pucp.airsoft.companies.model.mysql;

import org.pucp.airsoft.companies.model.Aerolinea;
import java.sql.Connection;
import org.pucp.airsoft.config.DBManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pucp.airsoft.companies.model.dao.AerolineaDAO;

public class AerolineaMySQL implements AerolineaDAO{
    
    private Connection con;
    private String sql;
    
    @Override
    public int insert(Aerolinea aerolinea) {
        int resultado = -1;
        try {
            con = DBManager.getInstance().getConnection();
            sql = "INSERT INTO aerolinea(nombre,callsign,tiene_programa_fidelidad,fecha_fundacion,descripcion,activa) values(?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,aerolinea.getNombre());
            pst.setString(2, aerolinea.getCallsign());
            pst.setBoolean(3,aerolinea.isTieneProgramaFidelidad());
            java.util.Date utilDate = aerolinea.getFechaFundacion();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            pst.setDate(4, sqlDate);
            pst.setString(5,aerolinea.getDescripcion());
            pst.setBoolean(6,aerolinea.isActivo());
            resultado = pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar" + ex);
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AerolineaMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
    }

}
