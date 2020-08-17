public class EmpregadoComissionadoTeste {
    public static void main(String[] args) {
        EmpregadoComissionado empregado = new EmpregadoComissionado("João", 12345, 5000, 0.1);
        EmpregadoComissionadoBase empregado2 = new EmpregadoComissionadoBase("Lucio", 23456, 1000, 800, 0.05);
                  
        System.out.println(empregado);
        System.out.println(empregado2);

    }
}