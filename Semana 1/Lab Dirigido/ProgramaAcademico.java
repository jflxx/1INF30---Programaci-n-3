import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
/*
Autor: Alvaro Pesantes Advincula
Fecha: 21/08/24
*/
abstract class ProgramaAcademico implements IConsultable{
	private static int indice = 1;
	private int idProgramaAcademico;
	private String nombre;
	private String clave;
	private char modalidad;
	private double precio;
	
	public ProgramaAcademico(String nombre, String clave, char modalidad, double precio){
		this.idProgramaAcademico = indice;
		this.nombre = nombre;
		this.clave = clave;
		this.modalidad = modalidad;
		this.precio = precio;
		indice++;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getClave(){
		return clave;
	}
	
	public double getPrecio(){
		return precio;
	}
}