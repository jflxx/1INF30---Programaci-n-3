
public class Aerolinea extends Empresa implements IConsultable{
	private String callsing;
	private boolean programaFidelidad;
	
	public Aerolinea(String nombre,String callsing,boolean programaFidelidad){
		super(nombre);
		this.callsing = callsing;
		this.programaFidelidad = programaFidelidad;
	}

	@Override
	public String consultarDatos(){
		return "Aerolinea: " + super.getNombre() + " - " + callsing + " - " + "Programa Fidelidad: " + programaFidelidad + "\n";
	}
}