
public class Avion extends Vehiculo implements IConsultable{
	private int capacidadMaximaPasajeros;
	private double capacidadCargaMaxima;

	public Avion(Aerolinea aerolinea,String modelo, double capacidadCargaMaxima, int capacidadMaximaPasajeros){
		super(aerolinea,modelo);
		this.capacidadCargaMaxima = capacidadCargaMaxima;
		this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
	}
	

	@Override
	public String consultarDatos(){
		return "Avion: " + super.getModelo() + " - " + "Capacidad Max. Pasajeros: " + capacidadMaximaPasajeros + "\n" 
			+ super.consultarDatos();
	}
}