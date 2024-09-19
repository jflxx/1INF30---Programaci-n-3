
public abstract class Vehiculo{
	private String modelo;
	private Aerolinea aerolinea;

	public Vehiculo(Aerolinea aerolinea,String modelo){
		this.modelo = modelo;
		this.aerolinea = aerolinea;
	}

	public String getModelo(){
		return modelo;
	}

	public String consultarDatos(){
		return aerolinea.consultarDatos();
	}
}