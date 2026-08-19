import java.util.Scanner;

public class Atvp1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = num.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        }
    }
}