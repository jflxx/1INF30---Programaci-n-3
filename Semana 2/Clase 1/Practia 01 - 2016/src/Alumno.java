
public class Alumno extends Miembro implements IConsultable{
	private float CRAEST;
	private String codigo;

	public Alumno(String codigo, String nombre, float CRAEST){
		super(nombre);
		this.codigo = codigo;
		this.CRAEST = CRAEST;
	}

	@Override
	public String consultarDatos(){
		String reporte = "ALumno: " + codigo + " - " + nombre + " - " + CRAEST;
		return reporte;
	}
}