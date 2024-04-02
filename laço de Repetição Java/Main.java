import java.util.Scanner;


public class Main
{
  public static void main (String[]args)
  {
	Scanner teclado = new Scanner (System.in);

	int numero = 20;

	while (numero != 10){
		System.out.println("Digite um nC:mero");
		numero = teclado.nextInt();


		if(numero == 10)
		  {
			System.out.println("Voce Acertou");
		  }
		else
		  {
			System.out.println("Voce errou");
		  }
         }


    teclado.close();
  }
}
