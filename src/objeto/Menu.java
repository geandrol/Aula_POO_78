package objeto;

public class Menu {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
	
		gato1.nome = "dadinho";
		gato1.idade = 5;
		gato1.cor = "laranja";
		gato1.raca = "vira-lata";
		
		gato1.Vizualizar();
	
		System.out.println("\nOque o gato esta fazendo? ");
		gato1.Dormir();
		
	
		System.out.println("\nCadastre outro gato: ");
		gato2.nome = "dadinho";
		gato2.idade = 5;
		gato2.cor = "laranja";
		gato2.raca = "vira-lata";
		
		gato1.Vizualizar();
	
		System.out.println("\nOque o gato2 esta fazendo? ");
		gato1.Miar();

	}

}
