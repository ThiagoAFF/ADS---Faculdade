package atividades_subclasses;

public class ContaBancaria {
    //Atributos
    protected  int numeroConta;
    protected double saldo;
    protected String titular;

    //Getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    //Setters
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    //Métodos
    public void depositar(double qtd){
        this.saldo += qtd;
        System.out.println(qtd + " foram depositados na conta.");
    }

    public void sacar(double qtd){
         if (saldo - qtd <= 0) {
            System.out.println("Erro: Saldo insuficiente!");
        } else {
            this.saldo -= qtd;
            System.out.println(qtd + " foram sacado(s) da conta.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}

class ContaCorrente extends ContaBancaria{
    double tarifaM;

    public double getTarifaM(){
        return tarifaM;
    }

    public void setTarifaM(double tarifa){
        this.tarifaM = tarifa;
    }

    public void cobrarTarifaMensal(){
        if (saldo <= 0) {
            System.out.println("Saldo insuficiente para a cobrança da tarifa mensal!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            this.saldo -= tarifaM;
            System.out.println("Foram descontados " + tarifaM + " da conta");
        }
    }
}