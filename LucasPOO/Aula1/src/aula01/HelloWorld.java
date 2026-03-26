package aula01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		// biblioteca para leitura de dados.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("DIgite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("DIgite a sua idade?");
		int idade = scanner.nextInt();
		
		System.out.print("Digite o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Seu nome é " + nome);
		System.out.println("A sua idade é " + idade);
		System.out.println("Seu peso é " + peso);

		
	}

}
