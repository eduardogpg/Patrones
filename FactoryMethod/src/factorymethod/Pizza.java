
package factorymethod;

/**
 *
 * @author Eduardo
 */
public abstract class Pizza {
    
    abstract  void Horneado();
    abstract void PrepararMasa();
    abstract void PreparaIngredientes();
    
    abstract String NombrePizza();
    
}
