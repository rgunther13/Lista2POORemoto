package Abstract;

abstract class Forma {
    String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Forma [cor=" + cor + "]";
    }

    public abstract double calcularArea();

}