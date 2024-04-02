import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        
        Scanner Teclado=new Scanner(System.in);
        
        int nunotas=4;
        double somanotas=0;
        
        for (int i=1;i <=nunotas ;i++ ) {
            
            System.out.printf("Digite a "+i+" Nota do Aluno: ");
            double nota =Teclado.nextDouble();
            
            somanotas+=nota;
        }
        
        System.out.println("A Soma das nota e :"+somanotas);
        
        double media =somanotas/nunotas;
        
        System.out.println("A Media do aluno e :"+media);
        
        if(media >= 7){
        
        System.out.println("Aprovado");
    }else if (media < 7 && media >= 4){
        
        System.out.println("recuperação");
    }else{
        
        System.out.println("Reprovado");
    }
    Teclado.close();
        
    }
    
    
    
}