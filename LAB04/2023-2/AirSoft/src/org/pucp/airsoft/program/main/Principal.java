package org.pucp.airsoft.program.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.pucp.airsoft.companies.model.Aerolinea;
import org.pucp.airsoft.companies.model.dao.AerolineaDAO;
import org.pucp.airsoft.companies.model.mysql.AerolineaMySQL;

public class Principal {
     /* Coloque sus datos – nombre y codigo PUCP */ 
    public static void main(String[] args){ 
        Aerolinea aerolinea = new Aerolinea(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
        int opcion = 0; 
        do{ 
            System.out.println("Bienvenido al Sistema de Registro de Aerolineas"); 
            System.out.println("-------------------------------------------------"); 
            System.out.println("1. Registrar aerolinea."); 
            System.out.println("2. Salir del sistema."); 
            System.out.print("Ingrese la opcion: "); 
            try{ 
                opcion = Integer.parseInt(teclado.readLine()); 
                if(opcion == 1){ 
                    System.out.print("Ingrese el nombre de la aerolínea: "); 
                    aerolinea.setNombre(teclado.readLine()); 
                    System.out.print("Ingrese el callsign: "); 
                    aerolinea.setCallsign(teclado.readLine()); 
                    System.out.print("¿Tiene programa de fidelidad? (S/N): "); 
                    
                    aerolinea.setTieneProgramaFidelidad(teclado.readLine().equals("S")); 
                    System.out.print("Ingrese la fecha de fundacion (yyyy-MM-dd): "); 
                    aerolinea.setFechaFundacion(sdf.parse(teclado.readLine())); 
                    System.out.print("Ingrese la descripcion: "); 
                    aerolinea.setDescripcion(teclado.readLine()); 
                    /* Completar con el Código necesario que permita el registro */ 
                    
                    AerolineaDAO dao = new AerolineaMySQL();
                    dao.insert(aerolinea);
                } 
            }catch(IOException | NumberFormatException | ParseException ex){ 
                System.out.println(ex.getMessage()); 
            } 
        }while(opcion!=2); 
    }   
}
