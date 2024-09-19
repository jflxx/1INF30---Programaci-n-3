
public class Remolque extends Vehiculo implements IConsultable{
	private double velocidadMaxima;
	private double cargaMaxima;

	public Remolque(Aerolinea aerolinea,String modelo,double velocidadMaxima,double cargaMaxima){
		super(aerolinea,modelo);
		this.velocidadMaxima = velocidadMaxima;
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String consultarDatos(){
		return "Remolque: " + super.getModelo() + " - " + "Capacidad de Carga: " + cargaMaxima + "Kg." + "\n";
	}

}