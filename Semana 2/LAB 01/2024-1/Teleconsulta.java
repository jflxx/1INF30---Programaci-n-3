import java.util.Date;

public class Teleconsulta extends CitaMedica implements IConsultable{
	private String enlace;
	private Plataforma plataforma;

	public Teleconsulta(Paciente paciente, Medico medico,Date FYH_realizar,String motivo,
		Plataforma plataforma,String enlace){
		super(paciente,medico,FYH_realizar,motivo);
		this.enlace = enlace;
		this.plataforma = plataforma;
	}

	@Override
	public String consultarDatos(){
		String cadena = "";
		cadena += super.consultarDatos() + "PLATAFORMA:"+ plataforma + " - ENLACE: " + enlace + "\n";
		return cadena;
	}
}