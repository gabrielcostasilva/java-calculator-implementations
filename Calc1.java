import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc1 {

    public static void main(String arg[]) {
        String x = "";
        String y = "";
        String operador = "";
        int result = 0;

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        System.out.println("\nDigite o  primeiro valor: ");
        try {
            x = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro!");
        }

        System.out.println("\n || MENU DE OPERACOES || ");
        System.out.println("\n 1 - SOMA \n 2 - SUBTRACAO \n 3 - DIVISAO \n 4 - MULTIPLICACAO ");

        System.out.println("\nDigite o  numero da operacao: ");
        try {
            operador = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro!");
        }

        System.out.println("\nDigite o  segundo valor: ");
        try {
            y = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro!");
        }

        int v1 = Integer.parseInt(x);
        int v2 = Integer.parseInt(y);
        int op = Integer.parseInt(operador);

        switch (op) {
            case 1:
                result = v1 + v2;
                System.out.println("\n\nResultado: " + result);
                break;
            case 2:
                result = v1 - v2;
                System.out.println("\n\nResultado: " + result);
                break;
            case 3:
                result = v1 / v2;
                System.out.println("\n\nResultado: " + result);
                break;
            case 4:
                result = v1 * v2;
                System.out.println("\n\nResultado: " + result);
                break;
            default:
                System.out.println("\n\n ERRO! NUMERO DA OPERACAO NAO CADASTRADO!!");
        }

    }
}