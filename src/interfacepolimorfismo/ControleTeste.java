package interfacepolimorfismo;

public class ControleTeste {

	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		Sapinho sapinho = new Sapinho();
		
		carrinho.mover();
		carrinho.mover(50);
		sapinho.mover(5);		

	}

}
