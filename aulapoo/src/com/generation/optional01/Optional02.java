package com.generation.optional01;

import java.util.Optional;

public class Optional02 {

	public static void main(String[] args) {
		
		String[] frases = new String[5];
		
		frases[2] = "Generation Brasil";
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("\nExibir Optional vazio: " + optionalVazio);
		System.out.println("\nOptional vazio está vazio? " + optionalVazio.isEmpty());
		
		Optional<String> valor_indice_02 = Optional.of(frases[2]);
		System.out.println("\nExibir valor do índice 2: " + valor_indice_02);
		System.out.println("\nObter o conteúdo do valor do índice 2: " + valor_indice_02.get());
		System.out.println("\nValor do índice 2 está presente? " + valor_indice_02.isPresent());

	}

}
