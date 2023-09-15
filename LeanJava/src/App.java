import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // selection short
        new SelectionShort().performSelectionShortAndFindBiggestNumber();

        // Making a calculator
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("\n\n1Welcome to the scientic calculator!");
        boolean continueCalculator = true;

        while (continueCalculator) {
            System.out.println("\nAvailable Operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Exit");

            System.out.println("Enter the operation number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator.performOperation(new Addition());
                    break;
                case 2:
                    calculator.performOperation(new Subtraction());
                    break;
                case 3:
                    calculator.performOperation(new Multiplication());
                    break;
                case 4:
                    calculator.performOperation(new Division());
                    break;
                case 5:
                    calculator.performOperation(new SquareRoot());
                    break;
                case 6:
                    calculator.performOperation(new Exponentiation());
                    break;
                case 7:
                    continueCalculator = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try agian");
            }
        }
        System.out.println("Thank you for using the Scientific Calculator.");
    }

}
