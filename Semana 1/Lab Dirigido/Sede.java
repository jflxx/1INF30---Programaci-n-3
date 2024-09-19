import java.util.ArrayList;
/*
Autor: Alvaro Pesantes Advincula
Fecha: 21/08/24
*/
class Sede{
	private int idSede;
	private String nombre;
	private String direccion;
	private ArrayList<ProgramaAcademico> programasAcademicos;
	
	public Sede(int id, String nomb, String dir){
		idSede = id;
		nombre = nomb;
		direccion = dir;
	}
	
	public void setProgramasAcademicos(ArrayList<ProgramaAcademico> programasAcademicos){
		this.programasAcademicos = programasAcademicos;
	}
	
	
	
	public ArrayList<ProgramaAcademico> getProgramasAcademicos(){
		return programasAcademicos;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String consultarProgramas(){
		String cadena = "";
		for(ProgramaAcademico pa : programasAcademicos){
			cadena += pa.consultarDatos();
			cadena += "\n";
		}
		return cadena;
	}
}