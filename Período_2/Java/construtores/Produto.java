package Período_2.Java.construtores;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto() {
        this("Processador AMD Ryzen 5", 400, 5);
    }

    public Produto(String nome, Double preco){
        this(nome, preco, 0);
    }

    public Produto(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    static void main(String [] args){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

       produto1.Produto();
       produto2.Produto("No-break 220v DC", 359.99);
       produto3.Produto("GTX 1050 TI", 2500.00, 5);
    }
}
