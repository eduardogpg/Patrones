package composite;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Gabinete extends Componente{
    
    
    private String NombreMarca="Gabitene  Marca Generica";
    private int precio = 250;
    private ArrayList listaComponente;
    private boolean ensamblada = false;
    
    
    public Gabinete(){
        listaComponente= new ArrayList();
    }
    
    
    public void GabineteCompleto(){
        ensamblada= true;
        TarjetaMadre tarjeta = new TarjetaMadre();
        Procesador  procesador = new Procesador();
        Ram ram = new Ram();
        
       this.listaComponente.add(tarjeta);
       this.listaComponente.add(procesador);
       this.listaComponente.add(ram);
        
        
    }
    public void verPartes(){
        if(ensamblada){
            System.out.println("Los componentes que conforman tu nueva computadora son  : ");
            for(int x=0;x<this.listaComponente.size();x++){
                 Componente c = (Componente) this.listaComponente.get(x);
                System.err.println(c.verMarca());
            }
        }else{
            System.err.println("Necesitass crear tu pc primero ");
        }     
    }
    
    public void aegragarNuevasPartes(Componente nuevo){
        this.listaComponente.add(nuevo);
    }
    
    void EstablecerPrecio(int precio) {
        this.precio = precio;
    }

    void EstablecerMarca(String marca) {
        this.NombreMarca= marca;
    }

   
    String verMarca() {
          return this.NombreMarca;
    }
    
}
