
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class Jamon extends Carne implements Productos{
    
    private String Nombre;
    private int Precio;
    private boolean Refrigeracion;
    
    public Jamon(String nombre){
        Nombre = nombre;
    }
    
    public String nombre() {
        return Nombre;
    }

    public void Precio(int precio) {
        this.Precio= precio;
    }

    public void Refrigeracion(boolean b) {
        this.Refrigeracion = b;
    }

    boolean Roja() {
        return true;
    }
}
