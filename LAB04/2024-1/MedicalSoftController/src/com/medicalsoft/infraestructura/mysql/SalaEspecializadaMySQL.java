package com.medicalsoft.infraestructura.mysql;
import com.medicalsoft.config.DBManager;
import com.medicalsoft.infraestructura.dao.SalaEspecializadaDAO;
import com.medicalsoft.infraestructura.model.SalaEspecializada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalaEspecializadaMySQL implements SalaEspecializadaDAO{

    private Connection con;
    private String sql;
    
   
    @Override
    public int insertar(SalaEspecializada salaEspecializada) {
//        Implemente el método de registro de una sala especializada
        int resultado =-1; 
        try {
            con = DBManager.getInstance().getConnection();
            sql = "INSERT INTO sala_especializada(nombre,espacio_en_m2,torre,piso,posee_equipamiento_imagenologia,activa) values(?,?,?,?,?,?);";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,salaEspecializada.getNombre());
            pst.setDouble(2,salaEspecializada.getEspacioEnMetrosCuadrados());
            pst.setString(3,""+salaEspecializada.getTorre());
            pst.setInt(4, salaEspecializada.getPiso());
            pst.setBoolean(5,salaEspecializada.isPoseeEquipamientoImagenologia());
            pst.setBoolean(6, true);
            resultado = pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar" + ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SalaEspecializadaMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return resultado;
    }
    
}
