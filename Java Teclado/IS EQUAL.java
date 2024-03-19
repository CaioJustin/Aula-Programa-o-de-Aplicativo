import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Digite a operação escolhida entre (+, -, *, /):");
        String operacao = Teclado.next();

        System.out.println("Digite o Primeiro Numero:");
        int num = Teclado.nextInt();

        System.out.println("Digite o Segundo Numero:");
        int num2 = Teclado.nextInt();

        if (operacao.equals("+")) {
            System.out.println("A Soma é: " + (num + num2));
        } else if (operacao.equals("-")) {
            System.out.println("A Subtração é: " + (num - num2));
        } else if (operacao.equals("*")) {
            System.out.println("A Multiplicação é: " + (num * num2));
        } else if (operacao.equals("/")) {
            System.out.println("A Divisão é: " + (num / num2));
        }

        Teclado.close();
    }
}
