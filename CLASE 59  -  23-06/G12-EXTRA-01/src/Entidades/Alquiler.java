/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;


/**
 *
 * @author Pablo
 */
public class Alquiler {
    
    private String nombre;
    private long dniCliente;
    private LocalDate fechaAlq;
    private LocalDate fechaDevol;
    private int posAmarre;
    private Barco barco;


    public Alquiler(String nombre, long dniCliente, LocalDate fechaAlq, LocalDate fechaDevol, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaAlq = fechaAlq;
        this.fechaDevol = fechaDevol;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public Alquiler() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public long getDniCliente() {
        return dniCliente;
    }


    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public LocalDate getFechaDevol() {
        return fechaDevol;
    }

    public int getPosAmarre() {
        return posAmarre;
    }
   
    public Barco getBarco() {
        return barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dniCliente=" + dniCliente + ", fechaAlq=" + fechaAlq.getDayOfMonth()+"/"+fechaAlq.getMonth()+"/"+fechaAlq.getYear() + ", fechaDevol=" + fechaDevol.getDayOfMonth()+"/"+fechaDevol.getMonth()+"/"+fechaDevol.getYear()+", posAmarre=" + posAmarre + ", barco=" + barco + '}';
    }

  
    
}
