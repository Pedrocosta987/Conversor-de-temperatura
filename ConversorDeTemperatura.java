import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;
        double temperatura;
        double resultado;

        System.out.println("==== Conversor de temperatura ====");
        System.out.println("Digite uma opção (1 ou 2): ");
        System.out.println("1. Farenheit para Celsius");
        System.out.println("2. Celsius para Farenheit");
        opcao = leitor.nextInt();

        if (opcao == 1 || opcao == 2){
            System.out.println("Digite o valor da temperatura para conversão: ");
            temperatura = leitor.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = (temperatura - 32) * 5 / 9;
                    System.out.printf("%.2fºF equivalem a %.2fºC%n", temperatura, resultado);
                    break;
                case 2: // Celsius para Fahrenheit
                    resultado = (temperatura * 9 / 5) + 32;
                    System.out.printf("%.2fºC equivalem a %.2fºF%n", temperatura, resultado);
                    break;
            }
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
    }
}

