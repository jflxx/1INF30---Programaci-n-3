package appconsole;
import models.*;

public class Main {    
    public static void main(String[] args){
        EQuipu equipu = new EQuipu();
        Equipo eq1 = new Equipo("equipo 1");
        Equipo eq2 = new Equipo("equipo 2");
        Equipo eq3 = new Equipo("equipo 3");
        
        Alumno al1 = new Alumno("20090606", "Juan Perez", 68.3);
        al1.setFechaNacimiento("02/11/2001 10:05");
        eq2.agregarMiembro(al1);
        eq2.agregarMiembro(new Profesor("HSANCHEZ", "Heider",  TipoProfesor.TC));
        eq2.agregarMiembro(new Alumno("20096969", "Viviana", 64.5));
        
        equipu.agregarEquipo(eq1);
        equipu.agregarEquipo(eq2);
        equipu.agregarEquipo(eq3);
        String reporte = equipu.consultarMiembrosEquipo(1);
        System.out.println(reporte);
    }
}
