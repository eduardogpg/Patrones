
package facade;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Corredor extends Thread{
    
    private String nombre ="Corredor de bolsa ";
    private int MontoJugar=0;
    private int tiempo=0;
    private boolean diaCorredor= false;
    
    BolsaValores BolsaTuxtla = new BolsaValores();
    
  
    public Corredor(int dinero, int tiempo){
        this.MontoJugar= dinero;
        this.tiempo= tiempo;
    }
    
    public void Invertir(){
        System.err.println("La bolsa de valores abre su día");
        BolsaTuxtla.InvertirEmpresa("Google", this.MontoJugar, this.tiempo);
        BolsaTuxtla.start();
        
    }
    public void run(){
        while(!diaCorredor){
            try {
                Thread.sleep(50);
                this.ObtenerResultado();
                diaCorredor= this.BolsaTuxtla.FinalDia();
              
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public boolean ObtenerDia(){
        return this.diaCorredor;
    }
    
    private void ObtenerResultado(){
        this.MontoJugar= this.BolsaTuxtla.regresaInversion();
    }
    
    public int regresarInversion(){
        return this.MontoJugar;
    }
    
    
    
}
