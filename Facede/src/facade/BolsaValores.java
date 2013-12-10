
package facade;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class BolsaValores extends Thread{
    

    Empresa empresa;
    private int horasLaborales= 0;
    private boolean dia= false;
    static boolean finalDia = false;
    
    private int horasNecesarias= 0;
    public BolsaValores(){
    
    }
    public void InvertirEmpresa(String nombre, int monto, int tiempo){
            this.horasNecesarias= tiempo;

        if(nombre.equals("Google")){
            empresa = new Google();
            
        }else if(nombre.equals("Apple")){
            empresa = new Apple();
         }
         empresa.RecibirInversion(monto);
            
    }
    
    public void run(){
        while(this.horasLaborales< horasNecesarias){
           
            try {
                this.Comportamiento();
                    if(this.horasLaborales==horasNecesarias-1)
                        this.dia= true;
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BolsaValores.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.horasLaborales+=1;
        }
      System.err.println("La Bolsa de valores cierra su día");
      
    }
    private void Comportamiento(){
        Random randon = new Random();
        int numero = randon.nextInt(50);
        int n = randon.nextInt(25);
        
        if(numero < 40)
            this.perdida(n);
        else
            this.Ganancia(n);
    }
    
    private void perdida(int numero){
        int nuevo = empresa.RegresaDinero()-((empresa.RegresaDinero()* numero)/100);
        empresa.NuevoCapital(nuevo);
    }
    
    private void Ganancia(int numero){
        int nuevo = empresa.RegresaDinero()+((empresa.RegresaDinero()* numero)/100);
        empresa.NuevoCapital(nuevo);
    }
    
    public boolean FinalDia(){
        return this.dia;
    }
    
    public int regresaInversion(){
        return this.empresa.RegresaDinero();
    }
    
}
