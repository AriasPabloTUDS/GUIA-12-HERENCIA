/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.BarcoVelero;
import Entidades.BarcoYate;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class BarcoServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private Barco aux;

    public Barco crearBarco() {
        int opcBarco = 0;

        do {
            System.out.println("Seleccione el tipo de Barco a cargar:");
            System.out.println("1_ Barco Velero");
            System.out.println("2_ Barco Motor");
            System.out.println("3_ Barco Yate");
            opcBarco = leer.nextInt();
            switch (opcBarco) {
                case 1:
                    System.out.println("Crear Barco Velero");
                    System.out.println("Ingrese la matricula:");
                    String matV = leer.next();
                    System.out.println("Ingrese el valor de eslora:");
                    double esloV = leer.nextDouble();
                    System.out.println("Ingrese el año de fabricación");
                    int anioV = leer.nextInt();
                    System.out.println("Ingrese la cantidad de Mastil / es:");
                    int cantMastV = leer.nextInt();
                    aux = new BarcoVelero(matV, esloV, anioV, cantMastV);
                    break;
                case 2:
                    System.out.println("Crear Barco a Motor");
                    System.out.println("Ingrese la matricula:");
                    String matM = leer.next();
                    System.out.println("Ingrese el valor de eslora:");
                    double esloM = leer.nextDouble();
                    System.out.println("Ingrese el año de fabricación");
                    int anioFM = leer.nextInt();
                    System.out.println("Ingrese la potencia CV:");
                    int potenCVM = leer.nextInt();
                    aux = new BarcoMotor(matM, esloM, anioFM, potenCVM);
                    break;
                case 3:
                    System.out.println("Crear Barco Yate");
                    System.out.println("Ingrese la matricula:");
                    String matY = leer.next();
                    System.out.println("Ingrese el valor de eslora:");
                    double esloY = leer.nextDouble();
                    System.out.println("Ingrese el año de fabricación");
                    int anioFY = leer.nextInt();
                    System.out.println("Ingrese la potencia CV:");
                    int potenciaY = leer.nextInt();
                    System.out.println("Ingrese la cantidad de camarotes");
                    int cantCam = leer.nextInt();
                    aux = new BarcoYate(matY, esloY, anioFY, potenciaY, cantCam);
                    break;
                default:
                    System.out.println("Error opcion incorrecta");
                    opcBarco = 0;
            }

        } while (opcBarco == 0);
        return aux;
    }
    
    public String mostrarBarco(){
        return aux.toString();
    }
    
    
   
}
