package com.mycompany.calculadora;

public class soma extends Calculo{

    public soma(double primeiroNumero, double segundoNumero, String operacao) {
        super(primeiroNumero, segundoNumero, operacao);
    }

    public double somar() {
        return super.getPrimeiroNumero() + super.getSegundoNumero(); 
        
    }
    
}