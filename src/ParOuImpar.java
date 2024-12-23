import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para entrada.

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("O número: " + number +" é par!");
        } else {
            System.out.println("O número: " + number +" é ímpar!");
        }

        scanner.close(); // Fecha o scanner
    }
}
