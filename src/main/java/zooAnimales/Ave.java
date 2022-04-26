package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones ;
    public static int aguilas;
    private String colorPlumas;
    
    public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {listado.add(this);}

    public static ArrayList<Ave> getListado() {
        return listado;
    }
    public String movimiento() {
        return "volar";
    }
    public int cantidadAves() {
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        Ave.halcones++;
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        Ave.aguilas++;
        listado.add(aguila);
        return aguila;
    }


    

    


}
