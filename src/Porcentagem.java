public class Porcentagem {
    public static void main (String[] args) {
        float value = 2500.00F;
        float percent = 30;

        value = 3000.00F;


        float count = value * (percent / 100);
        String resultado = String.format("%.2f", count);

        value = 3000f;

        System.out.println("Valor do salário: " + value);
        System.out.println("Valor da Porcentagem: " + percent);
        System.out.println("Resultado formatado → R$ " + resultado);


    }
}
