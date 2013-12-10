
package facade;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Cliente extends Thread{
    
    private int MontoInversion;
    Asesor nuevoAsesor;
    boolean RegresoDinero = false;

    
    public Cliente(){
        System.out.println("El monto a invertir en la bolsa de valores :");
        Scanner entrada = new Scanner(System.in);
        MontoInversion = entrada.nextInt();
        
         
         System.out.println();
    }
    
    public void contratarAsesor(){
        nuevoAsesor = new Asesor();
        nuevoAsesor.Informar();
        nuevoAsesor.InformarTarifa();
        nuevoAsesor.Contratar();
        nuevoAsesor.Inversion(MontoInversion);
        nuevoAsesor.start();
    }
    
    public void run(){
          while(!this.nuevoAsesor.Respuesta()){
            try {
                Thread.sleep(450);
            } catch (InterruptedException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.verInversion();
    }
    public void verInversion(){
        System.out.println("Mi inversion al final del dia es de : "+ this.nuevoAsesor.RegresaDinero());
        if(this.nuevoAsesor.RegresaDinero() > this.MontoInversion)
            System.out.println("Gane: "+ (this.nuevoAsesor.RegresaDinero()- this.MontoInversion) );
         else
            System.out.println("Perdi: "+ (this.MontoInversion-this.nuevoAsesor.RegresaDinero()) );
        
    }
    }

