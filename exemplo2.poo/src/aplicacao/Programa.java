package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		 
			Scanner teclado = new Scanner(System.in);
		
		
		Produto produto=new Produto();
			
		System.out.println("Informe o Produto:");
		produto.product =teclado.next();
		
		
		System.out.println("Informe a quantidade");
		produto.quantidade=teclado.nextDouble();
		
		System.out.println("informe o Preço");
		produto.preco=teclado.nextDouble();
		
		System.out.println("Deseja Comprar mais Produto");
		produto.varial=teclado.next();
		
		
		
		
		
		
		if (produto.varial.equals("s")) {
		    System.out.println("Quantidade a ser adicionada:");
		    int estoque = teclado.nextInt();
		    produto.addproduct(estoque);
		}
		
		System.out.println("Alguam venda foi realizad");
		produto.venda=teclado.next();
 
		if (produto.venda.equals("s")) {
		    System.out.println("Quantidade a ser retirada:");
		    int estoque = teclado.nextInt();
		    produto.sellproduct(estoque);
		}
		
		
		teclado.close();
		
		
		System.out.println("A Quantidade de  produto e :"+produto.quantidade);
		System.out.println("Valor monetario no estoque;"+produto.preco*produto.quantidade);
		
		
		
	}

}
