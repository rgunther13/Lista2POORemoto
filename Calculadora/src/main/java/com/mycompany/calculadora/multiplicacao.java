package com.mycompany.calculadora;

public class multiplicacao extends Calculo{

    public multiplicacao(double primeiroNumero, double segundoNumero, String operacao) {
        super(primeiroNumero, segundoNumero, operacao);
    }
    
    public double multiplicar() {
        return super.getPrimeiroNumero()*super.getSegundoNumero();
        
    }
}