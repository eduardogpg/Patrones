
package proxy;

/**
 *
 * @author Eduardo
 */
public class CuentaCompartida {
    static int Saldo= 1000;
    
    static void depositarCuenta(int cantidad){
        CuentaCompartida.Saldo += cantidad;
    }
    
     static void retirarCuenta(int cantidad){
        CuentaCompartida.Saldo -= cantidad;
    }
    
     static int consultarSaldo(){
        return CuentaCompartida.Saldo;
    }
     
     
}
