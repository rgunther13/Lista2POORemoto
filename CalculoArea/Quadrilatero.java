package CalculoArea;

public class Quadrilatero {
    double ladoA, ladoB;

    public Quadrilatero(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double calculoArea() {
        return (getLadoA() * getLadoB());
                
    }

    @Override
    public String toString() {
        return String.format("Lado A : %.2f | Lado B: %.2f | Área do quadrilátero: %.2f", getLadoA(),getLadoB(), calculoArea());
    }

    
    
}