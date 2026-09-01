package Atividades_Classes.atividades_priv;

public class Principal {

    public static void main(String[] args) {
        
        ContaBancaria cb1 = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria();

        cb1.setSaldo(25000);
        double salario = cb1.getSaldo();

        System.out.println("Meu salário (se DEUS quiser!!!) é: " + salario);
    }
    
}
