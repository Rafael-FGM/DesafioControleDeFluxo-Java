import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            try {
                if (primeiroNumero > segundoNumero) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro parâmetro!");
                }

                for (int i = primeiroNumero; i <= segundoNumero; i++) {
                    System.out.println("Imprimindo o número " + i);
                }
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
