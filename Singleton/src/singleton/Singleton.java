
package singleton;
/*
 * @author Eduardo
 */
public class Singleton {

    
    
    public static void main(String[] args) {
     
        singleClass p = singleClass.getInstance();
        p.inProducto("Pan");
        
        singleClass w = singleClass.getInstance();
        w.inProducto("cafe");
        w.RecorrerLista();
    
   }
}
