/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class singleClass {

  
    ArrayList lista = new ArrayList();
    private singleClass(){}
    
    private static singleClass Apuntador = null;
    
    public static singleClass getInstance() {
        if(singleClass.Apuntador ==null)
            Apuntador = new singleClass();
        return Apuntador;
    }
   
    public String MostrarProducto(int num){
        return (String)this.lista.get(num);
    }
    public void inProducto(String p){this.lista.add(p);}
    
    public void RecorrerLista(){
        System.err.println("Vamos a recorrer la lista de productos");
        for(int x=0;x<this.lista.size();x++)
            System.out.println((String)lista.get(x));
    }
}
