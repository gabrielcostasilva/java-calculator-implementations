import java.util.Scanner;

public class Calc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double n1, n2;
            Integer op;
            System.out.println("Escola uma opção: \n");
            System.out.println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n0 - Sair\n");
            op = scanner.hasNext() ? Integer.parseInt(scanner.next()) : null;
            if (op == 0) {
                System.out.println("Desligando calculadora...\n");
                break;
            }
            System.out.println("Digite o primeiro valor: \n");
            n1 = scanner.hasNext() ? Double.parseDouble(scanner.next()) : null;
            System.out.println("Digite o segundo valor: \n");
            n2 = scanner.hasNext() ? Double.parseDouble(scanner.next()) : null;

            if (op != null && n1 != null & n2 != null) {
                if (op == 1) {
                    System.out.println("Resultado da Soma: " + getSoma(n1, n2));
                } else if (op == 2) {
                    System.out.println("Resultado da Subtracao: " + getSubtracao(n1, n2));
                } else if (op == 3) {
                    System.out.println("Resultado da Multipliacao: " + getMultiplicacao(n1, n2));
                } else if (op == 4) {
                    System.out.println("Resultado da Multipliacao: " + getDivisao(n1, n2));
                }
            } else {
                System.out.println("Os valores/opcoes não podem ser nulos!\n");
                break;
            }
        }
    }

    private static Double getMultiplicacao(Double n1, Double n2) {
        return (n1 * n2);
    }

    private static Double getDivisao(Double n1, Double n2) {
        return (n1 / n2);
    }

    private static Double getSoma(Double n1, Double n2) {
        return (n1 + n2);
    }

    private static Double getSubtracao(Double n1, Double n2) {
        return (n1 - n2);
    }
}