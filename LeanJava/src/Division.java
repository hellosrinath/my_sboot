import java.util.Scanner;

public class Division implements Operation {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the divident: ");
        double divident = scanner.nextDouble();
        System.out.println("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = divident / divident;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }

}
