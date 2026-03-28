package desafio02_calculo_desconto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("== Calculandor de Descontos ==");
        System.out.println("============================");

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();
        System.out.print("Digite o valor unitário: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade de produto: ");
        int quantidade = scanner.nextInt();
        double valorTotal = preco * quantidade;
        double desconto = 0;
        if (valorTotal > 100){
            desconto = valorTotal * 0.10;
            valorTotal = valorTotal - desconto;
            System.out.printf("Produto: %s \n", produto);
            System.out.printf("Preço: R$%.2f%s \n", preco);
            System.out.printf("Desconto aplicado: R$%.2f \n", desconto);
            System.out.printf("Valor a pagar: R$%.2f", valorTotal);
        }else{
            System.out.printf("Valor total: %.2f ", valorTotal);
        }
    }
}
