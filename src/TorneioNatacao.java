import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        String nome = "Pablo";

        if(idade <= 10 ) {
            System.out.println( nome + " participará da categoria Infantil!");
        } else if (idade >= 11 && idade < 15) {
            System.out.println( nome + " participará da categoria Juvenil!");
        } else if (idade >= 16 && idade < 19) {
            System.out.println( nome + " participará da categoria Pré-Adulto!");
        } else {
            System.out.println( nome + " participará da categoria Adulto!");
        }

        scanner.close();

    }
}
