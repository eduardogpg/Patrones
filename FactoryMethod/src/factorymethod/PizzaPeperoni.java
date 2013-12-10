
package factorymethod;

/**
 *
 * @author Eduardo
 */
public class PizzaPeperoni extends Pizza{
   private boolean Queso;
   private boolean Peperoni;
   private boolean Salami;
   private String Nombre="";
   
   public PizzaPeperoni(){
       this.Queso= true;
       this.Peperoni= true;
       this.Salami= true;
       
       this.Nombre ="Peperoni";
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
