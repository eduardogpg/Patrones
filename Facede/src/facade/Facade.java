
package facade;

/**
 *
 * @author Eduardo
 */
public class Facade {

   
    public static void main(String[] args) {
       
        Cliente eduardo = new Cliente();
        eduardo.contratarAsesor();
        eduardo.start();
    }
}
