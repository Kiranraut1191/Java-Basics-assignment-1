package assignment1;

	import java.util.Scanner;

	public class GreatestNum6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three numbers
	        System.out.print("Enter three numbers separated by spaces: ");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        double num3 = scanner.nextDouble();

	        // Calculate the greatest number using Math.max()
	        double greatest = Math.max(num1, Math.max(num2, num3));
	        
	        scanner.close();

	        // Print the greatest number
	        System.out.println("The greatest number is: " + greatest);
	    }
	}

