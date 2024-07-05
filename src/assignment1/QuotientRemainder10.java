package assignment1;

	import java.util.Scanner;

	public class QuotientRemainder10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the dividend and divisor
	        System.out.print("Enter the dividend: ");
	        int dividend = scanner.nextInt();
	        System.out.print("Enter the divisor: ");
	        int divisor = scanner.nextInt();

	        // Calculate quotient and remainder
	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;

	        // Print the quotient and remainder
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	        scanner.close();
	    }
	}

