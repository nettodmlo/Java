import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator.");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.divide(num1, num2);
                    break;
                case 4:
                    result = calculator.multiply(num1, num2);
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
