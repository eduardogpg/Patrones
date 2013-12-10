
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class Queso extends Lacteo implements Productos{
    private String Nombre;
    
    public void NombreQueso(String nombre){
        this.Nombre = nombre;
        
    }
    
    public String nombre() {
        return Nombre;
    }

    String FechaVencimiento() {
        return "8 de Noviembre";
    }

    String Producto() {
        return "Queso";
    }

    public void Precio(int precio) {
    }

    public void Refrigeracion(boolean b) {
    }

    boolean Ligozo() {
        return true;
    }
    
}
