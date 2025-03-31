package objeto;

public class Gato {
	
	 String nome;
	 int idade;
	 String cor;
	 String raca;
	
	
	public void Andar(){
		System.out.println("Andoando no muro!");
	}

	public void Miar(){
		System.out.println("Miauuuu");
	}

	public void Pular(){
		System.out.println("Subindo na mesa");
	}

	public void Comer(){
		System.out.println("Comendo a ração");
	}
	
	public void Dormir(){
		System.out.println("Dormiu em cima do micro-ondas");
	}
	
	public void Vizualizar() {
		System.out.println("\nNome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Cor " + cor);
		System.out.println("Raça " + raca);
	}

}
