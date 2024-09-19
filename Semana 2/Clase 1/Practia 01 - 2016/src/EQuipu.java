import java.util.ArrayList;

public class EQuipu{
	private ArrayList<Miembro> ejecutivos;
	private ArrayList<Equipo> equipos;

	public EQuipu(){
		equipos = new ArrayList<Equipo>();
		ejecutivos = new ArrayList<Miembro>();
	}

	public void agregarEquipo(Equipo eq){
		equipos.add(eq);
	}

	public String consultarMiembrosEquipo(int index){
		if(index >= 0 && index < equipos.size())
			return equipos.get(index).consultarDatos();
		else return "Index no existe";	
	}
}
