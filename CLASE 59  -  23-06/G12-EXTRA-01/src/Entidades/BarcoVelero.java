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
public class BarcoVelero extends Barco{
    
    private int cantMastil;

    public BarcoVelero() {
    }
    
    

    public BarcoVelero(String matricula, double eslora, int anioFabricacion, int cantMastil) {
        super(matricula, eslora, anioFabricacion);
        this.cantMastil = cantMastil;
    }
    

    public int getCantMastil() {
        return cantMastil;
    }

    @Override
    public String toString() {
        return "BarcoVelero{ "+ super.toString() + "cantMastil=" + cantMastil + '}';
    }

  
    @Override
    public double moduloEspecial(){
        return super.moduloNormal()+cantMastil;
    }
    
    
    
    
}
