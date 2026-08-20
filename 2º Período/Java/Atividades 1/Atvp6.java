import java.util.Scanner;

public class Atvp6 {
    public static void main(){
        Scanner n = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = n.nextInt();
        int i;
        int fat = 1;

        for (i = num; i >= 1; i--) {
            fat *= i;
        }

        System.out.println("Fatorial do número: " + fat);
    }
}
