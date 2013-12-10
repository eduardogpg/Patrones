
package factorymethod;

/**
 *
 * @author Eduardo
 */
public class PizzaHut {
 
    public Pizza CrearPizza(String nuevaPizza){
        Pizza nueva = null;
        
        if(nuevaPizza.equals("Peperoni")){
            return new PizzaPeperoni();
        }else if(nuevaPizza.equals("Hawaiana")){
            return new PizzaHawaiana();
        }else
            return null;
    }
}
