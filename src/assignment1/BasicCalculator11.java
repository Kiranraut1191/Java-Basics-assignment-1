package assignment1;

	import java.util.Scanner;

	public class BasicCalculator11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        // Input operation choice
	        System.out.println("\nOperations:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");
	        System.out.print("Choose operation (1/2/3/4): ");
	        int choice = scanner.nextInt();

	        double result = 0;

	        // Perform the selected operation
	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero!");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation!");
	                break;
	        }

	        scanner.close();
	    }
	}
