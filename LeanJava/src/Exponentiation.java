import java.util.Scanner;

public class Exponentiation implements Operation {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result Exponentiation: " + result);
    }

}
