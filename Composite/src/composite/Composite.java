
package composite;

/**
 *
 * @author Eduardo
 */
public class Composite {

    public static void main(String[] args) {
        System.out.println("Necesito una computadora ensamblada \n");
        Gabinete migabinete = new Gabinete();
        migabinete.GabineteCompleto();
        migabinete.verPartes();
        
        System.out.println("Necesito dos memoria ram KingStone");
        Ram ramUno = new Ram();
        Ram ramDos = new Ram();
        ramUno.EstablecerMarca("KingStone");
        ramDos.EstablecerMarca("KingStone");
        System.out.println("Necesito una memoria ram KingStone , pero ahora agregalas a mi Ensamblada");
        Ram RamEnsamblada = new Ram();
        RamEnsamblada.EstablecerMarca("KingStone");
        
        migabinete.aegragarNuevasPartes(RamEnsamblada);
        
        System.out.println("Necesito una Tarjeta Madre nueva de marca generica ");
        TarjetaMadre generica = new TarjetaMadre();
        
        System.out.println("¿Qué tiene ahora mi Gabinete personalizado? \n");
         migabinete.verPartes();
    
    }
    
}
