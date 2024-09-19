package models;

import java.util.Date;
import java.text.SimpleDateFormat;


public abstract class Miembro  {
    private static int correlativo = 1;
    private static SimpleDateFormat formateador = 
            new SimpleDateFormat("dd/MM/yyyy HH:mm");

    protected int id;
    protected String nombre;
    private Date fechaNac;
    private char sexo;
    private String email;

    public Miembro(){}

    public Miembro(String nombre){
        this.id = correlativo++;
        this.nombre = nombre;
    }


    public void setFechaNacimiento(String fechaStr) { 
        //la otra forma es delegar la excpetion hacia afuera (throws Exception)
        try {
            this.fechaNac = formateador.parse(fechaStr);    
        } catch (Exception e) {
            System.out.println("La fecha no cumple el formato");
        }        
    }

    public String getFechaNacimiento(){
        if(fechaNac == null)
            return "";
        else
            return formateador.format(fechaNac);
    }
}
