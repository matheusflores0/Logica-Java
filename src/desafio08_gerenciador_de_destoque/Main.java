package desafio08_gerenciador_de_destoque;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String item;
        System.out.println("== LISTA DE COMPRAS COM (ARRAY) ==");
        System.out.println("======================================");
        System.out.println("Para encerrar digite: Sair. ");
        System.out.println("Para Tirar o item da lista digite: Remover. ");
        System.out.println("Para limpar a lista digite: Limpar. ");
        System.out.println("======================================");
        while(true){
            System.out.print("Digite um produto: ");
            item = scanner.nextLine();
            if(item.equalsIgnoreCase("Sair")) {
                System.out.println("Lista encerrada.");
                break;
                // 2. Checa se quer REMOVER o último
            }else if(item.equalsIgnoreCase("Remover")) {
                if (!lista.isEmpty()) {
                    lista.remove(lista.size() - 1);
                    System.out.println("🗑️ Último item removido!");
                } else {
                    System.out.println("⚠️ Nada para remover, a lista está vazia.");
                }
            }
            // 3. Checa se quer LIMPAR tudo
            else if(item.equalsIgnoreCase("Limpar")){
                lista.clear();
                System.out.println("🧹 Lista limpa com sucesso!");
            }else{
                lista.add(item);
                System.out.println("✅ " + item + " adicionado com sucesso!");
                System.out.println("Total de itens na lista: " + lista.size());
            }
        }//while
        System.out.println("\nITENS ADICIONADOS");
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("%d. %s \n", (i + 1), lista.get(i));
            System.out.println("------------------------------------");
        }
    }
}