import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário que digite a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Fecha o scanner para liberar os recursos
        scanner.close();

        // Imprime a saudação com o nome e a idade
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}
