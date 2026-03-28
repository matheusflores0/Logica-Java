package desafio01_controle_acesso;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("== CONTROLE DE ACESSO ==");
        System.out.println("============================");

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.printf("%s você tem %d. \n", name, age);
            System.out.println("Entrada Proibida!");
        }else if(age >= 18 && age <= 60){
            System.out.printf("%s você tem %d. \n", name, age);
            System.out.println("Acesso liberado!");
        }else{
            System.out.printf("%s você tem %d. \n", name, age);
            System.out.println("Acesso Prioritario!");
        }
    }
}
