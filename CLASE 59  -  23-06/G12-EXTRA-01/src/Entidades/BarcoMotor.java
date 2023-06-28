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
public class BarcoMotor extends Barco{
    
    private final double potenciaCV;

   
    
    public BarcoMotor(String matricula, double eslora, int anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double moduloEspecial(){
        return super.moduloNormal() + potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + super.toString() +"potenciaCV=" + potenciaCV + '}';
    }
    
    
    
    
}
