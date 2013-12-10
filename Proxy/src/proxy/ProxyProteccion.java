
package proxy;

/**
 *
 * @author Eduardo
 */
public class ProxyProteccion {
    
    public ProxyProteccion(){}
    
    public boolean Respuesta(int numeroMatricula){
      return this.AlgoritmoControl(numeroMatricula);
    }
   
    private boolean AlgoritmoControl(int Matricula){
        int n = Elevacion( numeroDigitos(Matricula) );
        System.err.println((Matricula/n));
        if((Matricula/n)== 10)
            return true;
        else
            return false;
    }
    private int numeroDigitos(int Matricula){
        int c = 0;
        while (Matricula>0){
         Matricula = Matricula /10;   
         c++;
        }
    return c;
    }
    private int Elevacion(int num){
        int numero=1;
        for(int x=0;x<num-2;x++){
            numero = numero*10;
        }
        
        return numero;
    }
    
    //Proxy Remoto
    //Proxy Virtual
    //proxy de protección
    //Referencia inteligente
}
