/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

 */
package g12.extra.pkg01;

import Entidades.Alquiler;
import Entidades.Servicios.AlquilerServicio;

/**
 *
 * @author Pablo
 */
public class G12EXTRA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlquilerServicio alquilerServicio = new AlquilerServicio();
        Alquiler alq1 = new Alquiler();
       
        
        alq1 = alquilerServicio.crearAlquiler();
        System.out.println(alq1);
        System.out.println("Costo del alquiler");
        System.out.println("$ "+alquilerServicio.costoDelAlquiler());
 
    }
}
        
    
    

