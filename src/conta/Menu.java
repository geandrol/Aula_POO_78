package conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, 123, 1, "Maria dos Santos", 2500.0f);
		System.out.println("Primeira conta: ");
		c1.visualizar();

		Conta c2 = new Conta(654321, 321, 2, "João da Silva", 2000.0f);
		System.out.println("\nSegunda conta: ");
		c2.visualizar();

		c1.setSaldo(100000.0f);
		c1.setTitular("Maria Joaquina");
		System.out.println("\nPrimeira conta atualizada: ");
		c1.visualizar(); // TODO Auto-generated method stub

	}

}
