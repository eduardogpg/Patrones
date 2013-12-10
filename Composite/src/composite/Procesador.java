
package composite;

/**
 *
 * @author Eduardo
 */
public class Procesador extends Componente {
    private String NombreMarca="Procesador Marca Generica";
    private int precio = 250;
    
    public Procesador(){
    
    }
    public Procesador(String marca){
        this.NombreMarca = marca;
    }
    
    public Procesador(String marca, int precio){
        this.NombreMarca = marca;
        this.precio = precio;
    }
     
       public void EstablecerMarca(String marca){
        this.NombreMarca= "Procesador  Marca "+marca;
    } 

   
    void EstablecerPrecio(int precio) {
         this.precio = precio;
    }

   
    String verMarca() {
          return this.NombreMarca;
    }
   
    
        
}
