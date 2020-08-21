package Abstract;

public class Circulo extends Forma{
    double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea() {
        return 2 * 3.1415 * getRaio();
        
    }
}