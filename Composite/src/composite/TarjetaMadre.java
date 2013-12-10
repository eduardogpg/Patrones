
package composite;

/**
 *
 * @author Eduardo
 */
public class TarjetaMadre extends Componente{
    
    private String NombreMarca="Tarjeta Madre  Marca Generica";
    private int precio = 250;
  
    
    public TarjetaMadre(){
    
    }
    public TarjetaMadre(String marca){
        this.NombreMarca = marca;
    }
    
    public TarjetaMadre(String marca, int precio){
        this.NombreMarca = marca;
        this.precio = precio;
    }
     
    public void EstablecerMarca(String marca){
        this.NombreMarca= "Tarjeta Madre  Marca "+marca;
    } 

   
    void EstablecerPrecio(int precio) {
         this.precio = precio;
    }

   
    String verMarca() {
          return this.NombreMarca;
    }

 
}
