import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Miembro{
	private static int correlativo = 1;
	private int id;
	public String nombre;
	private Date fechaNac;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private char sexo;
	private String email;

	public Miembro(){
	}
	
	public Miembro(String nombre){
		this.id = correlativo;
		this.nombre = nombre;
		correlativo++;
	}

	public void setFechaNacimiento(String fechaString){
		// la otra forma es delegar la exception hacia afuera (throws Exception)
		try{
			this.fechaNac = sdf.parse(fechaString);
		} catch(Exception e){
			System.out.println("La fecha no cumple el formato");
		}	
	}

	public String getFechaNacimiento(){
		return sdf.format(fechaNac);
	}
}