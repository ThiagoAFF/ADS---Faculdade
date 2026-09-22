public class Pessoa{
    private String nome;
    private int idade;
    private String genero;

    // Construtor(es)
    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public Pessoa(){}

    public Pessoa(String nome){
        this(nome, 0, null)
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}