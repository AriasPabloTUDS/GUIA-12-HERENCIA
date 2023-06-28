/*
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package g12.e.pkg4.Entidades;

import g12.e.pkg4.Entidades.Servicios.calculosFormas;

/**
 *
 * @author Pablo
 */
public class Circulo implements calculosFormas {

    private double radio;
    private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio*2;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

  

//Área circulo: PI * radio ^ 2 
    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    // Perímetro circulo: PI * diámetro.
    @Override
    public double calcularPerimetro() {
        return (PI * diametro);
    }

}
