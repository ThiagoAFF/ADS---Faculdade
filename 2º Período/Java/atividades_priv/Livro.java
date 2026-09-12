package atividades_priv;

public class Livro {
    private String titulo;
    private String autor;

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    //Método
    public void exibirDetalhes(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
    }
}
