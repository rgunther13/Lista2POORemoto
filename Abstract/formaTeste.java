package Abstract;

public class formaTeste {

    public static void imprimeForma(Forma frm) {
        System.out.printf("Classe: %s | Cor: %s | Área: %.2f\n",frm.getClass(), frm.getCor(), frm.calcularArea());
        
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Vermelho", 5);
        Quadrado quadrado = new Quadrado("Azul", 6);
        Retangulo retangulo = new Retangulo("Amarelo", 4, 5);
        Triangulo triangulo = new Triangulo("Roxo", 10, 15);

        imprimeForma(circulo);
        imprimeForma(quadrado);
        imprimeForma(retangulo);
        imprimeForma(triangulo);
    }
    
}