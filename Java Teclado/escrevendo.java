import java.util.Scanner;

public class Main{
    public static void main(String[]angs){
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Cadastre o Produto");
        
        String produto=teclado.next();
        
        System.out.println("Informe a quantidade");
        
        int quantidade= teclado.nextInt();
        
        System.out.println("Informe a Preço");
        
        float preco=teclado.nextFloat();
        
        teclado.close();
    
        
    }
    
}