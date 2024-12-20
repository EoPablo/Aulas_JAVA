public class CalculadoraPorcentagem {
    public static void main(String[] args) {
        float salario = 1600F;
        if(salario > 4500){
            float percent = salario * 0.3F;
            String resultadoFormatado = String.format("%.2f", percent);
            System.out.println("30% é → R$ " + resultadoFormatado);
        } else {
            float percent = salario * 0.15F;
            String resultadoFormatado = String.format("%.2f", percent);
            System.out.println("15% é → R$ " + resultadoFormatado);
            System.out.println("TESTE");
        }
    }
}
