package interfacepolimorfismo;

public class Carrinho implements ControleRemoto, Som {

	    @Override
	    public void mover() {
	        System.out.println("O carrinho está andando.");
	    }

	    @Override
	    public void mover(int velocidade) {
	        System.out.println("O carrinho está andando a " + velocidade + " km/h.");
	    }
	    
	    @Override
	    public void emitirSom() {
	        System.out.println("O carrinho faz: Vruuum Vruuum!");
	    }
	   
   }
   
	

