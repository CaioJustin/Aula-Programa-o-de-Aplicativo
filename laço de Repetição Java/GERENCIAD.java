import java.util.Scanner;
public class Main
{

  public static void main (String[]args)
  {

	
	double soma =0;
	Scanner teclado = new Scanner (System.in);

	  System.out.println ("Digite a quantidade de meses");
	int meses = teclado.nextInt();



	for (int i = 1; i <= meses; i++)
	  {

		System.out.println ("Digite o " + i + " Mes:\n");
		float mes = teclado.nextFloat();

		soma =+mes;
	  }


	System.out.println ("Digite o lote de ReposiC'C#o");
	float lr = teclado.nextFloat();

	System.out.println ("Digite o Tempo de ReposiC'C#o");
	float tr = teclado.nextFloat();

	System.out.println ("Digite o Estoque atual");
	float ea = teclado.nextFloat();

	float media = soma/meses;

	float Vmd = media/25;

	float emin = tr * Vmd;

	float emax = lr + emin;

	teclado.close ();
  }
}
