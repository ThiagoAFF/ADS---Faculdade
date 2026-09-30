package Período_2.Java.construtores;

public class ContaBancaria {
    private int numero;
    private String titular;
    private Double saldo;

    public ContaBancaria(int numero, String titular, Double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public ContaBancaria(int numero, String titular){
        this(numero, titular, 0);
    }

    public ContaBancaria(){
        this(0, "NULL", 0);
    }

    public exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();

        conta1.ContaBancaria();
        conta2.ContaBancaria(0567, "Ricardo");
        conta3.ContaBancria(0566, "Leonan", 1500.00);

        conta1.exibirDados();
        conta2.exibirDados();
        conta3.exibirDados();
    }
}