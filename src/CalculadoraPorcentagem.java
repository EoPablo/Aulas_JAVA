public class CalculadoraPorcentagem {
    public static void main(String[] args) {
        float salario = 4600F;
        if(salario > 4500){
            double percent = salario * 0.3;
            String resultadoFormatado = String.format("%.2f", percent);
            System.out.println("30% é R$ " + resultadoFormatado);
        } else {
            double percent = salario * 0.15;
            String resultadoFormatado = String.format("%.2f", percent);
            System.out.println("15% é R$ " + resultadoFormatado);
        }
    }
}
