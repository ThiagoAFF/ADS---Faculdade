import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Atvp3 {
    public static void main(){
        
        Scanner choice = new Scanner(System.in);

        String menu = """
                Menu
                1. Calcular área de quadrado
                2. Calcular área do círculo
                """;

        System.out.print(menu);
        int esc = choice.nextInt();

        switch (esc) {
            case 1:
                
        }
    }
}
