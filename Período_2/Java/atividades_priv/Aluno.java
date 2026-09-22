package atividades_priv;

public class Aluno {
    private String nome;
    private float[] notas;

    //Construtor
    public Aluno(String nome, int quantidadeNotas){
        this.nome = nome;
        this.notas = new float[quantidadeNotas]
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public float[] getNotas(){
        return notas;
    }

    public float getNota(int indice){
        return notas[indice];
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNotas(float[] notas){
        this.notas = notas;
    }

    public void setNota(int indice, float valor){
        notas[indice] = valor;
    }

    //Cálculo de média
    public float calcularMedia(){
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
