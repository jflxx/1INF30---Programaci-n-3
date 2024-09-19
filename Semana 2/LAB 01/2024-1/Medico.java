
public class Medico extends Persona{
	private String numColegiatura;
	private String numRegisEspecialidad;
	private Especialidad esp;

	public Medico(String dni, String nombre, String apellidoP, String apellidoM,
		Especialidad esp, String numColegiatura, String numRegisEspecialidad){
		super(dni,nombre,apellidoP,apellidoM);
		this.esp = esp;
		this.numColegiatura = numColegiatura;
		this.numRegisEspecialidad = numRegisEspecialidad;
	}

	public String consultarDatos(){
		return "MEDICO: " + super.getNombre() + " - " + "CMP: " + numColegiatura + " - "+ esp.getEspecialidad();
	}
}