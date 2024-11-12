package conta;

public class Conta {

	private String titular;
	private int numeroConta;
	private int agencia;
	private int tipo;
	private float saldo;

	public Conta(String titular, int numeroConta, int agencia, int tipo, float saldo) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.tipo = tipo;
		this.saldo = saldo;
	}

}
