package herancapolimorfismo;

public abstract class Transporte {

	private String marca;
	private int capacidade;
	private int velocidade;
	
	public Transporte(String marca, int capacidade, int velocidade) {
		this.marca = marca;
		this.capacidade = capacidade;
		this.velocidade = velocidade;
	}

	public Transporte() {
	
	}



	public String getNome() {
		return marca;
	}

	public void setNome(String marca) {
		this.marca = marca;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	public void visualizar() {

		System.out.println("\n\n************************************************************");
		System.out.println("Dados do Meio de Transporte:");
		System.out.println("****************************************************************");
		System.out.println("Marca: " + this.marca);
		System.out.println("Número de passageiros: " + this.capacidade);
		System.out.println("Limite " + this.velocidade + "Km de velocidade. " );

	}

	
	
	

}
