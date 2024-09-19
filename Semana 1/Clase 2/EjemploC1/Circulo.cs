public class Circulo : FiguraGeometrica{
	private double radio;

	public Circulo(double radio): base("Circulo"){
		this.radio = radio;
	}

	public double gatRadio(){
		return radio;
	}

	public override double calcularArea(){
		return Math.PI * radio * radio;
	}

	public override double calcularPerimetro(){
		return 2 * Math.PI * radio;
	}

	

}