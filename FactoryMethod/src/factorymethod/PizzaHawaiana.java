
package factorymethod;

/**
 *
 * @author Eduardo
 */
public class PizzaHawaiana extends Pizza{
    private boolean Piña;
    private boolean Jamon;
    private boolean Queso;
    private String Nombre;
    
    public PizzaHawaiana(){
        Piña= true;
        Jamon= true;
        Queso= true;
        this.Nombre ="Hawaiana";
    }

   
    void Horneado() {
    }

   
    void PrepararMasa() {
    }

   
    void PreparaIngredientes() {
    }
    
    String NombrePizza() {
        return this.Nombre;
    }
}
