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

    

    


}
