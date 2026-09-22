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

        List<Jogador> jogadorList = new ArrayList<>();

        esc.close();
    }
}
