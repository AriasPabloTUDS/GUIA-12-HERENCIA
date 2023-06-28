/*
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidades.Servicios;
import Entidades.Alquiler;
import Entidades.Barco;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class AlquilerServicio {
    
    private BarcoServicio barcoServicio = new BarcoServicio();
    private Alquiler alq;
    private double valorAlquiler;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private Barco barcAux;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
 
    
    public Alquiler crearAlquiler(){
        System.out.println("Nuevo alquiler");
        System.out.println("Ingrese el nombre del titular:");
        String nomb = leer.next();
        System.out.println("Ingrese el DNI del titular: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese fecha de Alquiler: (yyyy-mm-dd)");
        fechaIn = LocalDate.parse(leer.next());
        System.out.println("Ingrese fecha de Devolución: (yyyy-mm-dd)");
        fechaOut = LocalDate.parse(leer.next());
        System.out.println("Ingrese el amarre: ");
        int amarre = leer.nextInt();
        System.out.println("Ingrese el Barco");
        barcAux = barcoServicio.crearBarco();
        return alq = new Alquiler(nomb, dni, fechaIn, fechaOut, amarre, barcAux);
    }
    
    
    public double costoDelAlquiler(){
        long cantDias;
        cantDias = ChronoUnit.DAYS.between(fechaIn, fechaOut);
        return cantDias*barcAux.moduloEspecial();
    }
}
