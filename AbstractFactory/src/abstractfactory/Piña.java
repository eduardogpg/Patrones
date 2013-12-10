
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class Piña extends Fruta implements Productos{
    private String Nombre="Piña";
    private int Precio;
    private boolean Fresca;
    
    public String nombre() {
        return Nombre;
    }

    public void Precio(int precio) {
        this.Precio= precio;
    }

    void Frescas(boolean b) {
        this.Fresca = b;
    }

   public void Refrigeracion(boolean b) {
    }

   boolean Temporada() {
     return true;  
   } 
    
}
