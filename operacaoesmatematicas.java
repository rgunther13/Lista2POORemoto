public class operacaoesmatematicas {
    
    public static int soma (int a, int b, int c) {
        int soma;
        soma = (a+b+c);
        return soma;
    }

    public static double soma(double a, double b) {
        double soma;
        soma = (a+b);
        return soma;
    }

    public  static double soma(int a, double b) {
        double soma;
        soma = (a+b);
        return soma;
    }

    public  static double soma(double a, int b) {
        double soma;
        soma = (a+b);
        return soma;
        
    }

    public  static double subtracao(int a, int b, int c) {
        int sub;
        sub = (a-b-c);
        return sub;
        
    }

    public  static double subtracao(double a, double b) {
        double sub;
        sub = (a-b);
        return sub;
    }

    public  static double subtracao(int a, double b) {
        double sub;
        sub = (a-b);
        return sub;
    }

    public  static double subtracao(double a, int b) {
        double sub;
        sub = (a-b);
        return sub;
    }

    public  static int divisao(int a, int b, int c) {
        int div;
        div = (a/b);
        return div;
        
    }

    public  static double divisao(double a, double b) {
        double div;
        div = (a/b);
        return div;
    }

    public  static double divisao(int a, double b) {
        double div;
        div = (a/b);
        return div;
    }

    public  static double divisao(double a, int b) {
        double div;
        div = (a/b);
        return div;
    }

    public  static int multiplicacao(int a, int b, int c) {
        int mult;
        mult = (a*b*c);
        return mult;
    }

    public  static double multiplicacao(double a, double b) {
        double mult;
        mult = (a*b);
        return mult;
    }

    public  static double multiplicacao(int a, double b) {
        double mult;
        mult = (a*b);
        return mult;
    }

    public  static double multiplicacao(double a, int b) {
        double mult;
        mult = (a*b);
        return mult;
    }

    public static void main(String[] args) {
        System.out.println(soma(1,2,2));
    }
}