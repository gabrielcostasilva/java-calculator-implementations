import java.util.Scanner;

public class Calc4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int operacao = 0;
        int resultado = 0;

        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("escolha a operação que deseja realizar");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");

        operacao = entrada.nextInt();

        if (operacao == 1) {
            resultado = numero1 + numero2;
        }
        if (operacao == 2) {
            resultado = numero1 - numero2;
        }
        if (operacao == 3) {
            resultado = numero1 * numero2;
        }
        if (operacao == 4) {
            resultado = numero1 / numero2;
        }

        System.out.printf(" O resultado é %d \n", resultado);

    }

}