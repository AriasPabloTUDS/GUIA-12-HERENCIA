/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

14

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package herejercicio2guia12.Entidades;

public class Televisor extends Electrodomestico {

    protected double pulgadas;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, Double precio, String color, char consumoE, Double peso) {
        super(precio, color, consumoE, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Cuantas pulgadas tiene: ");
        this.pulgadas = leer.nextDouble();
        System.out.println("Tiene sintonizador TDT? ");
        if (leer.next().charAt(0) == 'S') {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas >= 40) {
            precio = precio *1.3;
        }
        if (sintonizadorTDT) {
            precio += 500;
        }
    }

    @Override
    
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + super.toString()+'}';
    }
    
    

}
