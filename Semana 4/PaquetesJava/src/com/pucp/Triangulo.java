package com.pucp;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	private double[] lados;

	public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
		super("Triangulo");
		this.base = base;
		this.altura = altura;
		lados = new double[3];
		lados[0] = lado1;
		lados[1] = lado2;
		lados[2] = lado3;
	}

	@Override
	public double calcularArea(){
		return base*altura/2;
	}

	@Override
	public double calcularPerimetro(){
		return lados[0]+lados[1]+lados[2];
	}

	@Override
	public String toString(){
		return getNombre() + ": ("+ base + ", " + altura +") ("+lados[0]+","+lados[1]+","+lados[2]+")";
	}

}