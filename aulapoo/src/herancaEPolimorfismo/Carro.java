package herancaEPolimorfismo;

public class Carro extends Transporte {
	
	private int roda;
	private String placa;
	private int chassi;
	
	public Carro(String nome, int capacidade, int velocidade, int roda, String placa, int chassi) {
		super(nome, capacidade, velocidade);
		this.roda = roda;
		this.placa = placa;
		this.chassi = chassi;
	}

	public int getRoda() {
		return roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	@Override
	public void visualizar() {

		System.out.println("\n\n************************************************************");
		super.visualizar();
		System.out.println("Roda: " + this.roda);
		System.out.println("Número da placa: " + this.placa);
		System.out.println("Número do chassi " + this.chassi + "Km de velocidade. ");

	}
	
	
}
