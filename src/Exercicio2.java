import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuario que digite o primeiro numero
        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();

        // Solicita ao usuário que digite o segundo numero
        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();

        // Solicita ao usuario que escolha uma operaçao
        System.out.println("Escolha uma operaçao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subt");
        System.out.println("3 - Mult");
        System.out.println("4 - Div");
        System.out.print("Digite o numero da operaçao desejada: ");
        int escolha = scanner.nextInt();

        // Variavel para armazenar o resultado da operaçao
        int resultado = 0;

        // Realiza a operação escolhida e imprime o resultado
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da Subt: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da Mult: " + resultado);
                break;
            case 4:
                resultado = (int) numero1 / numero2;
                    System.out.println("Resultado da Div: " + resultado);
                break;
            default:
                System.out.println("Opçao invalida.");
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
