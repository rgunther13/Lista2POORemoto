package Abstract;

public class Quadrado extends Forma{
    double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return getLado()*getLado();
    }
    
}