import java.util.ArrayList; //se debe importar solamente lo necesario, si no bajan puntes
/*
Autor: Alvaro Pesantes Advincula
Fecha: 21/08/24
*/
class InstitucionEducativa{
	private int idInstitucionEducativa;
	private String RUC;
	private String nombre;
	private ArrayList<Sede> sedes;
	
	public InstitucionEducativa(int id, String ru, String nomb){
		idInstitucionEducativa = id;
		RUC = ru;
		nombre = nomb;
	}
	
	public void setSedes(ArrayList<Sede> sedes){
		this.sedes = sedes;
	}
	public ArrayList<Sede> getSedes(){
		return sedes;
	}
	
	public String consultarProgramasDeSede(int indiceSede){
		String cadena = "Programas disponibles para " + sedes.get(indiceSede).getNombre() + "\n";
		cadena += sedes.get(indiceSede).consultarProgramas(); //el get es como poner [x] para encontrar un elemento con x indice
		return cadena;
	}
	
}