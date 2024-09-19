
public class Aeropuerto implements IConsultable{
	private String nombre;
	private String direccion;
	private TipoAeropuerto tipoAeropuerto;
	private Ciudad ciudad;
	private Operadora op;

	public Aeropuerto(String nombre,String direccion, TipoAeropuerto tipoAeropuerto,Ciudad ciudad, Operadora op){
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipoAeropuerto = tipoAeropuerto;
		this.ciudad = ciudad;
		this.op = op;
	}

	@Override
	public String consultarDatos(){
		return "Aeropuerto: " + nombre + " - " + ciudad.getNombre() + " - " + tipoAeropuerto + "\n" +
			op.consultarDatos();
	}
}