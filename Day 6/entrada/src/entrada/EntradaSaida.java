package entrada;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade");
		idade = leia.nextInt();
		
		System.out.println("Entre com seu nome");
		leia.skip("\\R?");   
		nome = leia.nextLine();
		
		System.out.println("A sua idade é: " +idade+ " e o seu nome é: " +nome );

	}

}
