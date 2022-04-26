package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;    

    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero() {listado.add(this);}

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos++;
        listado.add(caballo);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        Mamifero.leones++;
        listado.add(leon);
        return leon;
    }
    public int cantidadMamiferos() {
        return listado.size();
    }




}

