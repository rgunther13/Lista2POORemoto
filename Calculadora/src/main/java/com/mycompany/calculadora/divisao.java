package com.mycompany.calculadora;

public class divisao extends Calculo{

    public divisao(double primeiroNumero, double segundoNumero, String operacao) {
        super(primeiroNumero, segundoNumero, operacao);
    }
    
    public double dividir() {
        return super.getPrimeiroNumero()/super.getSegundoNumero();
        
    }
    
}