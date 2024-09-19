package models;
public class Profesor extends Miembro implements IConsultable {
 
    private String codigo;
    private TipoProfesor estado;

    public Profesor(String codigo, String nombre, TipoProfesor estado){
        super(nombre);
        this.codigo = codigo;
        this.estado = estado;
    }

    @Override
    public String consultarDatos(){
        return "Profesor ("+id+"): " + codigo + " - "+ nombre + " - " + estado + " - "+ getFechaNacimiento();
    }
}
