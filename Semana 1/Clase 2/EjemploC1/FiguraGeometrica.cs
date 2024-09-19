public abstract class FiguraGeometrica : IFiguraGeometrica{
	private static int contador;

	private string nombre;
	private int id;

	public FiguraGeometrica(string nombre){
		this.nombre = nombre;
		this.id = contador;
		contador++;
	}

	public string Nombre(){
		get {return nombre;}
		set {nombre = value;}
	}

	// public static void main(string []args){
	// 	FiguraGeometrica fig = new FiguraGeometrica("Circulo");
	// 	fig.Nombre = "Triangulo"; // set
	// 	System.Console.Writeline(fig.Nombre); //get	
	// 
	
}
