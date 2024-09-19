import java.util.Date;

public abstract class CitaMedica extends AtencionMedica{
	private String motivo;

	public CitaMedica(Paciente paciente, Medico medico,Date fechastr,String motivo){
		super(paciente,medico,fechastr);
		this.motivo = motivo;
	}

}