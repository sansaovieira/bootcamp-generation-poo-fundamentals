package operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		int a = 3;
		int x = 4;
		int y = 2;
		int resul;
		
		resul = x * (y + a); 
		
		x += y;
		
		System.out.println("O resultado é: " + resul);
		System.out.println("O resultado é: " + (y + a));
		System.out.println("O resultado é: " + x);
		
	}

}
