
package adapter;

/**
 *
 * @author Eduardo
 */
public class NaveAdapter implements Nave{
    private Auto naveAdaptable;
    
    public NaveAdapter(){
        super();
        naveAdaptable = new Auto();
        System.out.println("Creando un Auto Nave Espacial");
    }
    
    public void Encender() {
        System.out.println("Encendiendo Auto");
        naveAdaptable.Encender();
    }

    public void Acelerar() {
         System.out.println("Acelerando");
         naveAdaptable.Acelerar();
    }

    public void Apagar() {
         System.out.println("Apagando Auto");
         naveAdaptable.Apagar();
    }
    
    public void CambioVelocidad(){
        naveAdaptable.CambioVelocidad();
    }
    
}
