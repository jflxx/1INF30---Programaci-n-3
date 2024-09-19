import java.text.SimpleDateFormat; 
import java.time.LocalTime; 
import java.util.Date;

public class Vuelo{
	private int id;
	private String codigo;
	private static int identificador = 1;
	private Date fecha;
	private LocalTime horaSalida;
	private LocalTime horaLlegada;
	private Avion avion;
	private Remolque remolque;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	public Vuelo(String codigo,Date fecha, LocalTime horaSalida, LocalTime horaLlegada){	
		this.codigo = codigo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		id = identificador;
		identificador++;
	}

	public void setAvion(Avion avion){
		this.avion = avion;
	}

	public void setRemolque(Remolque remolque){
		this.remolque = remolque;
	}

	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida){
		this.aeropuertoSalida = aeropuertoSalida;
	}

	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada){
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public String devolverInformacion(){
		String cadena = "Datos del vuelo LA2023 con ID:" +  id + "\n";
		cadena +="===================================================================\n";
		cadena += "Fecha:" + sdf.format(fecha) + " - " + "Hora Salida:" + horaSalida.toString() + " - "+ "Hora Llegada:" + horaLlegada.toString() + "\n";
		cadena += avion.consultarDatos() + remolque.consultarDatos();
		cadena +="===================================================================\n";
		cadena += "DESDE:"+"\n"+aeropuertoSalida.consultarDatos();
		cadena +="===================================================================\n";
		cadena += "HACIA:"+"\n"+aeropuertoLlegada.consultarDatos();
		return cadena;
	}
}