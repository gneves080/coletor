import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== VERIFICADOR DE IDADE =====");
        System.out.print("Digite sua idade: ");

        int idade = Integer.parseInt(scanner.nextLine());

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos e é maior de idade.");
        } else {
            System.out.println("Você tem " + idade + " anos e é menor de idade.");
        }

        scanner.close();
    }
}