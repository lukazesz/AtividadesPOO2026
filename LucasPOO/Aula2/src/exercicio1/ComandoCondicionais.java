package exercicio1;

import java.util.Scanner;

public class ComandoCondicionais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		int idade = scanner.nextInt();
		
		if (((idade % 2) == 0) && (idade < 100)) {
			System.out.println("A");
		} else if (((idade % 2) == 0) && (idade >= 100)) {
			System.out.println("B");
		} else if (((idade % 2) != 0) && (idade < 100)) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		scanner.close();
	}
};
