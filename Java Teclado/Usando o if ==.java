
import java.util.Scanner;
public class Main{
    public static void main(String[]args){


    float saldo= 5000;
    String nome="lucas Almeida";
    
    
        Scanner Teclado= new Scanner(System.in);
        
        System.out.println("Digite o numero de escolha \n 1 Para mostra saldo \n 2 Para Mostra o usuario Cadastrado \n para transferir para o atendente ");

        float escolha = Teclado.nextInt();
        
        if (escolha ==1) {
            System.out.println("O Saldo Atual e "+saldo);
        }else if(escolha == 2){
            System.out.println("O Usuario Cadastrado e :"+nome);
        }else if(escolha== 3){
            System.out.equals("Transferido para o atendente");
        }
        
    

        Teclado.close();
    }
}