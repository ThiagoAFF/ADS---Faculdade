package Período_2.Java.outros;

import java.util.Scanner;
import java.util.random.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.print("Entre 1 e 4, quantos jogadores vão participar: ");
        int numero = esc.nextInt();
        esc.nextLine();

        List<Jogador> jogadorList = new ArrayList<>();

        for(int i = 1; i <= numero; i++){
            System.out.print("Jogador " + i + " Digite seu nome: ");
            String nome = esc.nextLine();

            Jogador jogador = new Jogador(nome, i, i, numero, i);

            System.out.print("""
                    Escolha sua classe:
                    1 - Guerreiro
                    2 - Arqueiro
                    3 - Mago
                    4 - Tank

                    Escolha: 
                    """);
            
            int escolha = esc.nextInt();
            
            if (escolha == 1) {
                
            }
        }

        esc.close();
    }
}
