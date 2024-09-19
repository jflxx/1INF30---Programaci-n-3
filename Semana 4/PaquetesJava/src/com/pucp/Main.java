package com.pucp;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] arg){
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Triangulo(10, 16, 5, 4, 3));
        figuras.add(new Circulo(12));
        for (FiguraGeometrica f : figuras) {
            System.out.println(f);
            System.out.println("\t area:"+f.calcularArea() + ", perimetro:"+f.calcularPerimetro());            
        }
    }
}