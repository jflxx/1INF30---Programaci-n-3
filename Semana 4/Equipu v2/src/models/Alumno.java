package models;

public class Alumno extends Miembro implements IConsultable {
    private String codigo;
    private double CRAEST;

    public Alumno(String codigo, String nombre, double CRAEST){
        super(nombre);
        this.codigo = codigo;
        this.CRAEST = CRAEST;
    }

    @Override
    public String consultarDatos(){
        return "Alumno ("+id+"): " + codigo + " - "+ nombre + " - " + CRAEST + " - "+ getFechaNacimiento();
    }
}
