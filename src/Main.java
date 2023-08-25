import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lê os valores de entrada:
        Scanner input = new Scanner(System.in);
        float valorSalario = input.nextFloat();
        float valorBeneficios = input.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100) {
            // Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        // TODO criar as demais condições para as aliquotas de 10.00% e 15.00%

        //Calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}