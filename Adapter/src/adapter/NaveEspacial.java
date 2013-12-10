
package adapter;

/**
 *
 * @author Eduardo
 */
public class NaveEspacial implements Nave{

    public NaveEspacial(){
        super();
        System.out.println("Creando una nave espacial");
    }
    
    public void Encender() {
        System.out.println("Encendiendo una nave espacial");
    }
    public void Volar(){
        System.out.println("Nave Espacial volando");
    }
    public void Apagar() {
        System.out.println("Apagando ...");
    }

  
    
}
