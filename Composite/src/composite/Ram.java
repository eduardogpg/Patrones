
package composite;

/**
 *
 * @author Eduardo
 */
public class Ram extends Componente{
    private int precio = 100;
    private String NombreMarca="Ram  Marca Generica";
    
    
    public Ram(){
       
    }
    
    public Ram(String marca){
        this.NombreMarca = marca;
    }
    
    public Ram(String marca, int precio){
        this.NombreMarca = marca;
        this.precio = precio;
    }
    
     public void EstablecerMarca(String marca){
        this.NombreMarca= "Ram  Marca "+marca;
    } 

   
    void EstablecerPrecio(int precio) {
         this.precio = precio;
    }


    String verMarca() {
        return this.NombreMarca;
    }
    
}
