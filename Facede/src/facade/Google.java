/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Eduardo
 */
public class Google implements Empresa{
    private int montoJugar= 1000;
    private int MontoInversion=0;
    
    public void RecibirInversion(int cantidad){
        MontoInversion= cantidad;
    }

    public int RegresaDinero() {
        return this.MontoInversion;
    }

    public void NuevoCapital(int cantidad) {
        this.MontoInversion= cantidad;
    }
    
}
