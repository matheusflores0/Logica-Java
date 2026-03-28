package desafio03_calculadora_imc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("== Calculandor de IMC ==");
        System.out.println("============================");

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal.");
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso (Pré-obesidade).");
        }else if(imc >= 30.0 && imc <= 34.9){
        System.out.println("Obesidade Grau I.");
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau II.");
        }else{
            System.out.println("Obesidade Grau III (Mórbida)");
        }
        System.out.printf("Peso: %.2f \n", peso);
        System.out.printf("Altura: %.2f \n", altura);
        System.out.printf("IMC: %.2f", imc);
    }
}
