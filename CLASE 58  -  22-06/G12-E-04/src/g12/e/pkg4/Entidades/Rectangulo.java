/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package g12.e.pkg4.Entidades;

import g12.e.pkg4.Entidades.Servicios.calculosFormas;

/**
 *
 * @author Pablo
 */
public class Rectangulo implements calculosFormas{
        
        private double base;
        private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
        

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura)* 2;
    }
    
}
