package Atividades_Classes.atividades_priv;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    //Getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    //Setters
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
