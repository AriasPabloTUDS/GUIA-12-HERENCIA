/*
 Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package G12E03;

import herejercicio2guia12.Entidades.Electrodomestico;
import herejercicio2guia12.Entidades.Lavadora;
import herejercicio2guia12.Entidades.Televisor;
import java.util.ArrayList;
import javax.swing.text.StyledEditorKit;

public class HEREjercicio2Guia12 {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electros = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            
        }
        
        Lavadora l1 = new Lavadora(35, 10000.0, "blanco", 'e', 20.0);
        Lavadora l2 = new Lavadora(15, 10000.0, "gris", 'a', 35.5);
        Televisor t1 = new Televisor(35.0, true, 10000.0, "negro", 'd', 19.5);
        Televisor t2 = new Televisor(32.0, false, 85000.0, "negro", 'd', 14.5);
        
            electros.add(l1);
            electros.add(l2);
            electros.add(t1);
            electros.add(t2);
            
            double suma = 0;
            
        for (Electrodomestico elemento : electros) {
            
            suma += elemento.getPrecio();
        }

        System.out.println("La suma de los electrodomesticos es: "+ suma);
        
    }

}
