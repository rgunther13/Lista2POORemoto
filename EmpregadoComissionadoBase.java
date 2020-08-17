public class EmpregadoComissionadoBase extends EmpregadoComissionado {
       
    double salarioBase;

    public EmpregadoComissionadoBase(String nome, int numeroSeguro, double vendasBrutas, double salarioBase,
            double taxaComissao) {
        super(nome, numeroSeguro, vendasBrutas, taxaComissao);
        this.salarioBase = salarioBase;
        
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double ganhos() {
        return salarioBase + super.ganhos();
        
    }

    @Override
    public String toString() {
        return String.format("%sSalario base %.2f\n",super.toString(), salarioBase);
    }

}