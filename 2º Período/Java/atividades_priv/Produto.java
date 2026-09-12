package atividades_priv;
import java.util.Scanner;

public class Produto {
    private String nome;
    private Float preco;

    Scanner input = new Scanner(System.in);

    //Getters
    public String getNome(){
        return nome;
    }

    public Float getPreco(){
        return preco;
    }

    //Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Float preco){
        this.preco = preco;
    }

    //Reduzir preço por percentual

    public void aplicarDesconto(){
        System.out.print("Digite o valor em porcentagem do desconto: ");
        int desconto = input.nextInt();

        this.preco -= this.preco * desconto / 100;
    }
}
