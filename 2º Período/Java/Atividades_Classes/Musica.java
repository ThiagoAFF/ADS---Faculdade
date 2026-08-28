package Atividades_Classes;
import java.util.Scanner;

public class Musica {
    Scanner n = new Scanner(System.in);

    String titulo;
    String artista;
    String anoLancamento;
    float Navaliacao = 0;
    int numAvaliacoes = 0;
    float avaliacao(){
        if (numAvaliacoes == 0) return 0;
    return Navaliacao / numAvaliacoes;
    };

    void FichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao() + "★ de um total de " + numAvaliacoes + " Avaliações");
    }

    void AvaliarMusica(){
        System.out.println("Digite sua avaliação para " + titulo + ". O número deve ser entre 0 e 5:");
        Navaliacao += n.nextInt();
        numAvaliacoes++;
    }

    void MediaAvaliacoes(){
        System.out.println(avaliacao());
    }

    static void main(String args[]){
        Musica musica1 = new Musica();

        System.out.print("Digite o nome da música: ");
        musica1.titulo = n.nextLine();
        System.out.print("Digite o nome do artista de " + musica1.titulo + ": ");
        musica1.artista = n.nextLine();
        System.out.print("Digite a data de lançamento de " + musica1.titulo + ": ");
        musica1.anoLancamento = n.nextLine();
        musica1.AvaliarMusica();
        musica1.MediaAvaliacoes();
        musica1.FichaTecnica();
    }
}
