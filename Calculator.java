import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, result;
        char op;

        System.out.println("Welcome to simple calculator");
        System.out.print("Enter an operation(+, -, *, /): ");
        op = scanner.next().charAt(0);

        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();

        switch (op) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator");
        }

        scanner.close();
    }
}
