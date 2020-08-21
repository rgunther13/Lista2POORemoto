package CalculoArea;

public class Quadrado extends Quadrilatero {
    double lado;

    public Quadrado(double ladoA, double ladoB, double lado) {
        super(ladoA, ladoB);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    public double calcularArea() {
        return lado*lado;
        
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + "]";
    }


    
}