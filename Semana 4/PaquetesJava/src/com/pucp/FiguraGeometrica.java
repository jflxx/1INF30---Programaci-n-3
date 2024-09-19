package com.pucp;

public abstract class FiguraGeometrica implements IFiguraOperaciones {
	private String nombre;
	
	public FiguraGeometrica(String _nombre){
		this.nombre = _nombre;
	}

	public String getNombre(){
		return nombre;
	}
}