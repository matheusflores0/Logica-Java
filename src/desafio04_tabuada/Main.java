package desafio04_tabuada;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== TABUADA INTERATIVA ==");
        System.out.println("================================");
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            int resultado = num * i;
            System.out.printf("%d x %d = %d \n", num, i, resultado);
        }
    }
}
