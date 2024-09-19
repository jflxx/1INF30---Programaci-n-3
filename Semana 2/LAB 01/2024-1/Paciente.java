import java.util.ArrayList;

public class Paciente extends Persona{
	private int numHistoriaClinica;
	private ArrayList<AtencionMedica> atencionesMedicas;

	public Paciente(String dni, String nombre, String apellidoP, String apellidoM, int numHistoriaClinica){
		super(dni,nombre,apellidoP,apellidoM);
		this.numHistoriaClinica = numHistoriaClinica;	
	}

	public void setAtencionesMedicas(ArrayList<AtencionMedica> atm){
		atencionesMedicas = atm;
	}

	public ArrayList<AtencionMedica> getAtencionesMedicas(){
		return atencionesMedicas;
	}

	public String consultarDatos(){
		return "PACIENTE: " + super.getDni() + " - " + super.getNombre();
	}

	public void listarCitasMedicasProgramadas(){
		for(AtencionMedica x:atencionesMedicas){
			 System.out.println(x.consultarDatos());
		}
	}
}