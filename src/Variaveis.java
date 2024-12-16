public class Variaveis {
    public static void main (String[] args) {
        double salario = 3500;
        double soma = salario * 0.3;
        String formatado = String.format("%.2f", soma);


        System.out.println("30% é → R$ " + formatado);


        soma = salario * 0.15;
        formatado = String.format("%.2f", soma);
        System.out.println("15% é → R$ " + soma);

        soma = salario * 0.05;
        formatado = String.format("%.2f", soma);
        System.out.println("5% é → R$ " + soma);
    }
}
