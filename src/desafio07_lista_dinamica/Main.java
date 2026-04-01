package desafio07_lista_dinamica;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("== LISTA DE COMPRAS COM (ARRAY) ==");
        System.out.println("======================================");
        String item;
        while(true){
            System.out.print("Digite um produto (ou 'Sair' para encerrar): ");
            item = scanner.nextLine();
            if(item.equalsIgnoreCase("Sair")){
                System.out.println("Lista encerrada.");
                break;
            }//if
            lista.add(item);
            System.out.println("✅ " + item + " adicionado com sucesso!");
            System.out.println("Total de itens na lista: " + lista.size());
        }//while
        System.out.println("\nITENS ADICIONADOS");
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("%d. %s \n", (i + 1), lista.get(i));
            System.out.println("------------------------------------");
        }
    }
}
