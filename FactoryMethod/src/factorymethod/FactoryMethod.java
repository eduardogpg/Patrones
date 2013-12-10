
package factorymethod;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class FactoryMethod {

    
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaHut sucursalNorte = new PizzaHut();
        Pizza nuevaPizza= null;
        System.err.println("Lista de pizzas : \nPeperoni \nHawaiana\nPide tu pizza:");
        Scanner entrada = new Scanner(System.in);
        
        if(entrada.hasNextLine()){
            String tipoPizza = entrada.nextLine();
            nuevaPizza = sucursalNorte.CrearPizza(tipoPizza);
            
            if(nuevaPizza !=null){
                 System.out.println("Ya tengo mi pizza de "+ nuevaPizza.NombrePizza());
            }else{
                System.err.println("Solo pizzas en existencia");
            }
        }
        
    }
}
