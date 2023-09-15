import java.util.Scanner;

public class SquareRoot implements Operation {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Square Root: " + result);
        } else {
            System.out.println("Square root is undefined for negative numbers.");
        }
    }

}
