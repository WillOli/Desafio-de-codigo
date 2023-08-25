import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lê os valores de entrada:
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor do salário: ");
        float valorSalario = input.nextFloat();
        System.out.print("Valor do benefício: ");
        float valorBeneficios = input.nextFloat();

        float valorImposto = 0;
        // TODO criar as demais condições para as aliquotas de 10.00% e 15.00%
        if(valorSalario >= 0 && valorSalario <= 1100) {
            // Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        }else  {
            valorImposto = 0.15F * valorSalario;
        }
        //Calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        input.close();
    }
}