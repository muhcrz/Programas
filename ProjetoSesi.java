import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de Informação SESI
        System.out.println(" Sistema de Informação SESI");

        // Declaração de Variáveis
        String nome;
        double nota;

        // Entrada
        System.out.println("Informe o nome do estudante");
        nome = input.nextLine();
        System.out.println("Informe a nota do Estudante");
        nota = input.nextDouble();
        if (nota >= 50) {

            // Saída se o aluno for aprovado
            System.out.println("Parabéns, você foi aprovado");
        } else {

            // Saída se o aluno for reprovado
            System.out.println(" Reprovado ");
        }
    }
}
