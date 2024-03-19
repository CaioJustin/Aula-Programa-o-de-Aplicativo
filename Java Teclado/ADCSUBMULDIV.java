
import java.util.Scanner;
public class Main{
    public static void main(String[]args){


        Scanner Teclado=new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero");

        int num = Teclado.nextInt();


        System.out.println("Digite o Segundo Numero");

        int num2=Teclado.nextInt();


        System.out.println("A Soma e :"+(num+num2));

        System.out.println("A Subtração e :"+(num-num2));

        System.out.println("A Multiplicação e:"+(num*num2));

        System.out.println("A Divisão e :"+(num/num2));



        Teclado.close();
    }
}