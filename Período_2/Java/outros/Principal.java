package Período_2.Java.outros;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.print("Entre 2 e 4, quantos jogadores vão participar: ");
        int numero = esc.nextInt();
        esc.nextLine();

        if (numero < 2 || numero > 4) {
            System.err.println("A quantidade deve estar entre 2 e 4 jogadores!");
            esc.close();
            return;
        }

        List<Jogador> jogadorList = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            System.out.print("Jogador " + i + " Digite seu nome: ");
            String nome = esc.nextLine();

            Jogador jogador = new Jogador(nome, i, i, numero, i);

            int escolha;
            do {
                System.out.print("""
                        Escolha sua classe:
                        1 - Guerreiro
                        2 - Arqueiro
                        3 - Mago
                        4 - Tank

                        Escolha:
                        """);
                escolha = esc.nextInt();
                esc.nextLine();
                if (escolha < 1 || escolha > 4) {
                    System.out.println("Escolha inválida. Digite uma opção de 1 a 4.");
                }
            } while (escolha < 1 || escolha > 4);
            
            switch (escolha) {
                case 1:
                    jogador.setNome(nome);
                    jogador.setHP(100);
                    jogador.setCON(10 + (int) (Math.random() * 7) + 1);
                    jogador.setFOR(12 + (int) (Math.random() * 10) + 1);
                    jogador.setDEX(8 + (int) (Math.random() * 5) + 1);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                
                case 2:
                    jogador.setNome(nome);
                    jogador.setHP(80);
                    jogador.setCON(8 + (int) (Math.random() * 5) + 1);
                    jogador.setFOR(10 + (int) (Math.random() * 5) + 1);
                    jogador.setDEX(12 + (int) (Math.random() * 10) + 1);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;

                case 3:
                    jogador.setNome(nome);
                    jogador.setHP(75);
                    jogador.setCON(8 + (int) (Math.random() * 4) + 1);
                    jogador.setFOR(8 + (int) (Math.random() * 3) + 1);
                    jogador.setDEX(10 + (int) (Math.random() * 10) + 1);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;

                case 4:
                    jogador.setNome(nome);
                    jogador.setHP(125);
                    jogador.setCON(12 + (int) (Math.random() * 10) + 1);
                    jogador.setFOR(10 + (int) (Math.random() * 5) + 1);
                    jogador.setDEX(8 + (int) (Math.random() * 3) + 1);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                    
                default:
                    break;
            }

            jogadorList.add(jogador);
        }

        System.out.println("\nJogadores criados:");
        for (Jogador jogador : jogadorList) {
            System.out.printf("%s - HP: %.0f, FOR: %d, DEX: %d, CON: %d%n",
                    jogador.getNome(), jogador.getHP(), jogador.getFOR(),
                    jogador.getDEX(), jogador.getCON());
        }

        NPC orc = new NPC("Orc", 1000, 20, 30, 10);
        System.out.printf("%nBOSS! %s aparece. HP: %.0f, FOR: %d, DEX: %d, CON: %d%n",
            orc.getNome(), orc.getHP(), orc.getFOR(), orc.getDEX(), orc.getCON());
            
        esc.close();
    }
}
