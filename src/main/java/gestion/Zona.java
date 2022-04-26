package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo= new Zoologico();
	private ArrayList<Animal> animales = new ArrayList<Animal>();


    public Zona(String nombre, Zoologico zoo) {
        this.nombre=nombre;
        this.zoo=zoo;
    }
    public Zona(){}
    
    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }
    
    public int cantidadAnimales() {
        return animales.size();
    }
    public Zoologico getZoo() {
        return zoo;
    }



    
    
}
