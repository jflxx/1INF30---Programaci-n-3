import java.util.ArrayList;

public class Equipo{
	private String nombre;
	private String interes;
	private ArrayList<Miembro> miembros;

	public Equipo(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<Miembro>();
	}

	public void agregarMiembro(Miembro m){
		miembros.add(m);
	}

	public String consultarDatos(){
		String reporte = "";
		for(Miembro miembro:miembros){
			if(miembro instanceof Profesor){
				reporte += ((Profesor)miembro).consultarDatos()+ "\n";
			}
			else if(miembro instanceof Alumno){
				reporte += ((Alumno)miembro).consultarDatos() + "\n";
			}
		}

		return reporte;
	}


}