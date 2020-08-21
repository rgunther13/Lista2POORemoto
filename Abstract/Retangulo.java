package Abstract;

public class Retangulo extends Forma{
    double ladoMaior;
    double ladoMenor;

    public Retangulo(String cor, double ladoMaior, double ladoMenor) {
        super(cor);
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double calcularArea(){
        return getLadoMaior()*getLadoMenor();
    }
    
}