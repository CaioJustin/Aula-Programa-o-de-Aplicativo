package aplicacao;

public class Produto {

	public String product;
	public double quantidade;
	public double preco ;
	public String varial;
	public String venda;
	
	public  void addproduct(int estoque) {
		this.quantidade+=estoque;
	}
	
	public void sellproduct(int estoque) {
		this.quantidade-=estoque;
	}
	
}
