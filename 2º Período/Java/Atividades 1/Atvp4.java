import java.util.Scanner;

public class Atvp4{
    public static void main(){
        Scanner n = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = n.nextInt();

        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}