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
public abstract class Barco {
    protected String matricula;
    private double eslora;
    private int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

  
    public double getEslora() {
        return eslora;
    }

  

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

   public double moduloNormal(){
        return eslora * 10;
    }
   
   public abstract double moduloEspecial();

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + ' ';
    }

   
    
    
    
}
