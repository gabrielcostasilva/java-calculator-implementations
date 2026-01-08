import java.util.Scanner;

public class Calc9 {

    public static void main(String[] args) {
        double n1, n2, soma, sub, mult, div;
        int op;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = entrada.nextDouble();

        System.out.println("####OPERACOES####");
        System.out.println("[1]- Soma");
        System.out.println("[2]- Subtracao");
        System.out.println("[3]- Multiplicacao");
        System.out.println("[4]- Divisao");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                soma = n1 + n2;
                System.out.println("Resultado: " + soma);
                break;

            case 2:
                sub = n1 - n2;
                System.out.println("Resultado: " + sub);
                break;

            case 3:
                mult = n1 * n2;
                System.out.println("Resultado: " + mult);
                break;

            case 4:
                if (n1 < n2) {
                    System.out.println("Impossivel realizar o calculo");
                } else {
                    div = n1 / n2;
                    System.out.println("Resultado: " + div);
                }
                break;

            default:
                System.out.println("Operacao invalda");
                break;
        }

    }

}