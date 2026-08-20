import java.util.Scanner;

public class Atvp5 {
    public static void main(){
        Scanner n = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = n.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}
