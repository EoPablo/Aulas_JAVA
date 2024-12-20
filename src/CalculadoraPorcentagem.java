public class CalculadoraPorcentagem {
    public static void main(String[] args) {
        float salario = 1800F;
        float resultado = 0F;
        String porcentagem = "";

        if(salario > 4500){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println(String.format("O valor é → R$ %.2f (%s do salário)", resultado, porcentagem));
    }
}
