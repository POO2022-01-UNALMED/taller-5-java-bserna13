package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion ){
        this.nombre=nombre;
        this.ubicacion=ubicacion;

    }
        
    public Zoologico(){}

    public int cantidadTotalAnimales(){
        return Animal.totalAnimales;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }



}
