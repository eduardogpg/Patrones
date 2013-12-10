
package adapter;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Adapter {

    public static void main(String[] args) {
        Tienda Store = new Tienda();
        System.out.println("Escoger entre 1)Nave Espacial, 2)Auto 3)Hibrido");
        Scanner en = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
            
             String entrada =en.nextLine();
                if(entrada.equals("Nave"))
                    Store.verNaveEspacial();
                else if(entrada.equals("Auto"))
                    Store.verNaveAuto();
                else if (entrada.equals("Hibrido"))
                    Store.verHibirdo();
               else if (entrada.equals("Salir"))
                   salir = true;
               else
                   System.err.println("Solo : Nave,Auto, Hibrido");
                System.out.println();
         }
    }
}
