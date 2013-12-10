
package abstractfactory;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Mercado {
    private ArrayList ingredientes;
    
    public Mercado(){
        this.ingredientes= new ArrayList();
    }
    
    public void ingredientesListaPizza(){
        this.comprarJamon();
        this.comprarMozzarella();
        this.comprarPiña();
        this.comprarSalami();
        this.comprarTomate();
        System.err.println("Todos los ingredientes para la pizza fueron tagregados al carrito");
    }
    
    public void comprarTomate(){
        Tomate tomate = new Tomate("Tomate Rojo");
         agregarCarrito(tomate);
    }
    public void comprarPiña(){
        Piña piña = new Piña();
         agregarCarrito(piña);
    }
    public void comprarMozzarella(){
        Mozzarella m = new Mozzarella();
         agregarCarrito(m);
    }
    public void comprarSalami(){
        Salami salami = new Salami();
         agregarCarrito(salami);
    }
    public void comprarJamon(){
        Jamon jamon = new Jamon("Pavo");
        agregarCarrito(jamon);
    }
    
    private void agregarCarrito(Productos nombre){
        this.ingredientes.add(nombre);
    }
    
    public void PreguntarCarateristicaQueso(){
        Mozzarella m =new Mozzarella();
        
        
        for(int x=0; x<this.ingredientes.size();x++){
            Productos pr = (Productos)this.ingredientes.get(x);
            
            if(pr.getClass().getName().equals(m.getClass().getName())){
               System.err.println("Producto :"+ m.Producto()+"\n"+"Nombre producto : " +m.Nombre()+"\n"+
               "Fecha de caducidad : "+ m.FechaVencimiento());
            }
          
        }
       
    }
}
