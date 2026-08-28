package Atividades_Classes;
class Calculadora {
    String marca;
    String tipo;
    int numeroOperacoes;
    int numeroTeclas;
    String modelo;
    String cor;
    
    double soma(double n1, double n2){
        double result = n1 + n2;
        return result;
    }

    double Soma(double n1, double n2){
        return n1 + n2;
    }

    void somma(double n1, double n2){
        System.out.println(n1 + n2);
    }

    double dobra(double valor){
        return 2*valor;
    }
}

class Principal {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        c1.marca = "Casio";
        c1.tipo = "Padrão";
        c1.numeroOperacoes = 2;
        System.out.println(c1.soma(2, 3.5));
        System.out.println(c1.dobra(4.5));
    }
}