import java.util.Scanner;

public class Atvp2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite 1º número: ");
        int n1 = num.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = num.nextInt();

        if (n1 == n2) {
            System.out.println("Ambos números são iguais.");
        } else if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }
    }
}
