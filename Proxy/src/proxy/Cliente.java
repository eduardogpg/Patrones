
package proxy;

/**
 *
 * @author Eduardo
 */
public class Cliente {
    private String nombre;
    private int edad=0;
    private int numeroId=0;
    
    public Cliente(String nombre, int edad, int numeroId){
        this.nombre= nombre;
        this.edad = edad;
        this.numeroId= numeroId;
        
    }
    public Cliente(){
    }
    private void checkCuenta(int numero){
       if( CuentaCompartida.Saldo <= numero){
            CuentaCompartida.Saldo = 0;
       }else
           CuentaCompartida.Saldo -= numero;
    }
    
    public void retirar(int numero){
        this.checkCuenta(numero);
    }
    
    public void Depositar(int numero){
       CuentaCompartida.Saldo += numero;
    }
    public String ConsutarSaldo(){
        int numero = CuentaCompartida.consultarSaldo();
        return Integer.toString(numero);
    }
    
}
