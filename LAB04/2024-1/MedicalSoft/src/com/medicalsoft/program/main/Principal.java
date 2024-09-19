package com.medicalsoft.program.main;

import com.medicalsoft.infraestructura.dao.SalaEspecializadaDAO;
import com.medicalsoft.infraestructura.model.SalaEspecializada;
import com.medicalsoft.infraestructura.mysql.SalaEspecializadaMySQL;
import java.util.Scanner;

/**
 * Coloque su codigo y nombre completo
 * Codigo PUCP:
 * Nombre Completo:
 */
public class Principal {
    public static void main(String[] args){
        /*Complete para que sea posible el registro en la base de datos 
        de una sala especializada cuyos datos se lean desde consola*/
        SalaEspecializada sala = new SalaEspecializada();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la sala: ");
        sala.setNombre(reader.next());
        System.out.println("Ingrese el espacio en m2: ");
        sala.setEspacioEnMetrosCuadrados(reader.nextDouble());
        System.out.println("Ingrese la torre donde esta ubicado la sala: ");
        sala.setTorre(reader.next().charAt(0));
        System.out.println("Ingrese el piso: ");
        sala.setPiso(reader.nextInt());
        System.out.println("Ingrese si tiene o no equipamiento de imagenolosgia (S/N): ");
        if(reader.next()=="S")
            sala.setPoseeEquipamientoImagenologia(true);
        else
            sala.setPoseeEquipamientoImagenologia(false);
       
        SalaEspecializadaDAO dao = new SalaEspecializadaMySQL();
        int resultado = dao.insertar(sala);
        if(resultado == -1)
            System.out.println("No se pudo insertar");
        else
            System.out.println("El resultado fue existoso");
    
    }
}
