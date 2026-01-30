import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double first, second;
        String op;

        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        System.out.print("Enter number of times to perform the operation: ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            double result;

            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result: " + result);
                case "-":
                    result = first - second;
                    System.out.println("Result: " + result);
                case "*":
                    result = first * second;
                    System.out.println("Result: " + result);
                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    System.out.println("Invalid Operator");
            }
        }
    }
}
