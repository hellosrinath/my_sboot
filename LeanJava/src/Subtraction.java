import java.util.Scanner;

public class Subtraction implements Operation {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result of Subtraction: " + result);
    }

}
