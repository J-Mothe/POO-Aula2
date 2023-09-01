import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar os numeros inteiros
        int[] numeros = new int[5];

        // Solicita ao usuario que insira os numeros inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero inteiro #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();

        // Imprime os numeros armazenados no array
        System.out.println("Numeros armazenados no array:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero #" + (i + 1) + ": " + numeros[i]);
        }
    }
}
