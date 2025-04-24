import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Declaração de variáveis
        double cel, fah;
        int op;

        // Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
            System.out.println("\n\t\t\t -- Conversor de Temperatura --\n");

            // Menu
            System.out.println("1 - De Celsius para Fahrenheit");
            System.out.println("2 - De Fahrenheit para Celsius");
            System.out.println("3 - Sair");

            // Opção do usuário
            System.out.print("\nOpção: ");
            op = entrada.nextInt();

            if (op == 1) {
                // Entrada
                System.out.print("Informe a temperatura em °C: "); 
                cel = entrada.nextDouble();

                // Processamento
                fah = cel * 9 / 5 + 32;

                // Saída
                System.out.println("\n" + cel + "°C = " + fah + "°F\n");
                
            } else if (op == 2) {
                // Entrada
                System.out.print("Informe a temperatura em °F: ");
                fah = entrada.nextDouble();

                // Processamento
                cel = (fah - 32) * 5 / 9;

                // Saída
                System.out.println("\n" + fah + "°F = " + cel + "°C\n");

                //saída 3
              } else if (op == 3) {
                // Entrada
                System.out.print("Programa encerrado.");
            }
              
    }
  }
