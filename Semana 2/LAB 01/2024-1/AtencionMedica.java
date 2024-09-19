import java.util.Date;
import java.text.SimpleDateFormat; 

public abstract class AtencionMedica{
	private Paciente paciente;
	private Medico medico;
	private Date fYH_creacion;
	private Date fYH_realizar;
	private String estado;
	private int id;
	private static int identificador = 1;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

	public AtencionMedica(Paciente paciente, Medico medico,Date fecha){
		this.paciente = paciente;
		this.medico = medico;
		estado = "PROGRAMADA";
		this.fYH_realizar = fecha;
		id = identificador;
		identificador++;
	}

	public String consultarDatos(){
		String cadena = "";
		cadena += "ID:" + id + " - " + "CREACION: " + " fecha creacion " + "ATENCION: " + sdf.format(fYH_realizar) + " - " +
			estado + "\n" + medico.consultarDatos() + "\n" + paciente.consultarDatos() + "\n";
		return cadena;
	}
}