package conta;

public class Conta {

	/* Atributos da Classe Conta */
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	/*Método Construtor da Classe Conta - com todos os parâmetros*/
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void visualizar() {
		System.out.println("Numero: "+ numero);
		System.out.println("Agencia: "+ agencia);
		System.out.println("Tipo : "+ tipo );
		System.out.println("Titular : "+ titular );
		System.out.println("Saldo : "+ saldo );
	}

}
