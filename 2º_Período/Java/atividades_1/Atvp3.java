import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Atvp3 {
    public static void main(){
        
        Scanner choice = new Scanner(System.in);

        String menu = """
                Menu
                1. Calcular área de quadrado
                2. Calcular área do círculo

                Escolha:  """;

        System.out.print(menu);
        int esc = choice.nextInt();

        switch (esc) {
            case 1:
                System.out.print("Digite o tamanho do lado do quadrado: ");
                float l = choice.nextInt();

                System.out.print("Área do quadrado: " + l*l);
                break;
            case 2:
                System.out.print("Digito o valor do raio do círculo: ");
                float r = choice.nextInt();

                System.out.println("Área do círculo: " + 3.14*(r+r));
                break;
        }
    }
}
