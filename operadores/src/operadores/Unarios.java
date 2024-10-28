package operadores;

public class Unarios {
	public static void main(String[] args) {
		int x = 10, y = 8;
		
		System.out.println("\nPre Increase: x = ++ y");
		
		x = --y;
		System.out.println("\nValue of X: " +x);
		System.out.println("\nValue of Y: " +y);
	}
}
