package objeto;

public class Menu {

	public static void main(String[] args) {

		Gato gato1 = new Gato();

		System.out.println("\nCadastre o seu gato: ");
		gato1.nome = "Bugadinho";
		gato1.idade = 1;
		gato1.cor = "tricolor";
		gato1.raca = "viralata";

		gato1.Imprimir();

		System.out.println("\nO que é que o gato está fazendo?");

		gato1.Dormir();

		// Gato 2:

		Gato gato2 = new Gato();

		System.out.println("\nCadastre o seu gato: ");
		gato2.nome = "Carniça";
		gato2.idade = 1;
		gato2.cor = "laranja";
		gato2.raca = "vira lata";

		gato1.Imprimir();

		System.out.println("\nO que é que o gato está fazendo?");

		gato2.Miar();
		gato2.Comer();
	}
}
