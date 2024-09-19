using System.Collections;

public class Programa{
	public static void main(string []args){
		ArrayList figuras = new ArrayList();
		figuras.add(new Circulo(12));
		figuras.add(new Circulo(6)):

		foreach(FiguraGeometrica fig in figuras){
			System.console.WriteLine(fig); // aca falta el toString no se como hacerlo ndea
			System.console.WriteLine("Area: " + fig.calcularArea()
				+ ", " + "Perimetro: "+ fig.calcularPerimetro());
		}
	}
}