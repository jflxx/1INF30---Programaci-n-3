
public class Operadora extends Empresa implements IConsultable{
	private boolean soporteLogistico;
	private boolean asistenciaNavegacion;

	public Operadora(String nombre, boolean soporteLogistico, boolean asistenciaNavegacion){
		super(nombre);
		this.soporteLogistico = soporteLogistico;
		this.asistenciaNavegacion = asistenciaNavegacion;
	}

	@Override
	public String consultarDatos(){
		return "Operadora: " + super.getNombre() + " - " + "Soporte Logistico: " + soporteLogistico + " - " + "Asistencia Navegacion: " 
				+ asistenciaNavegacion + "\n";
	}
}