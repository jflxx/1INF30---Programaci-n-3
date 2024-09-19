import java.util.Date;

public class ExamenDiagnostico extends AtencionMedica  implements IConsultable{
	private TipoExamen tipoExamen;
	private SalaEspecializada salaEspecializada;

	public ExamenDiagnostico(Paciente paciente, Medico medico,Date fecha,SalaEspecializada salaEspecializada,TipoExamen tipoExamen){
		super(paciente,medico,fecha);
		this.tipoExamen = tipoExamen;
		this.salaEspecializada = salaEspecializada;
	}

	@Override
	public String consultarDatos(){
		String cadena = "";
		cadena += super.consultarDatos() + salaEspecializada.consultarDatos() + "\n" + "TIPO EXAMEN:" + tipoExamen +"\n";
		return cadena;
	}
}