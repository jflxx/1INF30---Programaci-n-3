
public class SalaEspecializada extends AmbientesClinicos{
	private String nombre;
	private boolean equipamiento;

	public SalaEspecializada(double espacio, char torre,int pisoNum, String nombre, boolean equipamiento){
		super(espacio,torre,pisoNum);
		this.nombre = nombre;
		this.equipamiento = equipamiento;
	}

	public String consultarDatos(){
		String cadena = "SALA ESPECIALIZADA:" + nombre + " - " + super.consultarDatos() + " - " + "EQ. IMAGENOLOGIA: ";
		if(equipamiento)
			cadena+="SI";
		else
			cadena+="NO";
		return cadena;
	}

}