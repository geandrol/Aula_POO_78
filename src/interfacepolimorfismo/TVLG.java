package interfacepolimorfismo;

public class TVLG implements ControleRemoto {

   private boolean ligado = false;
   private int canalAtual = 1;
   
   @Override
   public void ligar() {
	   ligado = true;
	   System.out.println("TV LG ligada.");
   }
   
   @Override
   public void desligar() {
	   ligado = false;
	   System.out.println("TV LG desligada.");
   }
   
   @Override
   public void mudarCanal(int canal) {
	   if(ligado) {
		   canalAtual = canal;
		   System.out.println("TV LG mudando para o canal: " + canalAtual);
	   }else {
		   System.out.println("TV LG está desligada.");
	   }
	   
   }
   
	
}
