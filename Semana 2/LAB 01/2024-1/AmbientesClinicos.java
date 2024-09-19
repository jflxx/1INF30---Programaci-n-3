
public abstract class AmbientesClinicos{
	private double espacio;
	private char torre;
	private int pisoNum;

	public AmbientesClinicos(double espacio, char torre,int pisoNum){
		this.espacio = espacio;
		this.torre = torre;
		this.pisoNum = pisoNum;
	}

	public String consultarDatos(){
		return "TORRE:" + torre + " - " + "PISO: " + pisoNum;
	}
}