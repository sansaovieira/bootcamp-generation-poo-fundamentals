package interfacePolimorfismo;

public abstract class TVLG implements ControleRemoto{
	private boolean ligado = false;
	private int canalAtual = 1;
	
	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV LG conectada à internet.");
	}
	
	@Override
	public void mudarCanal(int canalL) {
		
	}
}
