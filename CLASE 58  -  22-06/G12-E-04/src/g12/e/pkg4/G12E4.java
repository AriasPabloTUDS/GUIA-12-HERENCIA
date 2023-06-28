/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package g12.e.pkg4;

import g12.e.pkg4.Entidades.Circulo;
import g12.e.pkg4.Entidades.Rectangulo;

/**
 *
 * @author Pablo
 */
public class G12E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo(10);
        Rectangulo r = new Rectangulo(8.5, 6.2);
        
        System.out.println("El área del circulo es: "+String.format("%.2f",c.calcularArea()));
        System.out.println("El perímetro del circulo es: "+String.format("%.2f",c.calcularPerimetro()));
        System.out.println("El área del rectangulo es: "+r.calcularArea());
        System.out.println("El perímetro del rectangulo es: "+r.calcularPerimetro());
        
    }
    
}
