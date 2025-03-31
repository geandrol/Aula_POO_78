package herancapolimorfismo;

public class MenuTeste {

	public static void main(String[] args) {

          Carro carro = new Carro("Fusca",10,300,18,"SPC-333",216545132);
          Barco barco = new Barco("Wally",5, 150, "deslocamento", false);
          
          carro.visualizar();
          barco.visualizar();

	}

}

