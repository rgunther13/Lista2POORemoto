package com.mycompany.calculadora;

public class subtracao extends Calculo{

    public subtracao(double primeiroNumero, double segundoNumero, String operacao) {
        super(primeiroNumero, segundoNumero, operacao);
    }
    public double subtrair() {
        return getPrimeiroNumero()-getSegundoNumero();
        
    }
    
}