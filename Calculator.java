/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Java Mobile Calculator ===");
        
        // 1. Get first number
        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid number.");
            return;
        }
        double num1 = scanner.nextDouble();
        
        // 2. Get operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // 3. Get second number
        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid number.");
            return;
        }
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        // 4. Calculate logic
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                valid = false;
        }
      
        
        // 5. Print output
        if (valid) {
            System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
  crccreate calculator
  
}
