package atividades_subclasses;


public class Animal{
    void emitirSom(){
        System.out.println();
}
}

class Vaca extends Animal{
     @Override

    void emitirSom(){
         System.out.println("Moo!");
    }

    void ruminar(){
        System.out.println("--Rumina");
    }
}

class Salmao extends Animal{
    @Override

    void emitirSom(){
        System.out.println("Glub!");
    }

    void nadar(){
        System.out.println("--Nada");
    }
}
