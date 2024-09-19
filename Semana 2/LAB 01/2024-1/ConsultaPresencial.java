import java.util.Date;

public class ConsultaPresencial extends CitaMedica implements IConsultable{
	private boolean consultaEspecial;
	private Consultorio consultorio;

	public ConsultaPresencial(Paciente paciente, Medico medico,Date FYH_realizar,String motivo,
		Consultorio consultorio,boolean consultaEspecial){
		super(paciente,medico,FYH_realizar,motivo);
		this.consultaEspecial = consultaEspecial;
		this.consultorio = consultorio;
	}

	@Override
	public String consultarDatos(){
		String cadena = "";
		cadena += super.consultarDatos() + consultorio.consultarDatos() + "\n" + "REQ. ASISTENCIA:";
		if(consultaEspecial)
			cadena+="SI";
		else
			cadena+="NO";
		cadena+="\n";
		return cadena;
	}
}