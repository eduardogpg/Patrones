
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class Tomate extends Verdura implements Productos{
    private String Nombre;
    private int precio;
    private boolean Fresca;
    
    public Tomate(String nombre){
        Nombre =nombre;
    }
        
    public String nombre() {
        return Nombre;
    }

    public void Precio(int precio) {
        this.precio = precio;
    }

    public void Refrigeracion(boolean b) {
    }
    
    boolean deTierra(){
        return true;
    }
}
