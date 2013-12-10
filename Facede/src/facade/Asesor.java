
package facade;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Asesor extends Thread{
        private String nombre= "Eduardo Ismael García Pérez";
        private int cedula= 123456;
        private int tarifa= 5500;
        private int Inversion =0;
        private int tiempo = 10;
        private Corredor nuevoCorredor;
        
        private boolean respuesta = false;
        
        public Asesor(){
            System.out.println("Hola soy "+ this.nombre+ " Tu nuevo Asesor");
        }
        public void Informar(){
            System.out.println("Te informare de como se trabaja en la Bolsa de valores");
            System.out.println("tiempo que desea tener su inversion  :");
            
            Scanner entrada = new Scanner(System.in);
            this.tiempo = entrada.nextInt();
        }
        
        public void Contratar(){
            System.out.println("Ya tenemos un trato, Necesito el capital para comenzar a trabajar");
        }
        
        public int InformarTarifa(){
            return this.tarifa;
        }
        public void Inversion(int dinero){
            this.Inversion= dinero;
            System.out.println("Trabajaremos con "+ this.Inversion);
            this.contrartaCorredorBolsa();
        }
        
        private void contrartaCorredorBolsa(){
            if(this.Inversion !=0){
                nuevoCorredor = new Corredor(this.Inversion, this.tiempo);
                nuevoCorredor.Invertir();
                nuevoCorredor.start();
            }
        }
        
        public int RegresaDinero(){
            return nuevoCorredor.regresarInversion();
        }
     
        
     public void run(){
       while(!respuesta){
            try {
                this.respuesta= nuevoCorredor.ObtenerDia();
                Thread.sleep(100);
            } catch (InterruptedException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }
        public boolean Respuesta()
        {
            return this.respuesta;
            
        }

}
