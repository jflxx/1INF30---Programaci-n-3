
public abstract class Persona{
	private String dni;
	private String nombre;
	private String apellidoP;
	private String apellidoM;

	public Persona(String dni, String nombre, String apellidoP, String apellidoM){
		this.nombre = nombre;
		this.dni = dni;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
	}	 

	public String getNombre(){
		return nombre + " " + apellidoP + " " + apellidoM;
	}

	public String getDni(){
		return dni;
	}
}