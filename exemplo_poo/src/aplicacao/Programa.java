package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
	
		Produto produto =new  Produto();
		
		System.out.println("Informe o produtor ");
		produto.produto=teclado.next();
		
		System.out.println("Informa quantidade ");
		produto.quantidade=teclado.nextDouble();
		
		System.out.println("Informe o preço ");
		produto.preco=teclado.nextDouble();
		
		
		double valor = produto.preco*produto.quantidade;
		
		
		System.out.println("Concatenação:\n"+"O Nome do Produto e :"+produto.produto+"\nEstoque:"+produto.quantidade+"\nPreço:"+produto.preco);
		
		
		
		
		System.out.println("\nO Valor e :"+valor);
		
		
		System.out.println("\nDeseja inserir mais produtos?");
		int estoque=teclado.nextInt();
		
		produto.addProduto(estoque);
		
		System.out.println("\nAtualização:"+produto.produto+"\nestoque atual:"+produto.quantidade+"\nPreço:"+produto.preco);
		
		System.out.println("Atualmente,alguma venda foi realizada?");
		estoque=teclado.nextInt();
		
		produto.subProduto(estoque);
		
		System.out.println("\nAtualizado pos venda:"+produto.produto+"\nestoque atual:"+produto.quantidade+"\npreço:"+produto.preco);
			
			
		
		teclado.close(); 
	}
	
}