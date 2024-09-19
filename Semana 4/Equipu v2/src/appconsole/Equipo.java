package appconsole;
import models.*;
import java.util.ArrayList;
public class Equipo {
    private String nombre;
    private String interes;
    private ArrayList<Miembro> miembros;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.miembros = new ArrayList<Miembro>();
    }

    public void agregarMiembro(Miembro miembro){
        this.miembros.add(miembro);
    }

    public String consultarDatos(){
        String reporte = "";
        for (Miembro miembro : miembros) {            
            if(miembro instanceof Profesor || miembro instanceof Alumno)
                reporte += ((IConsultable)miembro).consultarDatos() + "\n";

        }
        return reporte;
    }
}
