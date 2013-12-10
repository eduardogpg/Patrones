
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class Salami extends Carne implements Productos{
    private int Precio;
    private boolean Refrigeracion;
    
    public String nombre() {
        return "Salami";
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
