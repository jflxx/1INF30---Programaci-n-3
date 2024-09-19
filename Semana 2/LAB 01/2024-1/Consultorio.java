
public class Consultorio extends AmbientesClinicos{
	private String numero;

	public Consultorio(double espacio, char torre,int pisoNum, String numero){
		super(espacio,torre,pisoNum);
		this.numero = numero;
	}

	public String consultarDatos(){
		return "CONSULTORIO:" + numero + " - " + super.consultarDatos();
	}
}