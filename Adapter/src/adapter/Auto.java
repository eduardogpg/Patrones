
package adapter;

/**
 *
 * @author Eduardo
 */
public class Auto {
    private boolean Tuneado = false;
    
    public Auto(){
    
    }
    
    public void Encender(){
        System.out.println("Encendiendo Auto");
    }
    public void Apagar(){
         System.out.println("Auto Apagado");
    }
    public void Frenar(){
          System.out.println("Frenando Auto");
    }
    public void Acelerar() {
          System.out.println("Acelerando Auto");
    }
    
    public void CambioVelocidad(){
         System.out.println("Cambio de velocidad");
    }
    public void ActivarFrendoMano(){
         System.out.println("Freno de Mano Activado");
    }
    
}
