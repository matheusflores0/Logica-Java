package desafio06_lista_de_compra;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[5];
        System.out.println("== CADASTRO DE INTENS ==");
        System.out.println("===========================");
        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o º%d item: ", (i +1));
            lista[i] = scanner.nextLine();
        }
        System.out.print("\n SUA LISTA DE COMPRAS");
        for(int i = 0; i < 5; i++){
            System.out.printf("\n %d: %s ", (i+1), lista[i]);
        }
    }
}
