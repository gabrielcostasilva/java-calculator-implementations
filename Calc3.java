import java.util.List;
import java.util.Scanner;

public class Calc3 {
    public static void main(String[] argv) {
        int operacao, i;
        Scanner scn = new Scanner(System.in);
        for (i = 0; i < 2; i++) {
            i = 0;
            System.out.println("Escolha uma das 4 operacoes disponiveis:\n");
            System.out.println("1 - Soma\n");
            System.out.println("2 - Subtracao\n");
            System.out.println("3 - Multiplicacao\n");
            System.out.println("4 - Divisao\n");
            System.out.println("0 - Sair da Calculadora\n");
            operacao = Integer.parseInt(scn.next());
            if (operacao == 0) {
                break;
            } else if (operacao == 1) {
                var valores = getNumbers();
                System.out.println("Soma = " + (valores.get(0) + valores.get(1)));
            } else if (operacao == 2) {
                var valores = getNumbers();
                System.out.println("Subtracao = " + (valores.get(0) - valores.get(1)));
            } else if (operacao == 3) {
                var valores = getNumbers();
                System.out.println("Multiplicacao = " + (valores.get(0) * valores.get(1)));
            } else if (operacao == 4) {
                var valores = getNumbers();
                System.out.println("Divisao = " + (valores.get(0) / valores.get(1)));
            }
        }
    }

    public static List<Double> getNumbers() {
        Scanner scn = new Scanner(System.in);
        double valor1, valor2;
        System.out.println("Digite um valor:\n");
        valor1 = Double.parseDouble(scn.next());
        System.out.println("Digite o proximo valor:\n");
        valor2 = Double.parseDouble(scn.next());

        return List.of(valor1, valor2);
    }
}