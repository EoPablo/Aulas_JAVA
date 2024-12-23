import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 2259.20) {
            System.out.println("Isento");
        } else if (salario >= 2259.21 && salario <= 2826.65) {
            System.out.println("7,5%");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15,0%");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22,5%");
        } else {
            System.out.println("27,5%");
        }

        scanner.close();
    }
}
