package Atividades_Classes;

public class Aluno {
    String nome;
    int idade;

    void Infos(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }

    static void main(String args[]){
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Alberto Nogueira";
        aluno1.idade = 15;

        aluno1.Infos();
    }
}
