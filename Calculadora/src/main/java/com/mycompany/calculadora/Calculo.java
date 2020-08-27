package com.mycompany.calculadora;

public class Calculo {
    public double primeiroNumero;
    public double segundoNumero;
    public String operacao;

    public Calculo(double primeiroNumero, double segundoNumero, String operacao) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.operacao = operacao;
    }

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}