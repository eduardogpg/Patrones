
package abstractfactory;

/**
 *
 * @author Eduardo
 */
public class AbstractFactory {

   
    public static void main(String[] args) {
       Mercado bodega_aurrera = new Mercado();
       System.out.println("Necesito todos los ingredientes para una pizza");
       bodega_aurrera.ingredientesListaPizza();
       
       System.out.println("¿Qué caracteristicas tiene el Queso?");
       bodega_aurrera.PreguntarCarateristicaQueso();
       
    }
}
