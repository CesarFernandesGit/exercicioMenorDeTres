import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int primeiroValor, segundoValor, terceiroValor;

		System.out.print("Primeiro valor: ");
		primeiroValor = scanner.nextInt();
		System.out.print("Segundo valor: ");
		segundoValor = scanner.nextInt();
		System.out.print("Terceiro valor: ");
		terceiroValor = scanner.nextInt();

		if (primeiroValor < segundoValor && primeiroValor < terceiroValor) {
			System.out.printf("Dentre os três números, o menor valor é o %d", primeiroValor);
		} else if (segundoValor < terceiroValor) {
			System.out.printf("Dentre os três números, o menor valor é o %d", segundoValor);
		} else {
			System.out.printf("Dentre os três números, o menor valor é o %d", terceiroValor);
		}
		scanner.close();
	}
}
