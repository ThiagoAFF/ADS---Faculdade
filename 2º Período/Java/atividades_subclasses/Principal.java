package atividades_subclasses;

public class Principal {
    public static void main(String[] args){
        ContaCorrente ccThiago = new ContaCorrente();
        Conta ccKaue = new Conta();

        ccThiago.depositar(7000);
        ccThiago.sacar(100);
        ccThiago.transferir(1000, ccKaue);
    }
}
