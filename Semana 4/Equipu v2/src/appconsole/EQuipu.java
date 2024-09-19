package appconsole;

import java.lang.reflect.Array;
import java.util.ArrayList;
import models.*;
public class EQuipu {
    private ArrayList<Miembro> ejecutivos;
    private ArrayList<Equipo> equipos;

    public EQuipu(){
    	this.equipos = new ArrayList<Equipo>();
    	this.ejecutivos = new ArrayList<Miembro>();
    }

    public void agregarEquipo(Equipo eq){
        equipos.add(eq);
    }
    
    public String consultarMiembrosEquipo(int index){
        try {
            return equipos.get(index).consultarDatos();
        }
        catch(Exception e){        
            System.out.println("Index incorrecto, " + e);
        }
        return "";
    }
}
