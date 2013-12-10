
package adapter;

/**
 *
 * @author Eduardo
 */
public class Tienda {
    
    public void verNaveEspacial(){
        System.err.println("Nave Espacial  :");
        NaveEspacial espacial = new NaveEspacial();
        espacial.Encender();
        espacial.Volar();
        espacial.Apagar();
        
    }
    public void verNaveAuto(){
        System.err.println("Auto  :");
        Auto ford = new Auto();
        ford.Encender();
        ford.Acelerar();
        ford.CambioVelocidad();
        ford.ActivarFrendoMano();
        ford.Apagar();
        
    }
    public void verHibirdo(){
        System.err.println("Hibrido  :");
        NaveAdapter adapter = new NaveAdapter();
        adapter.Encender();
        adapter.CambioVelocidad();
        adapter.Apagar();
    }
}
