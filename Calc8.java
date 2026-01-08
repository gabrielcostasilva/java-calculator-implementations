public class Calc8 {

    public static void main(String[] args) {

        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[2]);

        double result = switch (args[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "x" -> a * b;
            case "/" -> b == 0 ? Double.NaN : a / b;
            default -> 0;
        };

        System.out.println(result);
    }
}