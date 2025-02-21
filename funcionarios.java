import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de Informação de Empresa X
        System.out.println(" Sistema de Informação da Empresa X");

        // Declaração de Variáveis
        String nome;
        double salário;
        double total;

        // Processamento
        System.out.println("Insira seu nome completo");
        nome = input.nextLine();
        System.out.println("Informe o salário do funcionário");
        salário = input.nextDouble();
        if (salário >= 5000) {

            // Saída se o funcionário ganhar mais de R$5000
            System.out.print("juros:" + (salário - salário * 0.8));
            System.out.println(" Salário Total: " + salário * 0.8);
        } else {

            // Saída se o funcionário ganhar menos de R$5000
            System.out.println("Você não precisa pagar imposto");
        }
    }
}
