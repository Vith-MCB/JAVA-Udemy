import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;
        double b = 3.14;
        String name = "John";

        System.out.println("Hello, " + name + "!");

        int sum = a + 10;
        double product = a * b;
        int quotient = a / 2;
        int remainder = a % 2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        if (a > 0) {
            System.out.println("a is positive.");
        } else if (a < 0) {
            System.out.println("a is negative.");
        } else {
            System.out.println("a is zero.");
        }

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

        int result = addNumbers(a, userInput);
        System.out.println("Result of adding a and userInput: " + result);

        // Assignment Operator
        int x = 10;
        int y = 5;
        x += y; // Equivalent to x = x + y
        System.out.println("x after using the assignment operator: " + x);

        // Equality Operator
        boolean isEqual = (a == userInput);
        System.out.println("Are 'a' and 'userInput' equal? " + isEqual);

        // Ternary Operator
        String message = (a > userInput) ? "a is greater" : "userInput is greater";
        System.out.println(message);

        // Operator Precedence
        int expression = 2 + 3 * 4; // Multiplication takes precedence
        System.out.println("Result of 2 + 3 * 4: " + expression);

        // Operator Challenge
        int challengeResult = challengeOperation(5, 7, 2);
        System.out.println("Operator Challenge Result: " + challengeResult);

        scanner.close();

        // For Loop
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop Example:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop Example:");
        int choice;
        do {
            System.out.println("Enter 1 to continue or 0 to exit: ");
            choice = scanner.nextInt();
        } while (choice != 0);

        scanner.close();

    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int challengeOperation(int a, int b, int c) {
        int result = (a * b) + (b / c) - (a % c);
        return result;
    }



}