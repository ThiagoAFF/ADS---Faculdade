package Atividades_Classes;
import java.time.LocalDateTime;

public class Carro {
    LocalDateTime anoAtual = LocalDateTime.now();

    String modelo;
    int ano;
    String cor;

    void FichaTecnica(){
        System.out.println("----- Ficha Técnica -----");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de Lançamento do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void CalcularIdade(){
        int idadecarro = anoAtual.getYear() - ano;
        System.out.println("Idade do carro: " + idadecarro);
    }

    static void main(String args[]){
        Carro carro1 = new Carro();
        carro1.modelo = "Toyota Corolla";
        carro1.ano = 2022;
        carro1.cor = "Azul metálico";

        carro1.FichaTecnica();
        carro1.CalcularIdade();
    }
}
