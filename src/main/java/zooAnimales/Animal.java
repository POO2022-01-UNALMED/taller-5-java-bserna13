package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
    public static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        totalAnimales++;
    }
    public Animal(){}

    public static String totalPorTipo() {
        return "Mamiferos: "+((ArrayList<Mamifero>) Mamifero.getListado()).size()+"\n" + 
				"Aves: "+Ave.getListado().size()+"\n" + 
				"Reptiles: "+Reptil.getListado().size()+"\n" + 
				"Peces: "+Pez.getListado().size()+"\n" + 
				"Anfibios: "+Anfibio.getListado().size();
    }
    public String toString(){
        return "Mi nombre es "+ this.nombre + ", tengo una edad de " +this.edad+ ", habito en "+this.habitat+" y mi genero es " + this.genero + (this.zona != null ? ", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo() : "");
    }

    public String movimiento() {
        return "desplazarse";
    }
    
}
