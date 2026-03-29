package desafio05_caixa_eletronico;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== SISTEMA BÁNCARIO ==");
        System.out.println("=============================");
        double saldo = 1000;
        double sacar = 0;
        double deposito = 0;
        int opcao = 0;

        while(opcao != 4){
            try{
                System.out.println("1 - Consulta Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                System.out.println("-----------------------");


                switch(opcao){
                    case 1:
                        System.out.printf("Saldo Atual: R$%.2f \n", saldo);
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser depositado: ");
                        deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.printf("Deposito: R$%.2f \n", deposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor a ser sacado: ");
                        sacar = scanner.nextDouble();
                        if(saldo >= sacar){
                            saldo -= sacar;
                            System.out.println("Saque efetuado com sucesso!");
                            System.out.printf("Valor sacado: R$%.2f \n", sacar);
                            break;
                        }else{
                            System.out.println("Saldo insuficiente....");
                            break;
                        }
                    case 4:
                        System.out.println("Encerrando sistema...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: Você deve digitar um número inteiro!");
                scanner.nextLine();
            }
        }//while
        System.out.println("Sistema encerrado.");
    }//main
}//class
