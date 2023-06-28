/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class BarcoYate extends BarcoMotor {

    private final int cantidadCamarotes;

    public BarcoYate(String matricula, double eslora, int anioFabricacion, double potenciaCV, int cantidadCamarotes) {
        super(matricula, eslora, anioFabricacion, potenciaCV);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    public double moduloEspecial() {
        return super.moduloEspecial() + cantidadCamarotes;
    }

    @Override
    public String toString() {
        return "BarcoYate{" + super.toString() + "cantidadCamarotes=" + cantidadCamarotes + '}';
    }

}
