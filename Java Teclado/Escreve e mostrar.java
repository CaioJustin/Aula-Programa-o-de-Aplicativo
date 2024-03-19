import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cadastre o Produto");

        String produto = teclado.next();

        System.out.println("Informe a quantidade");

        int quantidade = teclado.nextInt();

        System.out.println("Informe o preço");

        float preco = teclado.nextFloat();

        teclado.close();

        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
}
